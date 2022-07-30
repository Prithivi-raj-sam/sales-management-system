package com.chainsys.salesManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesManagementSystem.pojo.Profit;

public interface ProfitRepository extends CrudRepository<Profit,Integer>{
	Profit save(Profit profit);
	Profit findById(int profit_id);
	void deleteById(int profit_id);
	List<Profit> findAll();
	
}
