package com.juxta.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juxta.entities.DeviceDetails;
import com.juxta.services.DeviceDetailsService;

@RestController
public class DeviceDetailsController {
	
	private DeviceDetailsService deviceDetailsService;
	
	@RequestMapping("/devicedetails")
	public List<DeviceDetails> getDeviceDetails() {
		return this.deviceDetailsService.getDeviceDetails();		
	}
	
	@RequestMapping("/devicedetails/{name}")
	public void getDeviceDetailsByName() {
		
	}
}
