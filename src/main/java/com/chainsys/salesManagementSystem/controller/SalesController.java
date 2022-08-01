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

import com.chainsys.salesmanagementsystem.pojo.Sale;
import com.chainsys.salesmanagementsystem.service.SalesService;

@Controller
@RequestMapping("/sales")
public class SalesController {
	@Autowired
	private SalesService saleserv;
	
	@GetMapping("/addsalesform")
	public String addSalesFrom(Model model) {
		Sale sale =new Sale();
		model.addAttribute("addsale", sale);
		return "add-sales-form";
	}
	@PostMapping("/addsales")
	public String addSales(@ModelAttribute("addsale")Sale sale,Model model) {
		saleserv.insertSales(sale);
		return "add-sales-form";
	}
	@GetMapping("/deletesales")
	public String deleteSales(@RequestParam("id")int id,Model model) {
		saleserv.deleteSalesById(id);
		return "redirect:/sales/allsales";
	}
	@GetMapping("/getsales")
	public String getSalesById(@RequestParam("id")int id,Model model) {
		Sale sale=saleserv.findSalesById(id);
		model.addAttribute("sale", sale);
		return "get-sales-id";
	}
	@GetMapping("/allsales")
	public String allSales(Model model) {
		List<Sale>allsale=saleserv.getAllSales();
		model.addAttribute("allsale", allsale);
		return "all-sales";
	}
	@GetMapping("/updatesalesform")
	public String updateSalesFrom(@RequestParam("id")int id,Model model) {
		Sale sale =saleserv.findSalesById(id);
		model.addAttribute("updatesale", sale);
		return "update-sales-form";
	}
	@PostMapping("/updatesales")
	public String updateSales(@ModelAttribute("updatesale")Sale sale,Model model) {
		saleserv.insertSales(sale);
		return "update-sales-form";
	}
}
