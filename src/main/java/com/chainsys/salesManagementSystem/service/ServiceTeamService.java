package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.salesmanagementsystem.Repository.ServiceTeamRepository;
import com.chainsys.salesmanagementsystem.pojo.ServiceTeam;

@Service
public class ServiceTeamService {
	@Autowired
	private ServiceTeamRepository servTeamrepo;
	
	public void insertServiceman(ServiceTeam servTeam) {
		servTeamrepo.save(servTeam);
	}
	public void deleteServiceMan(int id) {
		servTeamrepo.deleteById(id);
	}
	public void updateServiceMan(ServiceTeam servTeam) {
		servTeamrepo.save(servTeam);
	}
	public ServiceTeam getServiceManById(int id) {
		return servTeamrepo.findById(id);
	}
	public List<ServiceTeam> getAllService(){
		return servTeamrepo.findAll();
	}
}
