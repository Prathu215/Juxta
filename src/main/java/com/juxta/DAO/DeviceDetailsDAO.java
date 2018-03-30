package com.juxta.DAO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.juxta.entities.DeviceDetails;
import com.juxta.repository.DeviceDetailsRepository;

@Service
public class DeviceDetailsDAO implements IDeviceDetailsDAO {
	
	@Autowired
	private DeviceDetailsRepository deviceDetailsRepository;

	@Override
	public List<DeviceDetails> getDeviceDetails() {
		// TODO Auto-generated method stub
		return this.deviceDetailsRepository.findAll();
	}
}
