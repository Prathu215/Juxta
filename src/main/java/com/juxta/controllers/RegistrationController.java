package com.juxta.controllers;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juxta.entities.Admin;
import com.juxta.models.AdminModel;
import com.juxta.services.AdminService;

@RestController
@CrossOrigin
public class RegistrationController {
	
	Logger logger = Logger.getLogger(RegistrationController.class);
	
	@Autowired
	private AdminService adminService;	
	
	@RequestMapping(value="/admins",method=RequestMethod.GET)
	public List<Admin> getAdmins() {
		return this.adminService.getAdmins();
	}
	
	@RequestMapping(value = "/admins", method = RequestMethod.POST, consumes="application/json", produces="application/json")
	public AdminModel  saveAdmin(@RequestBody AdminModel adminModel) {
		logger.info("Entry RegistrationController:" + adminModel);
		adminModel=this.adminService.addAdmins(adminModel);
		return adminModel;
	}  

}
