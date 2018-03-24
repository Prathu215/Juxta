package com.juxta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juxta.entities.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin,Integer> {
	public List<Admin> findAll();
	public Admin save(Admin admin);
}
