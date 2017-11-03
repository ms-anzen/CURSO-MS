package com.mike.task.jspBoot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mike.task.jspBoot.web.domain.User;
import com.mike.task.jspBoot.web.repository.UserRepository;

@Service
public class LoginService {
	@Autowired
	private UserRepository userRepository;
	
	public boolean validateUser(String name, String password) {      		
		boolean isAutenticated = false;
		
		User user = userRepository.findByNameAndPassword(name, password);
		
		if (user != null) {
			isAutenticated = true;			
		}
		
        return isAutenticated;
    }
}
