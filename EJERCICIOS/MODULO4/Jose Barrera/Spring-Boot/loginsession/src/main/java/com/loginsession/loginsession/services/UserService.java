package com.loginsession.loginsession.services;

import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginsession.loginsession.entities.Account;
import com.loginsession.loginsession.entities.User;
import com.loginsession.loginsession.repositories.UserRepository;

@Service
public class UserService implements UserServiceInterface{
	
	@Autowired
	UserRepository repo;
	
	public void updateUser(String name) {
		User user = repo.findByName(name).get();
		user.setLastlogin((int) (new Date().getTime()/1000));
		repo.save(user);
	}
	
	@Override
	public Set<Account> getUserAccounts(String name) {
		return repo.findByName(name).get().getAccount();
	}
	
	@Override
	public User getUser(String name) {
		return repo.findByName(name).get();
	}

	@Override
	public User login(String name, String password) {
		return repo.findByNameAndPassword(name, password).get();
	}
	
}
