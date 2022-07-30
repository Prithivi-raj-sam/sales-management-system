package com.chainsys.salesManagementSystem.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profit")
public class Profit {
	@Id
	private int profit_id;
	private int income_id;
	private int expenditure_id;
	private float profit_Amount;
	
	public int getProfit_id() {
		return profit_id;
	}
	public void setProfit_id(int profit_id) {
		this.profit_id = profit_id;
	}
	public int getIncome_id() {
		return income_id;
	}
	public void setIncome_id(int income_id) {
		this.income_id = income_id;
	}
	public int getExpenditure_id() {
		return expenditure_id;
	}
	public void setExpenditure_id(int expenditure_id) {
		this.expenditure_id = expenditure_id;
	}
	public float getProfit_Amount() {
		return profit_Amount;
	}
	public void setProfit_Amount(float profit_Amount) {
		this.profit_Amount = profit_Amount;
	}

}
