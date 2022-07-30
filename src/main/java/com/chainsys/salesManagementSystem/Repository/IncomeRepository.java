package com.chainsys.salesmanagementsystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesmanagementsystem.pojo.Income;

public interface IncomeRepository extends CrudRepository<Income,Integer>{
	Income save(Income income);
	Income findById( int income_id);
    List<Income> findAll();
    void deleteById(int income_id);
 }
