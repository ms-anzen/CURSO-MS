package com.anzen.services;

import java.util.List;

import com.anzen.models.User;

public interface UserService {
	
	public List<User> getAllUsers();
	public boolean isValidUser(String user, String pass);
	public User getCurrentUser();
	public User buscarPorId(String id);
	public String ultimoAcceso();
}
