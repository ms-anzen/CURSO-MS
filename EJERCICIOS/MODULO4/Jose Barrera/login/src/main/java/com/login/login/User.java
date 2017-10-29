package com.login.login;

public class User {
	public String UserName;
	public String Password;
	public int LastLogin;
	
	public User(String UserName, String Password) {
		this.UserName = UserName;
		this.Password = Password;
		this.LastLogin = 0;
	}
	
	public String getUserName() {
		return UserName;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public int getLastLogin() {
		return LastLogin;
	}
	
	public void setLastLogin(int lastLogin) {
		LastLogin = lastLogin;
	}
}
