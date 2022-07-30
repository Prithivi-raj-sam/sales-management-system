package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.salesmanagementsystem.Repository.ServiceRepository;
import com.chainsys.salesmanagementsystem.pojo.Services;

@Service
public class ServicesService {
	@Autowired
	private ServiceRepository servicerepo;
	
	public void insertService(Services service) {
		servicerepo.save(service);
	}
	public void updateServices(Services service) {
		servicerepo.save(service);
	}
	public void deleteServiceById(int id) {
		servicerepo.deleteById(id);
	}
	public void updateService(Services service) {
		servicerepo.save(service);
	}
	public Services getServiceById(int id) {
		return servicerepo.findById(id);
	}
	public List<Services> getAllService(){
		return servicerepo.findAll();
	}
}
