package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.salesmanagementsystem.Repository.AdminRepository;
import com.chainsys.salesmanagementsystem.pojo.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminRepository adminrepo;
	
	public void deleteAdmin(int id) {
		adminrepo.deleteById(id);
	}
	public Admin findById(int id) {
		return adminrepo.findById(id);
	}
	public void insertAdmin(Admin admin) {
		 adminrepo.save(admin);
	}
	public List<Admin> getAllAdmin(){
		return adminrepo.findAll();
	}
	public void updateAdmin(Admin admin) {
		adminrepo.save(admin);
	}
}
