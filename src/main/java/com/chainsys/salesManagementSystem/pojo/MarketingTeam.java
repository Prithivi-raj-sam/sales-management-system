package com.chainsys.salesManagementSystem.pojo;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="marketing_team")
public class MarketingTeam {
	private int servicer_id; 
	private String ser_name; 
	private long ser_contact; 
	private String ser_email; 
	private String ser_address; 
	private File ser_profile;
	
	public int getServicer_id() {
		return servicer_id;
	}
	public void setServicer_id(int servicer_id) {
		this.servicer_id = servicer_id;
	}
	public String getSer_name() {
		return ser_name;
	}
	public void setSer_name(String ser_name) {
		this.ser_name = ser_name;
	}
	public long getSer_contact() {
		return ser_contact;
	}
	public void setSer_contact(long ser_contact) {
		this.ser_contact = ser_contact;
	}
	public String getSer_email() {
		return ser_email;
	}
	public void setSer_email(String ser_email) {
		this.ser_email = ser_email;
	}
	public String getSer_address() {
		return ser_address;
	}
	public void setSer_address(String ser_address) {
		this.ser_address = ser_address;
	}
	public File getSer_profile() {
		return ser_profile;
	}
	public void setSer_profile(File ser_profile) {
		this.ser_profile = ser_profile;
	}
	
}
