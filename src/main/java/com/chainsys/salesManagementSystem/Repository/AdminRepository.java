package com.chainsys.salesManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesManagementSystem.pojo.Admin;

public interface AdminRepository extends CrudRepository<Admin,Integer>{
	Admin save(Admin admin);
	Admin findById(int admin_id);
	void deleteById(int admin_id);
	List<Admin> findAll();
}
