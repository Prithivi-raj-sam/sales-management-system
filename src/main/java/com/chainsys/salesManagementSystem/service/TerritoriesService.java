package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.salesmanagementsystem.Repository.TerritoriesRepository;
import com.chainsys.salesmanagementsystem.pojo.Territory;

@Service
public class TerritoriesService {
	@Autowired
	private TerritoriesRepository terRepo;
	
	public void insertTerritory(Territory territory) {
		terRepo.save(territory);
	}
	public void deleteTerritoryById(int id) {
		terRepo.deleteById(id);
	}
	public void updateTerritory(Territory territory){
		terRepo.save(territory);
	}
	public Territory getTerritoryById(int id) {
		return terRepo.findById(id);
	}
	public List<Territory> getAllTeritories(){
		return terRepo.findAll();
	}
}
