package com.chainsys.salesManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/salesteam")
public class SalesTeamController {
	@GetMapping("/test")
	public String test(Model model) {
		return "allsalesman";
	}
}
