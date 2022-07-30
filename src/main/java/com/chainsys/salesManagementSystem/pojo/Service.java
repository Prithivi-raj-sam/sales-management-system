package com.chainsys.salesManagementSystem.pojo;

import java.util.Date;

import javax.persistence.Id;

public class Service 
{	@Id
	private int case_no;
	private int ser_id;
	private Date sevice_date;
	private int account_id;
	private String issues;
	private String status;
	private String proirity;
	private String channel;
	
	public int getCase_no() {
		return case_no;
	}
	public void setCase_no(int case_no) {
		this.case_no = case_no;
	}
	public int getSer_id() {
		return ser_id;
	}
	public void setSer_id(int ser_id) {
		this.ser_id = ser_id;
	}
	public Date getSevice_date() {
		return sevice_date;
	}
	public void setSevice_date(Date sevice_date) {
		this.sevice_date = sevice_date;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public String getIssues() {
		return issues;
	}
	public void setIssues(String issues) {
		this.issues = issues;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProirity() {
		return proirity;
	}
	public void setProirity(String proirity) {
		this.proirity = proirity;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
}
 