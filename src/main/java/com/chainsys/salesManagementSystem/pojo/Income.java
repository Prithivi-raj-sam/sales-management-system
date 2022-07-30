package com.chainsys.salesManagementSystem.pojo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="income")
public class Income {
	@Id
	private int income_id;
	private Date income_from_date; 
	private Date income_to_date;
	private int planned_leads;
	private int commited_leads;
	private int planned_sales;
	private int closed_sales; 
	private int planned_service;
	private int compled_issues; 
	private float total_sales_Amount; 
	private float total_service_Amount;
	private float total_income;
	
	public float getTotal_income() {
		return total_income;
	}
	public void setTotal_income(float total_income) {
		this.total_income = total_income;
	}
	public int getIncome_id() {
		return income_id;
	}
	public void setIncome_id(int income_id) {
		this.income_id = income_id;
	}
	public Date getIncome_from_date() {
		return income_from_date;
	}
	public void setIncome_from_date(Date income_from_date) {
		this.income_from_date = income_from_date;
	}
	public Date getIncome_to_date() {
		return income_to_date;
	}
	public void setIncome_to_date(Date income_to_date) {
		this.income_to_date = income_to_date;
	}
	public int getPlanned_leads() {
		return planned_leads;
	}
	public void setPlanned_leads(int planned_leads) {
		this.planned_leads = planned_leads;
	}
	public int getCommited_leads() {
		return commited_leads;
	}
	public void setCommited_leads(int commited_leads) {
		this.commited_leads = commited_leads;
	}
	public int getPlanned_sales() {
		return planned_sales;
	}
	public void setPlanned_sales(int planned_sales) {
		this.planned_sales = planned_sales;
	}
	public int getClosed_sales() {
		return closed_sales;
	}
	public void setClosed_sales(int closed_sales) {
		this.closed_sales = closed_sales;
	}
	public int getPlanned_service() {
		return planned_service;
	}
	public void setPlanned_service(int planned_service) {
		this.planned_service = planned_service;
	}
	public int getCompled_issues() {
		return compled_issues;
	}
	public void setCompled_issues(int compled_issues) {
		this.compled_issues = compled_issues;
	}
	public float getTotal_sales_Amount() {
		return total_sales_Amount;
	}
	public void setTotal_sales_Amount(float total_sales_Amount) {
		this.total_sales_Amount = total_sales_Amount;
	}
	public float getTotal_service_Amount() {
		return total_service_Amount;
	}
	public void setTotal_service_Amount(float total_service_Amount) {
		this.total_service_Amount = total_service_Amount;
	}
	
}
