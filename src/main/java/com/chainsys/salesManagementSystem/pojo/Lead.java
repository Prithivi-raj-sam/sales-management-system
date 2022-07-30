package com.chainsys.salesmanagementsystem.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="leads")
public class Lead 
{	@Id
	private int leed_id;
	private int account_id;
	private int marketer_id;
	private String channel;
	private String status;

	public int getLeed_id() {
		return leed_id;
	}
	public void setLeed_id(int leed_id) {
		this.leed_id = leed_id;
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
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
}

 
