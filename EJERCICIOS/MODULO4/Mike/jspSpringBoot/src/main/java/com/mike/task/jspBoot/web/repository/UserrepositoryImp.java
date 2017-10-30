package com.mike.task.jspBoot.web.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.mike.task.jspBoot.UserBean;
import com.mike.task.jspBoot.web.domain.User;

@Repository
public class UserrepositoryImp implements UserRepository {
	@Autowired
	private ApplicationContext context;
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		UserBean userBean = context.getBean(UserBean.class);
		
		return userBean.getUsers();
	}
	
	@Override
	public List<User> findByName(String name) {
		UserBean userBean = context.getBean(UserBean.class);
		List<User> findUsers = new ArrayList<User>();
		
		for (User user : userBean.getUsers()) {
			if (user.getName().equals(name)) {
				findUsers.add(user);
			}
		}
		
		return findUsers;
	}
	
	@Override
	public User findByNameAndPassword(String name, String password) {
		UserBean userBean = context.getBean(UserBean.class);
		User findUser = null;
		
		for (User user : userBean.getUsers()) {
			if (user.getName().equals(name) && user.getPassword().equals(password)) {
				findUser = user; 
			}
		}
		
		return findUser;
	}
}




