package com.mike.task.jspBoot.web.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.mike.task.jspBoot.web.domain.Account;
import com.mike.task.jspBoot.web.domain.User;
import com.mike.task.jspBoot.web.service.LoginService;
import com.mike.task.jspBoot.web.service.UserService;
import com.mike.task.jspBoot.web.service.AccountService;

@Controller
@SessionAttributes("id")
public class LoginController {
	@Autowired
    LoginService loginService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	AccountService accountService;

    @RequestMapping(value="/bienvenida.html", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
    	String view = "login";
    	
    	int id = 0;
    	User user = null;
    	
    	if(model.containsKey("id")) {
    		id = (int) model.get("id");
    		user = userService.getUser(id);
    		
    		if (user != null) {
    			model.put("id", user.getId());
    	        model.put("date", user.getLastDate());
    	        model.put("name", user.getName());
    	        
    	        view = "welcome";
    		}    		
    	}
    	
        return view;
    }

    @RequestMapping(value="/bienvenida.html", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
        boolean isValidUser = loginService.validateUser(name, password);
        
        if (!isValidUser) {
            model.put("errorMessage", "Datos invalidos");
            return "login";
        }        
        
        User user = userService.initializeUser(name, password);
        
        model.put("id", user.getId());
        model.put("date", user.getLastDate());
        model.put("name", user.getName());

        return "welcome";
    }
    
    @RequestMapping(value="/getAccounts", method=RequestMethod.GET)
    public String getCustomerAccounts(ModelMap model) {    	
    	int id = (int) model.get("id");
    	
    	List<Account> accounts = accountService.getAccounts(id);
    	model.put("accounts", accounts);    	
    	
    	return "accounts";
    }
    
    @RequestMapping(value="/despedida.html", method = RequestMethod.GET)
    public String showGoodbyePage(ModelMap model, SessionStatus status) {  
    	int id = (int) model.get("id");
    	
    	User user = userService.getUser(id);    	
    	user.setLastDate(new Date());
    	
    	status.setComplete();
    	
    	return "goodbye";
    }
}
