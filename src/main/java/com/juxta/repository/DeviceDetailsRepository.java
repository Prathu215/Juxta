package com.juxta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juxta.entities.DeviceDetails;

@Repository
public interface DeviceDetailsRepository extends CrudRepository<DeviceDetails,Integer> {
	
	public List<DeviceDetails> findAll();
	public List<DeviceDetails> findByBrand(String brand);
	public List<DeviceDetails> findBySeries(String series);

}
