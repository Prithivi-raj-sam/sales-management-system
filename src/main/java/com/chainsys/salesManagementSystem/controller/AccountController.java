package com.chainsys.salesmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.salesmanagementsystem.pojo.Account;
import com.chainsys.salesmanagementsystem.service.AccountService;


@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService accountserv;
	
	@GetMapping("/addform")
	public String addAccountForm(Model model) {
		Account account = new Account();
		model.addAttribute("addaccount", account);
		return "add-account-form";
	}
	@PostMapping("/addaccount")
	public String addAccount(@ModelAttribute("addaccount") Account account, Model model){
		accountserv.insertAccount(account);
		return "add-account-form";
	}
	@GetMapping("/getAccountById")
	public String getAccountById(@RequestParam("id") int id,Model model) {
		Account account=accountserv.getAccountById(id);
		model.addAttribute("getaccount", account);
		return "get-account-id-form";
	}
	@GetMapping("/deleteaccount")
	public String deleteAccountById(@RequestParam("id") int id,Model model) {
		accountserv.deleteAccountById(id);
		return "redirect:/account/allaccount";
	}
	@GetMapping("/allaccount")
	public String getAllAccount(Model model){
		List<Account> allAccount=accountserv.getAllAccount();
		model.addAttribute("allaccount", allAccount);
		return "all-account";
	}
	@GetMapping("/updateform")
	public String updateAccountForm(@RequestParam("id")int id,Model model) {
		Account account = accountserv.getAccountById(id);
		model.addAttribute("updateaccount", account);
		return "update-account-form";
	}
	@PostMapping("/updateaccount")
	public String updateAccount(@ModelAttribute("updateaccount") Account account, Model model){
		accountserv.updateAccount(account);
		return "update-account-form";
	}
	
}
