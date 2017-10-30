package com.mike.task.jspBoot.web.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mike.task.jspBoot.web.domain.User;
import com.mike.task.jspBoot.web.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void setLastVisit(User user) {
		// TODO Auto-generated method stub
		user.setLastDate(new Date());
	}

	public User initializeUser(String name, String password) {
		User user = userRepository.findByNameAndPassword(name, password);
		
		user.setLastDate(new Date());
		
		return user;
	}
}
