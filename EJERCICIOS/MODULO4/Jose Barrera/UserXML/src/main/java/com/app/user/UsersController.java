package com.app.user;

import java.util.Vector;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersController {
	private static  Vector<User> data = new Vector<User>();
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public String list(Model model){
		Vector<User> data = getData();
		
		model.addAttribute("data", data);
		return "users_list";
	}
	
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public String add(@RequestParam (value="name", required=true) String name, 
						@RequestParam(value="lname", required=true) String lastname,
						@RequestParam(value="age", required=true) int age,
						@RequestParam(value="email", required=true) String email, Model model){
		Vector<User> data = getData();
		data.add(new User(name, lastname, age, email));
		
		model.addAttribute("data", data);
		return "users_list";
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.GET)
	public String list(@PathVariable("id") int index, Model model){
		Vector<User> data = getData();
		User requested = null;
		if((requested = data.get(index)) != null)
			model.addAttribute("user", requested);
		return "user_search";
	}
	
	public Vector<User> getData(){
		return UsersController.data;
	}
}
