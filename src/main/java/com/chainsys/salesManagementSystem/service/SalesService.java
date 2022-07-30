package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.salesmanagementsystem.Repository.SalesRepository;
import com.chainsys.salesmanagementsystem.pojo.Sale;

@Service
public class SalesService {
	@Autowired
	private SalesRepository salerepo;
	
	public void insertSales(Sale sale) {
		salerepo.save(sale);
	}
	public void deleteSalesById(int id) {
		salerepo.deleteById(id);
	}
	public void updateSales(Sale sale) {
		salerepo.save(sale);
	}
	public Sale findSalesById(int id) {
		return salerepo.findById(id);
	}
	public List<Sale> getAllSales(){
		return salerepo.findAll();
	}
}
