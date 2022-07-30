package com.chainsys.salesManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesManagementSystem.pojo.Service;

public interface ServiceRepository extends CrudRepository<Service,Integer>{
	Service save(Service service);
	Service findById(int serv_id);
	List<Service> findAll();
	void deleteByid();
}
