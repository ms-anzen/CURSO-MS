package com.mike.task.jspBoot.web.repository;

import java.util.List;

import com.mike.task.jspBoot.web.domain.User;

public interface UserRepository {
	public List<User> findAll();
	public List<User> findByName(String name);
	public User findByNameAndPassword(String name, String password);
}
