package com.anzen.users.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.anzen.users.domain.User;

@Repository
public class UserRepositoryImp implements UserRepository {
	private static List<User> users = new ArrayList<User>();

	@Override
	public List<User> selectUsers() {
		return users;
	}

	@Override
	public List<User> insertUser(User user){
		users.add(user);
		
		return users;
	}
	
	@Override
	public int countUsers() {
		return users.size();
	}
	
	@Override
	public User selectUser(int id) {
		for(User user : users){
			if (user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}
}
