package com.juxta.controllers;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juxta.entities.DeviceDetails;
import com.juxta.services.DeviceDetailsService;

@RestController
@CrossOrigin
public class DeviceDetailsController {
	Logger log=Logger.getLogger(DeviceDetailsController.class);
	
	@Autowired
	private DeviceDetailsService deviceDetailsService;
	
	@RequestMapping("/devicedetails")
	public List<DeviceDetails> getDeviceDetails() {
		log.info(this.deviceDetailsService.getDeviceDetails());
		return this.deviceDetailsService.getDeviceDetails();
	}
	
	@RequestMapping("/devicedetails/{name}")
	public List<DeviceDetails> getDeviceDetailsByName() {
		return null;
	}
	
	@RequestMapping("/devicedetails/series/{series}")
	public List<DeviceDetails> getDeviceDetailsBySeries(@PathVariable String series) {
		return this.deviceDetailsService.getDeviceDetailsBySeries(series);
	}
}
