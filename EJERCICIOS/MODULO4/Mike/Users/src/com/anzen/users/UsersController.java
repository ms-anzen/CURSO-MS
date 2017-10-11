package com.anzen.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anzen.users.domain.User;
import com.anzen.users.service.UserService;

@Controller
public class UsersController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users")
	public ModelAndView getAll(User user) {
		userService.addUser(user);
		
		ModelAndView model = new ModelAndView("users");
		model.addObject("users", userService.getUsers());

		return model;	
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.GET)
	public ModelAndView getById(@PathVariable("id") int id) {
		User user = userService.getUserById(id);
		
		ModelAndView model = new ModelAndView("users");
		model.addObject("user", user);
		
		return model;
	}
	
	@RequestMapping(value="/addUser")
	public String addUser(@ModelAttribute User user) {					
		return "addUser";
	}
}
