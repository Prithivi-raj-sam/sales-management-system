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

import com.chainsys.salesmanagementsystem.pojo.SalesTeam;
import com.chainsys.salesmanagementsystem.service.SalesTeamService;



@Controller
@RequestMapping("/salesteam")
public class SalesTeamController {
	@Autowired
	private SalesTeamService salesteamserv;
	
	@GetMapping("/addform")
	public String addfrom(Model model) {
		SalesTeam salesman=new SalesTeam();
		model.addAttribute("addsalesman", salesman);
		return "add-sales-man";
	}
	@PostMapping("/addsalesman")
	public String addsalesman(@ModelAttribute("addsalesman") SalesTeam salesman) {
		salesteamserv.insertSeller(salesman);
		return "success";
	}
	@GetMapping("/allsalesman")
	public String getallsalesman(Model model){
		List<SalesTeam>allsalesman=salesteamserv.getAllSalesman();
		model.addAttribute("allsalesman", allsalesman);
		return "get-all-salesman";
	}
	@GetMapping("/getsalesmanbyid")
	public String getsalesManById(@RequestParam("id") int id, Model model) {
		SalesTeam salesman=salesteamserv.getSalesman(id);
		model.addAttribute("salesman", salesman);
		return "get-salesman-Id";
	}
	@GetMapping("/updateform")
	public String updateform(@RequestParam("id") int id,Model model) {
		SalesTeam salesman=salesteamserv.getSalesman(id);
		model.addAttribute("saleman", salesman);
		return "update-salesman-form";
	}
	@PostMapping("/updatesalesman")
	public String updateSalesManDetails(@ModelAttribute("saleman") SalesTeam saleman,Model model) {
		salesteamserv.updateSeller(saleman);
		return "success";
	}
	
	
}
