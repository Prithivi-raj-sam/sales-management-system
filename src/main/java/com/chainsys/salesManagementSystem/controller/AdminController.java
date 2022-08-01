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

import com.chainsys.salesmanagementsystem.pojo.Admin;
import com.chainsys.salesmanagementsystem.service.AdminService;

@Controller
@RequestMapping("/admins")
public class AdminController {
	@Autowired
	private AdminService adminserv; 
	
	@GetMapping("/addadminform")
	public String addAdminForm(Model model) {
		Admin admin =new Admin();
		model.addAttribute("addadmin", admin);
		return "add-admin-form";
	}
	@PostMapping("/addadmin")
	public String addAdmin(@ModelAttribute("addadmin") Admin admin,Model model) {
		adminserv.insertAdmin(admin);
		return "add-admin-form";
	}
	@GetMapping("/adminlist")
	public String getAllAdmin(Model model) {
		List<Admin> alladmin=adminserv.getAllAdmin();
		model.addAttribute("alladmin", alladmin);
		return "all-admin";
	}
	@GetMapping("/deleteadmin")
	public String deleteAdmin(@RequestParam("id")int id,Model model) {
		adminserv.deleteAdmin(id);
		return "redirect:/admins/adminlist";
	}
	@GetMapping("/getadmin")
	public String getAdminById(@RequestParam("id")int id,Model model) {
		Admin admin=adminserv.findById(id);
		model.addAttribute("admin", admin);
		return "get-admin-id";
	}
	@GetMapping("/updateadminform")
	public String updateAdminForm(@RequestParam("id")int id ,Model model) {
		Admin admin=adminserv.findById(id);
		model.addAttribute("updateadmin", admin);
		return "update-admin-form";
	}
	@PostMapping("/updateadmin")
	public String updateAdmin(@ModelAttribute("updateadmin") Admin admin,Model model) {
		adminserv.updateAdmin(admin);
		return "update-admin-form";
	}
	
}
