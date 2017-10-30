package com.mike.task.jspBoot.web.service;

import com.mike.task.jspBoot.web.domain.User;

public interface UserService {
	public void setLastVisit(User user);
	public User initializeUser(String name, String password);
}
