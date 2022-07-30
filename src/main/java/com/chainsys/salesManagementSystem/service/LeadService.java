package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.salesmanagementsystem.Repository.LeadsRepository;
import com.chainsys.salesmanagementsystem.pojo.Lead;

@Service
public class LeadService {
	@Autowired
	private LeadsRepository leadrepo;
	
	public Lead getleadsById(int id) {
		return leadrepo.findById(id);	
	}
	public List<Lead> getAllLeads(){
		return leadrepo.findAll();
	}
	public void insertLeads(Lead lead) {
		leadrepo.save(lead);
	}
	public void updateLeads(Lead lead) {
		leadrepo.save(lead);
	}
	public void deleteLeadById(int id) {
		leadrepo.deleteById(id);
	}
}
