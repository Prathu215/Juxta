package com.juxta.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juxta.entities.CarDetails;
import com.juxta.repository.CarDetailsRepository;

@Service
public class CarDetailsDao implements ICarDetailsDAO {
	
	@Autowired
	private CarDetailsRepository carDetailsRepository;

	@Override
	public List<CarDetails> getCarDetails() {
		// TODO Auto-generated method stub
		return carDetailsRepository.findAll();
	}

	@Override
	public List<CarDetails> getCarDetailsByBrand(String brand) {
		// TODO Auto-generated method stub
		return carDetailsRepository.findByBrand(brand);
	}

	@Override
	public List<CarDetails> getCarDetailsBySeries(String series){
		return carDetailsRepository.findBySeries(series);
	}
}