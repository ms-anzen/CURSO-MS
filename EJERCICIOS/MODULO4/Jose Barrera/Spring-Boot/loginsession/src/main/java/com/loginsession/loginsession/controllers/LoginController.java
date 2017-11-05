package com.loginsession.loginsession.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.loginsession.loginsession.entities.User;
import com.loginsession.loginsession.services.UserServiceInterface;

@Controller
@SessionAttributes("UserName")
public class LoginController {
	
	@Autowired
	UserServiceInterface service;
	
	@RequestMapping(path="/")
	public String index(SessionStatus sessionStatus) {
		if(!sessionStatus.isComplete())
			return "redirect:/login";
		return "redirect:/home";
	}
	
	@RequestMapping(path="/login")
	public String loignPage(SessionStatus sessionStatus) {
		if(!sessionStatus.isComplete())
			return "login";
		return "redirect:/home";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String login(@RequestParam(name="name", required=true) String name,
						@RequestParam(name="password", required=true) String password,
						HttpSession session, Model model) {
		
		User user;
		if((user = service.login(name, password)) != null) {
			model.addAttribute("UserName", name);
			model.addAttribute("LastLogin",  parseDate(user.getLastlogin()));
			return "home";
		}
		return "error";
	}
	
	@RequestMapping(path="/home")
	public String homePage(@ModelAttribute("UserName") String name, Model model) {
		if(name.isEmpty())
			return "login";
		model.addAttribute("LastLogin",  parseDate(service.getUser(name).getLastlogin()));
		return "home";
	}
	
	@RequestMapping(value="/logout/{username}")
	public String logOut(@ModelAttribute("UserName") String name, Model model, SessionStatus sessionStauts){
		service.updateUser(name);
		sessionStauts.setComplete();
		return "logout";
	}
	
	
	@RequestMapping(path="/accounts")
	public String accounts(@ModelAttribute("UserName") String name, Model model) {
		if(name.isEmpty()) 
			return "login";
		model.addAttribute("Accounts", service.getUserAccounts(name));
		return "accounts";
	}
	
	public String parseDate(int seconds){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    Date date = (seconds == 0) ? new Date() : new Date(seconds * 1000);
	    return format.format(date);
	}
}
