package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.salesmanagementsystem.Repository.IncomeRepository;
import com.chainsys.salesmanagementsystem.pojo.Income;

@Service
public class IncomeService {
	@Autowired
	private IncomeRepository incomerepo;
	
	public void insertIncome(Income income) {
		incomerepo.save(income);
	}
	public void deleteIncomeById(int id) {
		incomerepo.deleteById(id);
	}
	public Income findIncomeById(int id) {
		return incomerepo.findById(id);
	}
	public List<Income> getAllIncome(){
		return incomerepo.findAll();
	}
	public void updateIncome(Income income) {
		incomerepo.save(income);
	}
}
