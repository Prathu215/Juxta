package com.juxta.DAO;


import java.util.List;

import com.juxta.entities.CarDetails;

public interface ICarDetailsDAO {
	
	public List<CarDetails> getCarDetails();
	public List<CarDetails> getCarDetailsByBrand(String brand);
	
	public List<CarDetails> getCarDetailsBySeries(String series);
}
