package com.juxta.repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juxta.entities.AutoMobile;

@Repository
public interface AutoMobileRepository extends CrudRepository<AutoMobile,Integer> {
	
	public List<AutoMobile> findAll();	

}
