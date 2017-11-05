package com.anzen.ms.service;

import org.springframework.ui.ModelMap;

import com.anzen.ms.domain.User;

public interface LoginService {
	public String login(String userName, String password, ModelMap model);
	public String logout(User user, ModelMap model);
}
