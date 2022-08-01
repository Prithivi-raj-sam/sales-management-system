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

import com.chainsys.salesmanagementsystem.pojo.Services;
import com.chainsys.salesmanagementsystem.service.ServicesService;



@Controller
@RequestMapping("/service")
public class ServiceController {
	@Autowired
	private ServicesService serserv;
	
	@GetMapping("/addserviceform")
	public String addServiceForm(Model model) {
		Services serv=new Services();
		model.addAttribute("addserv", serv);
		return "add-service-form";
	}
	@PostMapping("/addservice")
	public String addService(@ModelAttribute("addserv")Services serv,Model model) {
		serserv.insertService(serv);
		return "add-service-form";
	}
	@GetMapping("/getservice")
	public String getServiceById(@RequestParam("id")int id,Model model) {
		Services serv=serserv.getServiceById(id);
		model.addAttribute("serv", serv);
		return "get-service-id";
	}
	@GetMapping("/deleteservice")
	public String deleteService(@RequestParam("id")int id,Model model) {
		serserv.deleteServiceById(id);
		return "redirect:/service/all-service";
	}
	@GetMapping("/allservice")
	public String allService(Model model) {
		List<Services>allserv=serserv.getAllService();
		model.addAttribute("allserv", allserv);
		return "all-service";
	}
	@GetMapping("/updateserviceform")
	public String updateServiceForm(@RequestParam("id")int id,Model model) {
		Services serv=serserv.getServiceById(id);
		model.addAttribute("updateserv", serv);
		return "update-service-form";
	}
	@PostMapping("/updateservice")
	public String updateService(@ModelAttribute("updateserv")Services serv,Model model) {
		serserv.updateService(serv);
		return "update-service-form";
	}
	
	
	

}
