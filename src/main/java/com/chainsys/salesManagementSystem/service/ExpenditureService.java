package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.salesmanagementsystem.Repository.ExpenditureRepository;
import com.chainsys.salesmanagementsystem.pojo.Expenditure;

@Service
public class ExpenditureService {
	@Autowired
	private ExpenditureRepository exprepo;
	
	public void deletExpenditureById(int id) {
		exprepo.deleteById(id);
	}
	public Expenditure getExpenditureById(int id) {
		return exprepo.findById(id);
	}
	public List<Expenditure> getAllExpenditure(){
		return exprepo.findAll();
	}
	public void insertExpenditure(Expenditure exp) {
	      exprepo.save(exp);
	}
	public void updateExpenditure(Expenditure exp) {
	      exprepo.save(exp);
	}
}
