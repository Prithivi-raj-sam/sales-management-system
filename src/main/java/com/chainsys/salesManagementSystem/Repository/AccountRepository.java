package com.chainsys.salesmanagementsystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.salesmanagementsystem.pojo.Account;

public interface AccountRepository extends CrudRepository<Account,Integer>{
	Account save(Account account);
	Account findById(int account_id);
	List<Account> findAll();
	void deleteById(int account_id);
}
