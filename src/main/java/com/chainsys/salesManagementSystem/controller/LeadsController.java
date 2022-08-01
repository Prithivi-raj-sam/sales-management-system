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

import com.chainsys.salesmanagementsystem.pojo.Lead;
import com.chainsys.salesmanagementsystem.service.LeadService;

@Controller
@RequestMapping("/lead")
public class LeadsController {
	@Autowired
	private LeadService leadserv;
	
	@GetMapping("/addleadform")
	public String addLeadForm(Model model) {
		Lead lead=new Lead();
		model.addAttribute("addlead", lead);
		return "add-lead-form";
	}
	@PostMapping("/addlead")
	public String addLead(@ModelAttribute("addlead") Lead lead,Model model) {
		leadserv.insertLeads(lead);
		return "add-lead-form";
	}
	@GetMapping("/getlead")
	public String getLeadById(@RequestParam("id")int id,Model model) {
		Lead lead =leadserv.getleadsById(id);
		model.addAttribute("lead", lead);
		return "get-lead-id";
	}
	@GetMapping("/deletelead")
	public String deleteLeadById(@RequestParam("id")int id,Model model) {
		leadserv.deleteLeadById(id);
		return "redirect:/lead/alllead";
	}
	@GetMapping("/alllead")
	public String allLeads(Model model) {
		List<Lead>allLead =leadserv.getAllLeads();
		model.addAttribute("alllead", allLead);
		return "all-leads";
	}
	@GetMapping("/updateleadform")
	public String updateLeadForm(@RequestParam("id")int id,Model model) {
		Lead lead=leadserv.getleadsById(id);
		model.addAttribute("updatelead", lead);
		return "update-lead-form";
	}
	@PostMapping("/updatelead")
	public String updateLead(@ModelAttribute("updatelead") Lead lead,Model model) {
		leadserv.updateLeads(lead);
		return "update-lead-from";
	}
}
