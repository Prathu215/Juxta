package com.juxta.services;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juxta.DAO.IElectronicsDAO;

import com.juxta.entities.Electronics;

import com.juxta.models.ElectronicsModel;
import com.juxta.repository.ElectronicsRepository;

@Service
public class ElectronicsService {
	Logger logger =Logger.getLogger(ElectronicsService.class);

	@Autowired
	private ElectronicsRepository electronicsRepository;

	@Autowired
	private IElectronicsDAO iElectronicsDAO;

	public List<Electronics> getElectronics() {
		logger.info(this.electronicsRepository.findAll());
		return this.electronicsRepository.findAll();
	}

	public ElectronicsModel addElectronicModel(ElectronicsModel electronicModel) {

		Electronics electronic = this.convertElectronicModelToEntity(electronicModel);
		electronic = this.iElectronicsDAO.addElectronic(electronic);
		return this.convertElectronicEntityModel(electronic);
	}

	private Electronics convertElectronicModelToEntity(ElectronicsModel electronicModel) {

		Electronics electronic = new Electronics();
		electronic.setDeviceId(electronicModel.getDeviceId());
		electronic.setDeviceBrand(electronicModel.getDeviceBrand());
		electronic.setDeviceModel(electronicModel.getDeviceModel());
		electronic.setDeviceSeries(electronicModel.getDeviceSeries());
		electronic.setDeviceType(electronicModel.getDeviceType());
		electronic.setDeviceRAM(electronicModel.getDeviceRAM());
		electronic.setDeviceHDD(electronicModel.getDeviceHDD());
		electronic.setDevicePrice(electronicModel.getDevicePrice());
		electronic.setDeviceProcessor(electronicModel.getDeviceProcessor());
		electronic.setDeviceScreenSize(electronicModel.getDeviceScreenSize());
		electronic.setDeviceBatteryPower(electronicModel.getDeviceBatteryPower());
		electronic.setDeviceUSBSlots(electronicModel.getDeviceUSBSlots());
		electronic.setDeviceHDMI(electronicModel.getDeviceHDMI());

		return electronic;

	}

	private ElectronicsModel convertElectronicEntityModel(Electronics electronic) {

		ElectronicsModel electronicModel = new ElectronicsModel();
		electronicModel.setDeviceId(electronic.getDeviceId());
		electronicModel.setDeviceBrand(electronic.getDeviceBrand());
		electronicModel.setDeviceModel(electronic.getDeviceModel());
		electronicModel.setDeviceSeries(electronic.getDeviceSeries());
		electronicModel.setDeviceType(electronic.getDeviceType());
		electronicModel.setDeviceRAM(electronic.getDeviceRAM());
		electronicModel.setDeviceHDD(electronic.getDeviceHDD());
		electronicModel.setDevicePrice(electronic.getDevicePrice());
		electronicModel.setDeviceProcessor(electronic.getDeviceProcessor());
		electronicModel.setDeviceScreenSize(electronic.getDeviceScreenSize());
		electronicModel.setDeviceBatteryPower(electronic.getDeviceBatteryPower());
		electronicModel.setDeviceUSBSlots(electronic.getDeviceUSBSlots());
		electronicModel.setDeviceHDMI(electronic.getDeviceHDMI());

		return electronicModel;
	}

}
