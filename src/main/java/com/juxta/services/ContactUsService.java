package com.juxta.services;


import com.juxta.entities.ContactUs;
import com.juxta.repository.ContactUsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lakshman Bhupathi on 3/28/2018.
 */
@Service
public class ContactUsService {

    @Autowired
    ContactUsRepo contactUsRepo;

    public Boolean saveContactUs(ContactUs contactUs){
        return contactUsRepo.save(contactUs) != null;
    }

    public List<ContactUs> findAll(){
        return contactUsRepo.findAll();
    }

}
