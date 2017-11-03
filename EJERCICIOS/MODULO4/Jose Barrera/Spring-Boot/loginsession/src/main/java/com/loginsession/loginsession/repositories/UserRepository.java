package com.loginsession.loginsession.repositories;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loginsession.loginsession.entities.User;

@Transactional
@Repository
public interface UserRepository extends CrudRepository<User,Long>{
	Optional<User> findByName(@Param("name") String name);
	Optional<User> findByNameAndPassword(@Param("name") String name, @Param("password") String password);
}