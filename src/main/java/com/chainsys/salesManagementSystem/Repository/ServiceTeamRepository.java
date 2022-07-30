package com.chainsys.salesManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesManagementSystem.pojo.ServiceTeam;

public interface ServiceTeamRepository extends CrudRepository<ServiceTeam,Integer>{
	ServiceTeam save(ServiceTeam servicer);
	ServiceTeam findById(int servicer_id);
	List<ServiceTeam> findAll();
	void deleteByid(int servicer_id);
}
