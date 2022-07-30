package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.salesmanagementsystem.Repository.MarketingTeamRepository;
import com.chainsys.salesmanagementsystem.pojo.MarketingTeam;

@Service
public class MarketingTeamService {
	@Autowired
	private MarketingTeamRepository markrepo;
	
	public void insertMarketingMan(MarketingTeam markMan) {
		markrepo.save(markMan);
	}
	public void deleteMarketManById(int id) {
		markrepo.deleteById(id);
	}
	public void updateMarketMan(MarketingTeam markMan) {
		markrepo.save(markMan);
	}
	public MarketingTeam getMarketManById(int id) {
		return markrepo.findById(id);
	}
	public List<MarketingTeam> getAllMarketMan(){
		return markrepo.findAll();
	}
}
