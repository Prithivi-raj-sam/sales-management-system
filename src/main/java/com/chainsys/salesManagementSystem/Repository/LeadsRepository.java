package com.chainsys.salesmanagementsystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesmanagementsystem.pojo.Lead;

public interface LeadsRepository extends CrudRepository<Lead,Integer>{
	Lead save(Lead lead);
	void deleteById(int lead_id);
	Lead findById(int lead_id);
	List<Lead> findAll();
}
