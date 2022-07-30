package com.chainsys.salesmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.salesmanagementsystem.Repository.AccountRepository;
import com.chainsys.salesmanagementsystem.pojo.Account;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accrepo;
	
	public Account getAccountById(int id) {
		return accrepo.findById(id);
	}
	public List<Account> getAllAccount(){
		return accrepo.findAll();
	}
	public void insertAccount(Account account) {
		accrepo.save(account);
	}
	public void updateAccount(Account account) {
		accrepo.save(account);
	}
	public void deleteAccountById(int id) {
		accrepo.deleteById(id);
	}
}
