package com.anzen.repository;

import java.util.List;

import com.anzen.models.User;

public interface UserRepository {

	public List<User> findAllUsers();
	public void updateUser(User u);
	public User findById(String id);
}
