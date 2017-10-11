package com.anzen.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anzen.users.domain.User;
import com.anzen.users.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUserById(int id) {
		return userRepository.selectUser(id);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.selectUsers();
	}

	@Override
	public List<User> addUser(User user){	
		int id = userRepository.countUsers() + 1;
		
		user.setId(id);
		
		return user.isNull() == null ? null : userRepository.insertUser(user);
	}
}
