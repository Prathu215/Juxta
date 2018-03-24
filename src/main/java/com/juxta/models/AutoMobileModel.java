package com.juxta.models;

public class AutoMobileModel {
	
	private int autoId;
	private String autoBrand;
	private String autoSeries;
	private String autoModel;
	private int autoYear;
	private double autoPrice;
	private String autoEngine;
	private String autoType;
	private int autoHorsePower;
	private double autoCurbWeight;
	private double autoMPG;
	public int getAutoId() {
		return autoId;
	}
	public void setAutoId(int autoId) {
		this.autoId = autoId;
	}
	public String getAutoBrand() {
		return autoBrand;
	}
	public void setAutoBrand(String autoBrand) {
		this.autoBrand = autoBrand;
	}
	public String getAutoSeries() {
		return autoSeries;
	}
	public void setAutoSeries(String autoSeries) {
		this.autoSeries = autoSeries;
	}
	public String getAutoModel() {
		return autoModel;
	}
	public void setAutoModel(String autoModel) {
		this.autoModel = autoModel;
	}
	public int getAutoYear() {
		return autoYear;
	}
	public void setAutoYear(int autoYear) {
		this.autoYear = autoYear;
	}
	public double getAutoPrice() {
		return autoPrice;
	}
	public void setAutoPrice(double autoPrice) {
		this.autoPrice = autoPrice;
	}
	public String getAutoEngine() {
		return autoEngine;
	}
	public void setAutoEngine(String autoEngine) {
		this.autoEngine = autoEngine;
	}
	public String getAutoType() {
		return autoType;
	}
	public void setAutoType(String autoType) {
		this.autoType = autoType;
	}
	public int getAutoHorsePower() {
		return autoHorsePower;
	}
	public void setAutoHorsePower(int autoHorsePower) {
		this.autoHorsePower = autoHorsePower;
	}
	public double getAutoCurbWeight() {
		return autoCurbWeight;
	}
	public void setAutoCurbWeight(double autoCurbWeight) {
		this.autoCurbWeight = autoCurbWeight;
	}
	public double getAutoMPG() {
		return autoMPG;
	}
	public void setAutoMPG(double autoMPG) {
		this.autoMPG = autoMPG;
	}
	@Override
	public String toString() {
		return "AutoMobileModel [autoId=" + autoId + ", autoBrand=" + autoBrand + ", autoSeries=" + autoSeries
				+ ", autoModel=" + autoModel + ", autoYear=" + autoYear + ", autoPrice=" + autoPrice + ", autoEngine="
				+ autoEngine + ", autoType=" + autoType + ", autoHorsePower=" + autoHorsePower + ", autoCurbWeight="
				+ autoCurbWeight + ", autoMPG=" + autoMPG + "]";
	}
	
	
	
	

}
