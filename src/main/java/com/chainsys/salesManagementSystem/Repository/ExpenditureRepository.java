package com.chainsys.salesmanagementsystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesmanagementsystem.pojo.Expenditure;

public interface ExpenditureRepository extends CrudRepository<Expenditure,Integer>{
	Expenditure save(Expenditure expenditure);
	void deleteById(int expenditure_id);
	Expenditure findById(int expenditure_id);
	List<Expenditure> findAll();
}
