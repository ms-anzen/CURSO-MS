package com.anzen.users.service;

import java.util.List;

import com.anzen.users.domain.User;

public interface UserService {
	public User getUserById(int id);
	public List<User> getUsers();
	public List<User> addUser(User user);
}
