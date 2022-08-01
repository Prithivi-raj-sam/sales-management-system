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

import com.chainsys.salesmanagementsystem.pojo.Profit;
import com.chainsys.salesmanagementsystem.service.ProfitService;

@Controller
@RequestMapping("/profit")
public class ProfitController {
	@Autowired
	private ProfitService profitserv;
	
	@GetMapping("/addprofitform")
	public String addProfitForm(Model model) {
		Profit profit=new Profit();
		model.addAttribute("addprofit", profit);
		return "add-profit-form";
	}
	@PostMapping("/addprofit")
	public String addProfit(@ModelAttribute("addprofit")Profit profit,Model model) {
		profitserv.insertProfit(profit);
		return "add-profit-form";
	}
	@GetMapping("/deleteprofit")
	public String deleteProfitById(@RequestParam("id")int id,Model model) {
		profitserv.deleteProfitById(id);
		return "all-profit";
	}
	@GetMapping("/getallprofit")
	public String getAllProfit(Model model) {
		List<Profit> allprofit=profitserv.getAllProfit();
		model.addAttribute("allprofit", allprofit);
		return "all-profit";
	}
	@GetMapping("/getprofit")
	public String getProfitById(@RequestParam("id")int id, Model model) {
		Profit profit=profitserv.getProfitById(id);
		model.addAttribute("profit", profit);
		return "get-profit-id";
	}
	@GetMapping("/updateprofitform")
	public String updateProfitForm(@RequestParam("id")int id,Model model) {
		Profit profit=profitserv.getProfitById(id);
		model.addAttribute("updateprofit", profit);
		return "update-profit-form";
	}
	@PostMapping("/updateprofit")
	public String updateProfit(@ModelAttribute("updateprofit")Profit profit,Model model) {
		profitserv.updateProfit(profit);
		return "update-profit-form";
	}
	
}
