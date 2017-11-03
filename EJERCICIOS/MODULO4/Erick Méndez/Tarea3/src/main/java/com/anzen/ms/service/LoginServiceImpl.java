package com.anzen.ms.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.anzen.ms.domain.User;
import com.anzen.ms.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserRepository repoUser;

	@Override
	public String login(String userName, String password, ModelMap model) {
		User usu = repoUser.findByUserName(userName);
		System.out.println(usu);
		if (usu != null ) {
			if (usu.getUserName().equals(userName) && usu.getPassword().equals(password)) {
				model.addAttribute("name", usu.getName() + " " + usu.getLastname());
				model.addAttribute("lastLogin", usu.getLastLogin());
				usu.setLastLogin(new Date());
				model.put("usr", usu);
				repoUser.save(usu);
			} else {
				return "loginFailed";
			}
		} else {
			return "loginFailed";
		}
		return "home";
	}

	@Override
	public String logout(User user, ModelMap model) {
		System.out.println(user);	
		return "bye";
	}

}
