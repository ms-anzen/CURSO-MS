package com.login.login;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	static ArrayList<User> db = new ArrayList<>();
	
	public LoginController() {
		db.add(new User("user", "root"));
	}
	
	@RequestMapping("/login")
	public String login(Model model){
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String validateData(@RequestParam(value="name", required=true) String name,
								@RequestParam(value="pass", required=true) String pass, Model model){
		for(User user : db){
			if(name.equals(user.getUserName()) && pass.equals(user.getPassword())){
				model.addAttribute("UserName", user.getUserName());
				model.addAttribute("LastLogin",  parseDate(user.getLastLogin()));
				return "home";
			}
		}
		return "error";
	}
	
	@RequestMapping(value="/logout/{username}")
	public String logOut(@PathVariable("username") String username, Model model){
		for(User user : db){
			if(username == user.getUserName()){
				model.addAttribute("UserName", user.getUserName());
				user.setLastLogin((int) (new Date().getTime()/1000));
			}
		}
		return "logout";
	}
	
	public String parseDate(int seconds){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    Date date = (seconds == 0) ? new Date() : new Date(seconds * 1000);
	    return format.format(date);
	}
}
