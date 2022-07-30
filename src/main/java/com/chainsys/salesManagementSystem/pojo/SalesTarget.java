package com.chainsys.salesmanagementsystem.pojo;

import java.util.Date;

public class SalesTarget 
{
	private Date sale_date;
	private int seller_id;
	private int planned_sales;
	private int closed_sales;
	private String manager_comment;
	
	public Date getSale_date() {
		return sale_date;
	}
	public void setSale_date(Date sale_date) {
		this.sale_date = sale_date;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
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
	public String getManager_comment() {
		return manager_comment;
	}
	public void setManager_comment(String manager_comment) {
		this.manager_comment = manager_comment;
	}
	

}
