package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.salesmanagementsystem.Repository.OpportunityRepository;
import com.chainsys.salesmanagementsystem.pojo.Opportunity;

@Service
public class OpportunityService {
	@Autowired
	private OpportunityRepository opprepo;
	
	public void insertOpportunity(Opportunity opp) {
		opprepo.save(opp);
	}
	public void updateOportunity(Opportunity opp) {
		opprepo.save(opp);
	}
	public void deleteOpportunityById(int id) {
		opprepo.deleteById(id);
	}
	public Opportunity findOpportunityById(int id) {
		return opprepo.findById(id);
	}
	public List<Opportunity> findAllOpportunity(){
		return opprepo.findAll();
	}
}
