package com.chainsys.salesmanagementsystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesmanagementsystem.pojo.ServiceTeam;

public interface ServiceTeamRepository extends CrudRepository<ServiceTeam,Integer>{
	ServiceTeam save(ServiceTeam servicer);
	ServiceTeam findById(int servicer_id);
	List<ServiceTeam> findAll();
	void deleteById(int servicer_id);
}
