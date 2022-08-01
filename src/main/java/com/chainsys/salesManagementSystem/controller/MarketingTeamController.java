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

import com.chainsys.salesmanagementsystem.pojo.MarketingTeam;
import com.chainsys.salesmanagementsystem.service.MarketingTeamService;

@Controller
@RequestMapping("/Marketingteam")
public class MarketingTeamController {
	@Autowired
	private MarketingTeamService markserv;
	
	@GetMapping("/addmarkform")
	public String addMarketingManForm(Model model) {
		MarketingTeam markMan= new MarketingTeam();
		model.addAttribute("addmarkman", markMan);
		return "add-marketman-form";
	}
	@PostMapping("/addmark")
	public String addMarketingMan(@ModelAttribute("addmarkman")MarketingTeam markman,Model model) {
		markserv.insertMarketingMan(markman);
		return "add-marketman-form";
	}
	@GetMapping("/deletemarketman")
	public String deleteMarketTeam(@RequestParam("id")int id,Model model) {
		markserv.deleteMarketManById(id);
		return "redirect:/Marketingteam/allmark";
	}
	@GetMapping("/getmark")
	public String getMarketManById(@RequestParam("id")int id, Model model) {
		MarketingTeam markteam=markserv.getMarketManById(id);
		model.addAttribute("markteam", markteam);
		return "get-marketman-id";
	}
	@GetMapping("/allmark")
	public String getAllMarketingMan(Model model) {
		List<MarketingTeam> allmark=markserv.getAllMarketMan();
		model.addAttribute("allmark", allmark);
		return "all-marketman";
	}
	@GetMapping("/updatemarkform")
	public String updateMarketingManForm(@RequestParam("id")int id,Model model) {
		MarketingTeam markMan= markserv.getMarketManById(id);
		model.addAttribute("updatemarkman", markMan);
		return "update-marketman-form";
	}
	@PostMapping("/updatemark")
	public String updateMarketingMan(@ModelAttribute("updatemarkman")MarketingTeam markman,Model model) {
		markserv.updateMarketMan(markman);
		return "update-marketman-form";
	}
	
}
