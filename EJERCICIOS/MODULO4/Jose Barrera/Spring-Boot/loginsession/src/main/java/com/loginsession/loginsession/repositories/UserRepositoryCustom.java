package com.loginsession.loginsession.repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.loginsession.loginsession.entities.User;

@Repository
public interface UserRepositoryCustom {
	public Optional<User> updateLastLogin(String name);
}

