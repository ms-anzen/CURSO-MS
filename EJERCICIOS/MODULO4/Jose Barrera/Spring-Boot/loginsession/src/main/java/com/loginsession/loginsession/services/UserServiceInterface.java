package com.loginsession.loginsession.services;

import java.util.Set;

import com.loginsession.loginsession.entities.Account;
import com.loginsession.loginsession.entities.User;

public interface UserServiceInterface {
	public void updateUser(String name);
	public User getUser(String name);
	public User login(String name, String password);
	public Set<Account> getUserAccounts(String name);
}