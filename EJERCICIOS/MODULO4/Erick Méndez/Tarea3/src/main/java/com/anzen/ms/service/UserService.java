package com.anzen.ms.service;

import org.springframework.ui.ModelMap;


public interface UserService {

	public String getUser(String userName);
	
	public String getAccounts(String userName, ModelMap model);
}
