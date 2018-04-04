package com.juxta.DAO;

import java.util.List;

import com.juxta.entities.DeviceDetails;

public interface IDeviceDetailsDAO {
	public List<DeviceDetails> getDeviceDetails();
	public List<DeviceDetails> getDeviceDetailsByBrand(String brand);
	public List<DeviceDetails> getDeviceDetailsBySeries(String series);
}
