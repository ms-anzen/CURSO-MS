package com.anzen.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.anzen.models.User;



@Component
public class UserBean {

	/** Setear y obtener usuarios **/
	private List<User> users = new ArrayList<User>();

	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
}
