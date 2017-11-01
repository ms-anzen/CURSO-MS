package com.anzen.ms.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.anzen.ms.entities.User;
import com.anzen.ms.repository.UserRepository;

@Controller
public class LoginController {
	@Autowired
	UserRepository repo;

	@RequestMapping("/bienvenida")
	public String welcome(Model model) {
		return "welcome";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam(name="usuario",required=true) String userName, 
			@RequestParam(name="pass", required=true) String password, Model model) {
		model.addAttribute("userName", userName);
		model.addAttribute("lastDate", new Date());
		repo.save(new User(userName, password));
		return "home";
	}
	
	@RequestMapping(value="/getUser", method=RequestMethod.GET)
	public ResponseEntity<User> getUser() {
		List<User> users = repo.findAll();
		for (User user : users) {
			System.out.println(user);
		}
		return new ResponseEntity<User>(repo.findOne(0), HttpStatus.OK);
	}
}
