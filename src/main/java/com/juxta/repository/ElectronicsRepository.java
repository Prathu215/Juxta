package com.juxta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juxta.entities.Electronics;



@Repository
public interface ElectronicsRepository extends CrudRepository<Electronics, Integer>{
	
	public List<Electronics> findAll(); 
	

}
