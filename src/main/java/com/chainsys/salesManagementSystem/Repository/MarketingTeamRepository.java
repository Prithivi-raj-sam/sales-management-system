package com.chainsys.salesmanagementsystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesmanagementsystem.pojo.MarketingTeam;

public interface MarketingTeamRepository extends CrudRepository<MarketingTeam,Integer>{
	MarketingTeam save(MarketingTeam marketer);
	MarketingTeam findById(int marketer_id);
	List<MarketingTeam> findAll();
	void deleteById(int marketer_id);
}
