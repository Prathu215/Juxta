package com.juxta.repository;

import com.juxta.entities.ContactUs;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Lakshman Bhupathi on 3/27/2018.
 */
public interface ContactUsRepo extends CrudRepository<ContactUs, Integer> {
    List<ContactUs> findAll();

    ContactUs save(ContactUs contactUs);
}
