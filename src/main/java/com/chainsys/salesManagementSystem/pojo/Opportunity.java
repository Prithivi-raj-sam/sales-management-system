package com.chainsys.salesManagementSystem.pojo;

import javax.persistence.Id;

public class Opportunity 
{	@Id
	private int opp_id;
	private int account_id;
	private int marketer_id;
	private String stages;
	private float amount;
	private String fiscal_period;
	private float propability; 
	
	public int getOpp_id() {
		return opp_id;
	}
	public void setOpp_id(int opp_id) {
		this.opp_id = opp_id;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public int getMarketer_id() {
		return marketer_id;
	}
	public void setMarketer_id(int marketer_id) {
		this.marketer_id = marketer_id;
	}
	public String getStages() {
		return stages;
	}
	public void setStages(String stages) {
		this.stages = stages;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getFiscal_period() {
		return fiscal_period;
	}
	public void setFiscal_period(String fiscal_period) {
		this.fiscal_period = fiscal_period;
	}
	public float getPropability() {
		return propability;
	}
	public void setPropability(float propability) {
		this.propability = propability;
	}
	

}
 