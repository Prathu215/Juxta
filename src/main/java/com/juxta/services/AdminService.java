package com.juxta.services;

//import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juxta.DAO.IAdminDAO;
import com.juxta.entities.Admin;
import com.juxta.models.AdminModel;
import com.juxta.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private IAdminDAO iAdminDAO;
	
	@Autowired
	private AdminRepository adminRepository;

	public AdminModel addAdmins(AdminModel adminModel) {
		
		Admin admin=this.convertAdminModelToEntity(adminModel);
		admin=this.iAdminDAO.addAdmin(admin);
		adminModel=this.convertEntityToModel(admin);
		return adminModel;
		
	}
	
	public Admin convertAdminModelToEntity(AdminModel adminModel) {
		Admin admin=new Admin();
		admin.setEmail(adminModel.getEmail());
		admin.setFirstName(adminModel.getFirstName());
		admin.setLastName(adminModel.getLastName());
		admin.setPassword(adminModel.getPassword());
		admin.setPhone(adminModel.getPhone());
		
		return admin;
	}
	
	public AdminModel convertEntityToModel(Admin admin) {
		AdminModel adminModel=new AdminModel();
		adminModel.setAdminId(admin.getAdminId());
		adminModel.setEmail(admin.getEmail());
		adminModel.setFirstName(admin.getFirstName());
		adminModel.setLastName(admin.getLastName());
		adminModel.setPassword(admin.getPassword());
		adminModel.setPhone(admin.getPhone());
		return adminModel;
	}

	public List<Admin> getAdmins() {
		// TODO Auto-generated method stub
		/*List<AdminModel> adminModelList = new ArrayList<AdminModel>();
		AdminModel adminModel = new AdminModel();
		List<Admin> adminList = new ArrayList<Admin>();

		while (this.iAdminDAO.getAdmins().iterator().hasNext()) {
			adminModel.setAdminId(this.iAdminDAO.getAdmins().iterator().next().getAdminId());
			adminModel.setEmail(this.iAdminDAO.getAdmins().iterator().next().getEmail());
			adminModel.setFirstName(this.iAdminDAO.getAdmins().iterator().next().getFirstName());
			adminModel.setLastName(this.iAdminDAO.getAdmins().iterator().next().getLastName());
			adminModel.setPhone(this.iAdminDAO.getAdmins().iterator().next().getPhone());
			adminModel.setPassword(this.iAdminDAO.getAdmins().iterator().next().getPassword());
			adminModelList.add(adminModel);
		}

		return adminModelList;*/
		return this.adminRepository.findAll();
	}
}
