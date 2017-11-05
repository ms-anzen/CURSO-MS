package com.loginsession.loginsession.repositories;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;


public class UserRepositoryCustomImpl {
	
	@Autowired
	UserRepository repo;
	
	public void update(String name) {
		if(repo.findByName(name).isPresent())
			repo.findByName(name).get().setLastlogin((int) (new Date().getTime()/1000));
	}
}
