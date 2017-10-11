package com.anzen.users.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.anzen.users.domain.User;

public interface UserRepository {
	public User selectUser(int id);
	public List<User> selectUsers();
	public List<User> insertUser(User user);
	public int countUsers();
}
