package com.chainsys.salesManagementSystem.pojo;

import javax.persistence.Id;

public class Territory 
{	@Id
	private int territory_id;
	private String territory_name;
	private int no_of_customers;
	
	public int getTerritory_id() {
		return territory_id;
	}
	public void setTerritory_id(int territory_id) {
		this.territory_id = territory_id;
	}
	public String getTerritory_name() {
		return territory_name;
	}
	public void setTerritory_name(String territory_name) {
		this.territory_name = territory_name;
	}
	public int getNo_of_customers() {
		return no_of_customers;
	}
	public void setNo_of_customers(int no_of_customers) {
		this.no_of_customers = no_of_customers;
	}
}
  