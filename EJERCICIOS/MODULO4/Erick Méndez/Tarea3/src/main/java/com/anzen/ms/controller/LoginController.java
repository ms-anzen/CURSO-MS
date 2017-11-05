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
import org.springframework.web.bind.support.SessionAttributeStore;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.anzen.ms.domain.User;
import com.anzen.ms.service.LoginService;

@Controller
@SessionAttributes("usr")
public class LoginController {
	
	@Autowired
	LoginService login;
		
	@RequestMapping("/welcome")
	public String welcome(Model model) {
		return "welcome";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String home(@RequestParam(name="userName")String name, @RequestParam(name="password")String password, ModelMap model) {
		return login.login(name, password, model);
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome(@ModelAttribute("usr")User usu, ModelMap model) {
		return login.login(usu.getUserName(), usu.getPassword(), model);
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String away(@ModelAttribute("usr")User usu, ModelMap model, SessionStatus status) {
		status.setComplete();
		return "redirect:/bye";
	}
	
	@RequestMapping(value="/bye", method=RequestMethod.GET)
	public String bye(Model model) {
		return "logout";
	}
	
}
