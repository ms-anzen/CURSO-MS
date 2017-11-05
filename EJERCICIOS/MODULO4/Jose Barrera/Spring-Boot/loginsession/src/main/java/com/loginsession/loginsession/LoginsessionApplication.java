package com.loginsession.loginsession;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.loginsession.loginsession.entities.*;
import com.loginsession.loginsession.repositories.UserRepository;

@SpringBootApplication
public class LoginsessionApplication {

	@Autowired
	UserRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(LoginsessionApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepository repo) {
		return (evt) -> {
			User a = new User("root", "root");
			Set<Account> accounts_a = new HashSet<Account>() {{
				add(new Account(12345678,"ASP A.C.", 0, a));
				add(new Account(23456789,"REDIs", 1, a));
				
			}};
			a.setAccount(accounts_a);
			
			User b = new User("admin", "admin");
			Set<Account> accounts_b = new HashSet<Account>() {{
				add(new Account(34567890, "Server Faces", 1, b));
				add(new Account(45678901, "Struts 2", 1, b));
				
			}};
			b.setAccount(accounts_b);
			
			repo.save(new HashSet<User>() {{
				add(a);
				add(b);
			}});
		};
	}
}
