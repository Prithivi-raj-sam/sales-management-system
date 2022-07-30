package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.salesmanagementsystem.Repository.SalesTeamRepository;
import com.chainsys.salesmanagementsystem.pojo.SalesTeam;

@Service
public class SalesTeamService {
	@Autowired
	private SalesTeamRepository salesteamrepo;
	
	
	public SalesTeam getSalesman(int id) {
		return salesteamrepo.findById(id);
	}
	public List<SalesTeam> getAllSalesman(){
		return salesteamrepo.findAll();
	}
	public void deleteSalesTeamByid(int id) {
	   salesteamrepo.deleteById(id);
	}
	public void insertSeller(SalesTeam salesteam) {
		salesteamrepo.save(salesteam);
	}
	public void updateSeller(SalesTeam salesteam) {
		salesteamrepo.save(salesteam);
	}
}
