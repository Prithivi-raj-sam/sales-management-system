package com.chainsys.salesManagementSystem.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="expenditure")
public class Expenditure {
	@Id
	private int expenditure_id; 
	private Date expenditure_from_date;
	private Date expenditure_to_date;
	private float spends_for_materials;
	private float spend_for_marketing;
	private float spends_for_emp_salary; 
	private float spends_for_electric_bill;
	private float spends_for_cleaning;
	private float other_expenditure;
	private float total_expenditure;
	
	public float getTotal_expenditure() {
		return total_expenditure;
	}
	public void setTotal_expenditure(float total_expenditure) {
		this.total_expenditure = total_expenditure;
	}
	public int getExpenditure_id() {
		return expenditure_id;
	}
	public void setExpenditure_id(int expenditure_id) {
		this.expenditure_id = expenditure_id;
	}
	public Date getExpenditure_from_date() {
		return expenditure_from_date;
	}
	public void setExpenditure_from_date(Date expenditure_from_date) {
		this.expenditure_from_date = expenditure_from_date;
	}
	public Date getExpenditure_to_date() {
		return expenditure_to_date;
	}
	public void setExpenditure_to_date(Date expenditure_to_date) {
		this.expenditure_to_date = expenditure_to_date;
	}
	public float getSpends_for_materials() {
		return spends_for_materials;
	}
	public void setSpends_for_materials(float spends_for_materials) {
		this.spends_for_materials = spends_for_materials;
	}
	public float getSpend_for_marketing() {
		return spend_for_marketing;
	}
	public void setSpend_for_marketing(float spend_for_marketing) {
		this.spend_for_marketing = spend_for_marketing;
	}
	public float getSpends_for_emp_salary() {
		return spends_for_emp_salary;
	}
	public void setSpends_for_emp_salary(float spends_for_emp_salary) {
		this.spends_for_emp_salary = spends_for_emp_salary;
	}
	public float getSpends_for_electric_bill() {
		return spends_for_electric_bill;
	}
	public void setSpends_for_electric_bill(float spends_for_electric_bill) {
		this.spends_for_electric_bill = spends_for_electric_bill;
	}
	public float getSpends_for_cleaning() {
		return spends_for_cleaning;
	}
	public void setSpends_for_cleaning(float spends_for_cleaning) {
		this.spends_for_cleaning = spends_for_cleaning;
	}
	public float getOther_expenditure() {
		return other_expenditure;
	}
	public void setOther_expenditure(float other_expenditure) {
		this.other_expenditure = other_expenditure;
	}
	
}
