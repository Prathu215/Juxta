package com.juxta.DAO;

import java.util.List;

import com.juxta.entities.Admin;

public interface IAdminDAO {
	public Admin addAdmin(Admin admin);

	public List<Admin> getAdmins();
}
