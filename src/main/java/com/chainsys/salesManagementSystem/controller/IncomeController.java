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

import com.chainsys.salesmanagementsystem.pojo.Income;
import com.chainsys.salesmanagementsystem.service.IncomeService;

@Controller
@RequestMapping("/income")
public class IncomeController {
	@Autowired
	private IncomeService incomeRepo;
	
	@GetMapping("/allincome")
	public String getAllIncome(Model model) {
		List<Income> allIncome=incomeRepo.getAllIncome();
		model.addAttribute("allincome", allIncome);
		return "all-income";
	}
	@GetMapping("/addincomeform")
	public String addIncomeForm(Model model) {
		Income income=new Income();
		model.addAttribute("addincome", income);
		return "add-income-form";
	}
	@PostMapping("/addincome")
	public String addIncome(@ModelAttribute("addincome") Income income,Model model) {
		incomeRepo.insertIncome(income);
		return "add-income-form";
	}
	@GetMapping("/deleteincome")
	public String deleteIncome(@RequestParam("id") int id, Model model) {
		incomeRepo.deleteIncomeById(id);
		return "add-income-form";
	}
	@GetMapping("/getIncome")
	public String getIncomeById(@RequestParam("id") int id,Model model) {
		Income income=incomeRepo.findIncomeById(id);
		model.addAttribute("getincome", income);
		return "get-income-id";
	}
	@GetMapping("/updateincomeform")
	public String updateIncomeForm(@RequestParam("id")int id,Model model) {
		Income income=incomeRepo.findIncomeById(id);
		model.addAttribute("updateincome", income);
		return "update-income-form";
	}
	@PostMapping("/updateincome")
	public String updateIncome(@ModelAttribute("updateincome") Income income,Model model) {
		incomeRepo.updateIncome(income);
		return "update-income-form";
	}
	
}
