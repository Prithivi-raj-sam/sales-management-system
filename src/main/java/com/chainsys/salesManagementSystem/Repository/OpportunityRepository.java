package com.chainsys.salesManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesManagementSystem.pojo.Opportunity;

public interface OpportunityRepository extends CrudRepository<Opportunity,Integer>{
	Opportunity save(Opportunity opportunity);
	Opportunity findById(int opp_id);
	List<Opportunity> findAll();
	void deleteByid(int opp_id);
}
