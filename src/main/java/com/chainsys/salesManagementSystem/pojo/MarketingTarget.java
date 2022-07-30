package com.chainsys.salesManagementSystem.pojo;

import java.util.Date;

import javax.persistence.Id;

public class MarketingTarget {
	private Date marketing_date;
	private int marketer_id;
	private int planned_leads;
	private int achieved_leads;
	private String manager_comment;
	
	public Date getMarketing_date() {
		return marketing_date;
	}
	public void setMarketing_date(Date marketing_date) {
		this.marketing_date = marketing_date;
	}
	public int getMarketer_id() {
		return marketer_id;
	}
	public void setMarketer_id(int marketer_id) {
		this.marketer_id = marketer_id;
	}
	public int getPlanned_leads() {
		return planned_leads;
	}
	public void setPlanned_leads(int planned_leads) {
		this.planned_leads = planned_leads;
	}
	public int getAchieved_leads() {
		return achieved_leads;
	}
	public void setAchieved_leads(int achieved_leads) {
		this.achieved_leads = achieved_leads;
	}
	public String getManager_comment() {
		return manager_comment;
	}
	public void setManager_comment(String manager_comment) {
		this.manager_comment = manager_comment;
	}
}
 