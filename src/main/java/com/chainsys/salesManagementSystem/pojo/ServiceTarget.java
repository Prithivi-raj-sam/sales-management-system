package com.chainsys.salesmanagementsystem.pojo;

import java.util.Date;

import javax.persistence.Id;

public class ServiceTarget {

	private Date service_date;
	private int servicer_id;
	private int planned_service;
	private int completed_issues;
	private int manager_comment;

	public Date getService_date() {
		return service_date;
	}
	public void setService_date(Date service_date) {
		this.service_date = service_date;
	}
	public int getServicer_id() {
		return servicer_id;
	}
	public void setServicer_id(int servicer_id) {
		this.servicer_id = servicer_id;
	}
	public int getPlanned_service() {
		return planned_service;
	}
	public void setPlanned_service(int planned_service) {
		this.planned_service = planned_service;
	}
	public int getCompleted_issues() {
		return completed_issues;
	}
	public void setCompleted_issues(int completed_issues) {
		this.completed_issues = completed_issues;
	}
	public int getManager_comment() {
		return manager_comment;
	}
	public void setManager_comment(int manager_comment) {
		this.manager_comment = manager_comment;
	}
	
}
 