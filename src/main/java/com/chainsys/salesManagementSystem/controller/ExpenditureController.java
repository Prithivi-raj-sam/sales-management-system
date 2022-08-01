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

import com.chainsys.salesmanagementsystem.pojo.Expenditure;
import com.chainsys.salesmanagementsystem.service.ExpenditureService;

@Controller
@RequestMapping("/expenditure")
public class ExpenditureController {
	@Autowired
	private ExpenditureService expserv;
	@GetMapping("/addexpform")
	public String addExpenditureForm(Model model) {
		Expenditure exp=new Expenditure();
		model.addAttribute("addexp", exp);
		return "add-exp-form";
	}
	@PostMapping("/addexp")
	public String addExpenditure(@ModelAttribute("addexp") Expenditure exp,Model model) {
		expserv.insertExpenditure(exp);
		return "add-exp-form";
	}
	@GetMapping("/deleteexp")
	public String deleteExpForm(@RequestParam("id") int id,Model model) {
		expserv.deletExpenditureById(id);
		return "redirect:/expenditure/allexp";
	}
	@GetMapping("/allexp")
	public String allExpenditure(Model model) {
		List<Expenditure> allexp=expserv.getAllExpenditure();
		model.addAttribute("allexp", allexp);
		return "all-expenditure";
	}
	@GetMapping("/getexp")
	public String getExpenditureById(@RequestParam("id")int id, Model model) {
	     Expenditure exp=expserv.getExpenditureById(id);
	     model.addAttribute("exp", exp);
	     return "get-expenditure-id";
	}
	@GetMapping("/updateexpform")
	public String updateExpenditureForm(@RequestParam("id")int id,Model model) {
		Expenditure exp=expserv.getExpenditureById(id);
		model.addAttribute("updateexp", exp);
		return "update-exp-form";
	}
	@PostMapping("/updateexp")
	public String updateExpenditure(@ModelAttribute("updateexp") Expenditure exp,Model model) {
		expserv.updateExpenditure(exp);
		return "update-exp-form";
	}
	
	
}

