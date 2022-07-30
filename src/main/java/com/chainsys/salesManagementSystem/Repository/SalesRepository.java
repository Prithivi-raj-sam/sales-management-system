package com.chainsys.salesManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesManagementSystem.pojo.Sale;

public interface SalesRepository extends CrudRepository<Sale,Integer>{
	Sale save(Sale sales);
	List<Sale> findAll();
	void deleteById(int saleId);
	Sale findById(int saleId);
}
