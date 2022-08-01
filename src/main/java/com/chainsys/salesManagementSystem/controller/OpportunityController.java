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

import com.chainsys.salesmanagementsystem.pojo.Opportunity;
import com.chainsys.salesmanagementsystem.service.OpportunityService;

@Controller
@RequestMapping("/opportunity")
public class OpportunityController {
	@Autowired
	private OpportunityService oppserv;
	
	@GetMapping("/addoppform")
	public String addOpportunityForm(Model model) {
		Opportunity opp=new Opportunity();
		model.addAttribute("addopp", opp);
		return "add-opp-form";
	}
	@PostMapping("/addopp")
	public String addOppertunity(@ModelAttribute("addopp")Opportunity opp,Model model) {
		oppserv.insertOpportunity(opp);
		return "add-opp-form";
	}
	@GetMapping("/all-opp")
	public String getAllOpportunity(Model model) {
		List<Opportunity>allopp=oppserv.findAllOpportunity();
		model.addAttribute("allopp", allopp);
		return "all-opportunity";
	}
	@GetMapping("/deleteopp")
	public String deleteOpportunity(@RequestParam("id")int id,Model model) {
		oppserv.deleteOpportunityById(id);
		return "redirect:/opportunity/deleteopp";
	}
	@GetMapping("/getopportunity")
	public String getOpportunityById(@RequestParam("id")int id,Model model) {
		Opportunity opp=oppserv.findOpportunityById(id);
		model.addAttribute("opp", opp);
		return "get-opp-id";
	}
	@GetMapping("/updateoppform")
	public String updateOpportunityForm(@RequestParam("id")int id,Model model) {
		Opportunity opp=oppserv.findOpportunityById(id);
		model.addAttribute("updateopp", opp);
		return "update-opp-form";
	}
	@PostMapping("/updateopp")
	public String updateOppertunity(@ModelAttribute("updateopp")Opportunity opp,Model model) {
		oppserv.insertOpportunity(opp);
		return "update-opp-form";
	}
}
