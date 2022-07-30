package com.chainsys.salesmanagementsystem.pojo;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="seller_team")
public class SalesTeam {
	@Id
	private int seller_id;
	private String sel_name;
	private long sel_contact; 
	private String sel_email; 
	private String sel_address; 
	private File sel_profile;
	
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	public String getSel_name() {
		return sel_name;
	}
	public void setSel_name(String sel_name) {
		this.sel_name = sel_name;
	}
	public long getSel_contact() {
		return sel_contact;
	}
	public void setSel_contact(long sel_contact) {
		this.sel_contact = sel_contact;
	}
	public String getSel_email() {
		return sel_email;
	}
	public void setSel_email(String sel_email) {
		this.sel_email = sel_email;
	}
	public String getSel_address() {
		return sel_address;
	}
	public void setSel_address(String sel_address) {
		this.sel_address = sel_address;
	}
	public File getSel_profile() {
		return sel_profile;
	}
	public void setSel_profile(File sel_profile) {
		this.sel_profile = sel_profile;
	}

}
