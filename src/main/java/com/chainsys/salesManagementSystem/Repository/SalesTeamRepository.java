package com.chainsys.salesManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesManagementSystem.pojo.SalesTeam;

public interface SalesTeamRepository extends CrudRepository<SalesTeam,Integer>{
	SalesTeam save(SalesTeam seller);
	SalesTeam findById(int sellerId);
	void deleteById(int sellerId);
	List<SalesTeam> findAll();
}
