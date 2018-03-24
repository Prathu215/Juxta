package com.juxta.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juxta.entities.Electronics;
import com.juxta.repository.ElectronicsRepository;

@Service
public class ElectronicsDAO implements IElectronicsDAO {
	
	
	@Autowired
	public ElectronicsRepository electronicRepository;
	

	@Override
	@Transactional
	public Electronics addElectronic(Electronics electronic) {
		// TODO Auto-generated method stub
		return this.electronicRepository.save(electronic);
		
	}
	

}
