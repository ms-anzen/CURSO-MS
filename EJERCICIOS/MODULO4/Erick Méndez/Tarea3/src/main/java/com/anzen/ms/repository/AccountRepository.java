package com.anzen.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anzen.ms.domain.User;

@Repository
public interface AccountRepository extends JpaRepository<User, Integer> {

}
