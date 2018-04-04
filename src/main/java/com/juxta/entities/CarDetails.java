package com.juxta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cardetails")
public class CarDetails {
	@Id
	@GeneratedValue
	private int carId;
	private String brand;
	private String series;
	private String model;
	private String type;
	private int year;
	private double price;
	private String engine;
	private int horsepower;
	private double curbweight;
	private double mpg;
	
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	public double getCurbweight() {
		return curbweight;
	}
	public void setCurbweight(double curbweight) {
		this.curbweight = curbweight;
	}
	public double getMpg() {
		return mpg;
	}
	public void setMpg(double mpg) {
		this.mpg = mpg;
	}
	@Override
	public String toString() {
		return "CarDetails [carId=" + carId + ", brand=" + brand + ", series=" + series + ", model=" + model + ", type="
				+ type + ", year=" + year + ", price=" + price + ", engine=" + engine + ", horsepower=" + horsepower
				+ ", curbweight=" + curbweight + ", mpg=" + mpg + "]";
	}
	
	
}
