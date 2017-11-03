package com.anzen.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anzen.ms.entities.*;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
