package com.juxta.controllers;

import com.juxta.entities.ContactUs;
import com.juxta.services.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
public class ContactUsController {

    @Autowired
    ContactUsService contactUsService;

    @RequestMapping(value = "/contactus/save",method = RequestMethod.POST)
    public Boolean saveContactUs(@RequestBody ContactUs contactUs){
    	
    	System.out.println("contactus " + contactUs);
        return contactUsService.saveContactUs(contactUs);
      
    }

    @RequestMapping(value = "/contactus/getAll", method = RequestMethod.GET)
    public List<ContactUs> getAll(){
        return contactUsService.findAll();
    }
}
