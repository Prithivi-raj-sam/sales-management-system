package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.salesmanagementsystem.Repository.ProfitRepository;
import com.chainsys.salesmanagementsystem.pojo.Profit;

@Service
public class ProfitService {
	@Autowired
	private ProfitRepository profitrepo;
	
	public void insertProfit(Profit profit) {
		profitrepo.save(profit);
	}
	public void updateProfit(Profit profit) {
		profitrepo.save(profit);
	}
	public void deleteProfitById(int id) {
		profitrepo.deleteById(id);
	}
	public Profit getProfitById(int id) {
		return profitrepo.findById(id);
	}
	public List<Profit> getAllProfit(){
		return profitrepo.findAll();
	}
}
