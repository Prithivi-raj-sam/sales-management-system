package com.chainsys.salesManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesManagementSystem.pojo.MarketingTeam;

public interface MarketingTeamRepository extends CrudRepository<MarketingTeam,Integer>{
	MarketingTeam save(MarketingTeam marketer);
	MarketingTeam findById(int markId);
	List<MarketingTeam> findAll();
	void deleteById(int markId);
}
