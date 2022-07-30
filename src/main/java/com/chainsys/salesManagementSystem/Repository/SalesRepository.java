package com.chainsys.salesmanagementsystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesmanagementsystem.pojo.Sale;

public interface SalesRepository extends CrudRepository<Sale,Integer>{
	Sale save(Sale sales);
	List<Sale> findAll();
	void deleteById(int sale_id);
	Sale findById(int sale_id);
}
