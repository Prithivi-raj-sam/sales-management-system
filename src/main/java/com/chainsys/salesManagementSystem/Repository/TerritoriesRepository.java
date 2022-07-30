package com.chainsys.salesManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesManagementSystem.pojo.Territory;

public interface TerritoriesRepository extends CrudRepository<Territory,Integer>{
	Territory save(Territory territory);
	Territory findById(int ter_id);
	List<Territory> findAll();
	void deleteByid(int ter_id);
}
