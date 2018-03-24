package com.juxta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="electronics")
public class Electronics {	
	@Id
	@GeneratedValue
	private int deviceId;
	private String deviceBrand;
	private String deviceModel;
	private String deviceSeries;
	private String deviceType;
	private String deviceRAM;
	private String deviceHDD;
	private double devicePrice;
	private String deviceProcessor;
	private String deviceScreenSize;
	private String deviceBatteryPower;
	private String deviceUSBSlots;
	private String deviceHDMI;
	
	
	
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceBrand() {
		return deviceBrand;
	}
	public void setDeviceBrand(String deviceBrand) {
		this.deviceBrand = deviceBrand;
	}
	public String getDeviceModel() {
		return deviceModel;
	}
	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}
	public String getDeviceSeries() {
		return deviceSeries;
	}
	public void setDeviceSeries(String deviceSeries) {
		this.deviceSeries = deviceSeries;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceRAM() {
		return deviceRAM;
	}
	public void setDeviceRAM(String deviceRAM) {
		this.deviceRAM = deviceRAM;
	}
	public String getDeviceHDD() {
		return deviceHDD;
	}
	public void setDeviceHDD(String deviceHDD) {
		this.deviceHDD = deviceHDD;
	}
	public double getDevicePrice() {
		return devicePrice;
	}
	public void setDevicePrice(double devicePrice) {
		this.devicePrice = devicePrice;
	}
	public String getDeviceProcessor() {
		return deviceProcessor;
	}
	public void setDeviceProcessor(String deviceProcessor) {
		this.deviceProcessor = deviceProcessor;
	}
	public String getDeviceScreenSize() {
		return deviceScreenSize;
	}
	public void setDeviceScreenSize(String deviceScreenSize) {
		this.deviceScreenSize = deviceScreenSize;
	}
	public String getDeviceBatteryPower() {
		return deviceBatteryPower;
	}
	public void setDeviceBatteryPower(String deviceBatteryPower) {
		this.deviceBatteryPower = deviceBatteryPower;
	}
	public String getDeviceUSBSlots() {
		return deviceUSBSlots;
	}
	public void setDeviceUSBSlots(String deviceUSBSlots) {
		this.deviceUSBSlots = deviceUSBSlots;
	}
	public String getDeviceHDMI() {
		return deviceHDMI;
	}
	public void setDeviceHDMI(String deviceHDMI) {
		this.deviceHDMI = deviceHDMI;
	}
	@Override
	public String toString() {
		return "Electronics [deviceId=" + deviceId + ", deviceBrand=" + deviceBrand + ", deviceModel=" + deviceModel
				+ ", deviceSeries=" + deviceSeries + ", deviceType=" + deviceType + ", deviceRAM=" + deviceRAM
				+ ", deviceHDD=" + deviceHDD + ", devicePrice=" + devicePrice + ", deviceProcessor=" + deviceProcessor
				+ ", deviceScreenSize=" + deviceScreenSize + ", deviceBatteryPower=" + deviceBatteryPower
				+ ", deviceUSBSlots=" + deviceUSBSlots + ", deviceHDMI=" + deviceHDMI + "]";
	}
	
	
	
}



