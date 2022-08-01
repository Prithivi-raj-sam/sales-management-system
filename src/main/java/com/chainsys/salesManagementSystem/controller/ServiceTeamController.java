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

import com.chainsys.salesmanagementsystem.pojo.ServiceTeam;
import com.chainsys.salesmanagementsystem.service.ServiceTeamService;

@Controller
@RequestMapping("/serviceteam")
public class ServiceTeamController {
	@Autowired
	private ServiceTeamService servteamserv;
	
	@GetMapping("/addservmanform")
	public String addServiceManForm(Model model) {
		ServiceTeam servman=new ServiceTeam();
		model.addAttribute("addservman", servman);
		return "add-servman-form";
	}
	@PostMapping("/addservman")
	public String addServiceMan(@ModelAttribute("addservman")ServiceTeam servman,Model model) {
		servteamserv.insertServiceman(servman);
		return "add-servman-form";
	}
	@GetMapping("/getservman")
	public String getServiceMan(@RequestParam("id")int id, Model model) {
		ServiceTeam servman=servteamserv.getServiceManById(id);
		model.addAttribute("servman", servman);
		return "get-serviceman-id";
	}
	@GetMapping("/deleteservman")
	public String deleteServMan(@RequestParam("id")int id,Model model) {
		servteamserv.deleteServiceMan(id);
		return "redirect:/serviceteam/allservman";
	}
	@GetMapping("/allservman")
	public String allServiceMan(Model model) {
		List<ServiceTeam> allservman=servteamserv.getAllService();
		model.addAttribute("allservman", allservman);
		return "all-servman";
	}
	@GetMapping("/updateservmanform")
	public String updateServiceManForm(@RequestParam("id")int id,Model model) {
		ServiceTeam servman=servteamserv.getServiceManById(id);
		model.addAttribute("updateservman", servman);
		return "update-servman-form";
	}
	@PostMapping("/updateservman")
	public String updateServiceMan(@ModelAttribute("updateservman")ServiceTeam servman,Model model) {
		servteamserv.updateServiceMan(servman);
		return "update-servman-form";
	}
	
}
