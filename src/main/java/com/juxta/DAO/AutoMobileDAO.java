package com.juxta.DAO;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juxta.entities.AutoMobile;
import com.juxta.repository.AutoMobileRepository;

@Service
public class AutoMobileDAO implements IAutoMobileDAO {
//	@Autowired
//	public SessionFactory sessionFactory;
	
	@Autowired
	public AutoMobileRepository autoMobileRepository;

	@Override
	@Transactional
	public AutoMobile addAutoMobile(AutoMobile autoMobile) {
		return this.autoMobileRepository.save(autoMobile);
//		Session session=sessionFactory.getCurrentSession();
//		return (AutoMobile) session.save(autoMobile);
		// return autoMobile;

		// TODO Auto-generated method stub

	}

}
