package com.juxta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juxta.DAO.ICarDetailsDAO;
import com.juxta.entities.CarDetails;

@Service
public class CarDetailsService {
	
	@Autowired
	private ICarDetailsDAO iCarDetailsDAO;
	
	public List<CarDetails> getCarDetails(){
		return this.iCarDetailsDAO.getCarDetails();
	}
	
	public List<CarDetails> getDeviceDetailsByBrand()
	{
		return null;}
	
	public List<CarDetails> getCarDetailsBySeries(String series){
		return iCarDetailsDAO.getCarDetailsBySeries(series);
	}

}
