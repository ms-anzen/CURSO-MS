package com.anzen.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import com.anzen.ms.domain.Account;
import com.anzen.ms.domain.User;
import com.anzen.ms.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repo;
	
	@Override
	public String getUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAccounts(String userName, ModelMap model) {
		User usu=repo.findByUserName(userName);
		model.addAttribute("accounts", usu.getAccounts());
		return "accountsUser";
	}

}
