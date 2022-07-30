package com.chainsys.salesmanagementsystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesmanagementsystem.pojo.Territory;

public interface TerritoriesRepository extends CrudRepository<Territory,Integer>{
	Territory save(Territory territory);
	Territory findById(int territory_id);
	List<Territory> findAll();
	void deleteById(int territory_id);
}
