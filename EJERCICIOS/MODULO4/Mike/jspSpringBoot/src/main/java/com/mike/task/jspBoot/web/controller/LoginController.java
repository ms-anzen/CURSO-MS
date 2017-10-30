package com.mike.task.jspBoot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mike.task.jspBoot.web.domain.User;
import com.mike.task.jspBoot.web.service.LoginService;
import com.mike.task.jspBoot.web.service.UserService;

@Controller
public class LoginController {
	@Autowired
    LoginService loginService;
	
	@Autowired
	UserService userService;

    @RequestMapping(value="/bienvenida.html", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }

    @RequestMapping(value="/bienvenida.html", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
        boolean isValidUser = loginService.validateUser(name, password);
        
        if (!isValidUser) {
            model.put("errorMessage", "Datos invalidos");
            return "login";
        }        
        
        User user = userService.initializeUser(name, password);
        
        model.put("date", user.getLastDate());
        model.put("name", user.getName());

        return "welcome";
    }
    
    @RequestMapping(value="/despedida.html", method = RequestMethod.GET)
    public String showGoodbyePage(ModelMap model) {       
    	return "goodbye";
    }
}
