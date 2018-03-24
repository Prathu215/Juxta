package com.juxta.controllers;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juxta.entities.Electronics;

import com.juxta.models.ElectronicsModel;
import com.juxta.services.ElectronicsService;

@RestController
public class ElectronicsController {

	Logger logger = Logger.getLogger(AutoMobileController.class);

	@Autowired
	private ElectronicsService electronicsService;

	@RequestMapping(value = "/electronics", method = RequestMethod.GET)
	public List<Electronics> getElectronic() {
		logger.info(this.electronicsService.getElectronics());
		return this.electronicsService.getElectronics();

	}

	@RequestMapping(value = "/electronics", method = RequestMethod.POST)
	public List<ElectronicsModel> addElectronics(@RequestBody ElectronicsModel electronicModel) {

		logger.info("Entry to post method:" + electronicModel);
		List<ElectronicsModel> electronicModelList = new ArrayList<ElectronicsModel>();
		electronicModelList.add(this.electronicsService.addElectronicModel(electronicModel));
		// here its showing the error.
		return electronicModelList;
	}
}
