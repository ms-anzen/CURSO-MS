package com.anzen.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.anzen.ms.domain.User;
import com.anzen.ms.repository.UserRepository;
import com.anzen.ms.service.UserService;

@Controller
@SessionAttributes("usr")
public class UserController {
	
	@Autowired
	UserService user;
	
	@RequestMapping(value="/accounts", method=RequestMethod.GET)
	public String getAccounts(@ModelAttribute("usr")User usu, ModelMap model) {
		return user.getAccounts(usu.getUserName(), model);
	}
}
