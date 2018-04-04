package com.juxta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juxta.entities.CarDetails;

@Repository
public interface CarDetailsRepository extends CrudRepository<CarDetails,Integer> {
	
	public List<CarDetails> findAll();
	public List<CarDetails> findByBrand(String brand);
	public List<CarDetails> findBySeries(String series);

}
