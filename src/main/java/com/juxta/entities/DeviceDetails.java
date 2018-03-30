package com.juxta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "devicedetails")
public class DeviceDetails {
	@Id
	@GeneratedValue
	private int deviceId;
	private String brand;
	private String series;
	private String model;
	private String type;
	private int ram;
	private int hdd;
	private String processor;
	private double screensize;
	private int batterypower;
	private int usbslots;

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
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

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public double getScreensize() {
		return screensize;
	}

	public void setScreensize(double screensize) {
		this.screensize = screensize;
	}

	public int getBatterypower() {
		return batterypower;
	}

	public void setBatterypower(int batterypower) {
		this.batterypower = batterypower;
	}

	public int getUsbslots() {
		return usbslots;
	}

	public void setUsbslots(int usbslots) {
		this.usbslots = usbslots;
	}

	@Override
	public String toString() {
		return "DeviceDetails [deviceId=" + deviceId + ", brand=" + brand + ", series=" + series + ", model=" + model
				+ ", type=" + type + ", ram=" + ram + ", hdd=" + hdd + ", processor=" + processor + ", screensize="
				+ screensize + ", batterypower=" + batterypower + ", usbslots=" + usbslots + "]";
	}

}
