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

import com.chainsys.salesmanagementsystem.pojo.Territory;
import com.chainsys.salesmanagementsystem.service.TerritoriesService;

@Controller
@RequestMapping("/territories")
public class TerritoriesController {
	@Autowired
	private TerritoriesService terserv;
	
	@GetMapping("/addterritoryform")
	public String addTerritoryForm(Model model) {
		Territory ter=new Territory();
		model.addAttribute("addter", ter);
		return "add-territory-form";
	}
	@PostMapping("/addterritory")
	public String addTerritory(@ModelAttribute("addter")Territory ter,Model model) {
		terserv.insertTerritory(ter);
		return "add-territory-form";
	}
	@GetMapping("/getterritory")
	public String getTerritory(@RequestParam("id")int id,Model model) {
		Territory ter=terserv.getTerritoryById(id);
		model.addAttribute("ter", ter);
		return "get-territory-id";
	}
	@GetMapping("/deleteter")
	public String deleteTerritory(@RequestParam("id")int id,Model model) {
		terserv.deleteTerritoryById(id);
		return "redirect:/territories/allterritory";
	}
	@GetMapping("/allterritory")
	public String allTerritory(Model model) {
		List<Territory>allterritory =terserv.getAllTeritories();
		model.addAttribute("allter", allterritory);
		return "all-territories";
	}
	@GetMapping("/updateterritoryform")
	public String updateTerritoryForm(@RequestParam("id")int id,Model model) {
		Territory ter=terserv.getTerritoryById(id);
		model.addAttribute("updateTerri", ter);
		return "update-territory-form";
	}
	@PostMapping("/updateterritory")
	public String updateTerritory(@ModelAttribute("updateTerri")Territory ter,Model model) {
		terserv.updateTerritory(ter);
		return "update-territory-form";
	}
	
	
}
