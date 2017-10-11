package com.anzen.users.domain;

public class User {
	private int id;
	private String name;
	private String ap_pat;
	private String ap_mat;
	private String phone;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAp_pat() {
		return ap_pat;
	}
	
	public void setAp_pat(String ap_pat) {
		this.ap_pat = ap_pat;
	}
	
	public String getAp_mat() {
		return ap_mat;
	}
	
	public void setAp_mat(String ap_mat) {
		this.ap_mat = ap_mat;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String isNull() {
		return this.name;
	}
}
