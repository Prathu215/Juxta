package com.juxta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juxta.DAO.IDeviceDetailsDAO;
import com.juxta.entities.DeviceDetails; 

@Service
public class DeviceDetailsService {
	
	@Autowired
	private IDeviceDetailsDAO iDeviceDetailsDAO;
	
	public List<DeviceDetails> getDeviceDetails(){
		return this.iDeviceDetailsDAO.getDeviceDetails();
	}
	
	public List<DeviceDetails> getDeviceDetailsByBrand(){
		return null;
		
	}
	

	
}

