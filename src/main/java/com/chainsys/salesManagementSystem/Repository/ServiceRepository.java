package com.chainsys.salesmanagementsystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesmanagementsystem.pojo.Services;

public interface ServiceRepository extends CrudRepository<Services,Integer>{
	Services save(Services service);
	Services findById(int service_id);
	List<Services> findAll();
	void deleteById(int service_id);
}
