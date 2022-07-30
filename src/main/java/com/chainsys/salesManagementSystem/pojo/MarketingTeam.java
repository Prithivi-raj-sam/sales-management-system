package com.chainsys.salesmanagementsystem.pojo;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marketing_team")
public class MarketingTeam {
	@Id
	private int marketer_id;
	private String m_name; 
	private String m_contact;
	private String m_email;
	private String m_address;
	private File m_profile;
	
	public int getMarketer_id() {
		return marketer_id;
	}
	public void setMarketer_id(int marketer_id) {
		this.marketer_id = marketer_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_contact() {
		return m_contact;
	}
	public void setM_contact(String m_contact) {
		this.m_contact = m_contact;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	public File getM_profile() {
		return m_profile;
	}
	public void setM_profile(File m_profile) {
		this.m_profile = m_profile;
	}
	
	
	
	
}
