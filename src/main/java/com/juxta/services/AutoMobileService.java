package com.juxta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juxta.DAO.IAutoMobileDAO;
import com.juxta.entities.AutoMobile;
import com.juxta.models.AutoMobileModel;
import com.juxta.repository.AutoMobileRepository;

@Service
public class AutoMobileService {

	@Autowired
	private AutoMobileRepository autoMobileRepository;

	@Autowired
	private IAutoMobileDAO iAutoMobileDAO;

	public List<AutoMobile> getAutoMobiles() {
		return this.autoMobileRepository.findAll();
	}

	public AutoMobileModel addAutoMobile(AutoMobileModel autoMobileModel) {
		AutoMobile autoMobile = this.convertAutoMobileModelToEntity(autoMobileModel);
		autoMobile = this.iAutoMobileDAO.addAutoMobile(autoMobile);
		return this.convertAutoMobileEntityToModel(autoMobile);

	}

	public AutoMobile convertAutoMobileModelToEntity(AutoMobileModel autoMobileModel) {
		AutoMobile autoMobile = new AutoMobile();
		autoMobile.setAutoBrand(autoMobileModel.getAutoBrand());
		autoMobile.setAutoCurbWeight(autoMobileModel.getAutoCurbWeight());
		autoMobile.setAutoEngine(autoMobileModel.getAutoEngine());
		autoMobile.setAutoHorsePower(autoMobileModel.getAutoHorsePower());
		// autoMobile.setAutoId(autoMobileModel.getAutoId());
		autoMobile.setAutoMPG(autoMobileModel.getAutoMPG());
		autoMobile.setAutoModel(autoMobileModel.getAutoModel());
		autoMobile.setAutoYear(autoMobileModel.getAutoYear());
		autoMobile.setAutoPrice(autoMobileModel.getAutoPrice());
		autoMobile.setAutoSeries(autoMobileModel.getAutoSeries());
		autoMobile.setAutoType(autoMobileModel.getAutoType());

		return autoMobile;

	}

	public AutoMobileModel convertAutoMobileEntityToModel(AutoMobile autoMobile) {
		AutoMobileModel autoMobileModel = new AutoMobileModel();
		autoMobileModel.setAutoId(autoMobile.getAutoId());
		autoMobileModel.setAutoCurbWeight(autoMobile.getAutoCurbWeight());
		autoMobileModel.setAutoEngine(autoMobile.getAutoEngine());
		autoMobileModel.setAutoHorsePower(autoMobile.getAutoHorsePower());
		autoMobileModel.setAutoModel(autoMobile.getAutoModel());
		autoMobileModel.setAutoMPG(autoMobile.getAutoMPG());
		autoMobileModel.setAutoPrice(autoMobile.getAutoPrice());
		autoMobileModel.setAutoYear(autoMobile.getAutoYear());
		autoMobileModel.setAutoType(autoMobile.getAutoType());
		autoMobileModel.setAutoSeries(autoMobile.getAutoSeries());
		autoMobileModel.setAutoBrand(autoMobile.getAutoBrand());

		return autoMobileModel;
	}
}
