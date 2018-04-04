package com.juxta.controllers;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juxta.entities.CarDetails;
import com.juxta.services.CarDetailsService;


@RestController
@CrossOrigin
public class CarDetailsController {
	
	Logger log=Logger.getLogger(CarDetailsController.class);
	
	@Autowired
	private CarDetailsService carDetailsService;
	
	@RequestMapping("/cardetails")
	public List<CarDetails> getCarDetails() {
		log.info(this.carDetailsService.getCarDetails());
		return this.carDetailsService.getCarDetails();
	}
	
	@RequestMapping("/cardetails/{name}")
	public List<CarDetails> getCarDetailsByName() {
		return null;
	}
	
	@RequestMapping("/cardetails/series/{series}")
	public List<CarDetails> getCarDetailsBySeries(@PathVariable String series) {
		return this.carDetailsService.getCarDetailsBySeries(series);
	}

}
