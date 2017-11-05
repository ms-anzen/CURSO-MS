package com.mike.task.jspBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mike.task.jspBoot.web.domain.User;

@Component
public class UserBean {
	private List<User> users = new ArrayList<User>();
	
	public List<User> getUsers(){
		return this.users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
