package com.juxta.DAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.juxta.entities.Admin;
import com.juxta.repository.AdminRepository;



@Service
public class AdminDAO implements IAdminDAO {
	
	Logger logger=Logger.getLogger(AdminDAO.class);
		
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		if(this.adminRepository.save(admin)!=null) {
			logger.info("From AdminRepository"+this.adminRepository.save(admin));
			logger.info("From AdminRepository"+this.adminRepository.save(admin));
			logger.info("From AdminRepository, admin repo null");
		}
		return this.adminRepository.save(admin);
	}

	@Override
	public List<Admin> getAdmins() {
		// TODO Auto-generated method stub
		Iterable<Admin> it=this.adminRepository.findAll();
		List<Admin> adminList=new ArrayList<Admin>();
		while(it.iterator().hasNext()) {
			adminList.add(it.iterator().next());
		}
		return adminList;
	}



}
