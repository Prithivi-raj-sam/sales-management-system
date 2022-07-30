package com.chainsys.salesManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesManagementSystem.pojo.Income;

public interface IcomeRepository extends CrudRepository<Income,Integer>{
	Income save(Income income);
	Income findById( int income_id);
    List<Income> findAll();
    void deleteById(int income_id);
 }
