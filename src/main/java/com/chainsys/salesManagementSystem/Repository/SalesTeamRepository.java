package com.chainsys.salesmanagementsystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesmanagementsystem.pojo.SalesTeam;

public interface SalesTeamRepository extends CrudRepository<SalesTeam,Integer>{
	SalesTeam save(SalesTeam seller);
	SalesTeam findById(int seller_id);
	void deleteById(int seller_id);
	List<SalesTeam> findAll();
}
