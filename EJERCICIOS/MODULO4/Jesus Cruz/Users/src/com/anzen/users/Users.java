package com.anzen.users;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Users {
	
	private List<Usuarios> list;
	private Usuarios user;	//id, age, name, lastName, mail
	public Users(){
		list=new ArrayList<Usuarios>();
		user=new Usuarios(1,23,"Jesus","Cruz","jesus@mail.mx");
		list.add(user);
		user=new Usuarios(2,29,"Ezequiel","Coahuilazo","ezequiel@mail.mx");
		list.add(user);
		user=new Usuarios(3,28,"Benjamin","Martinez","benjamin@mail.mx");
		list.add(user);
		user=new Usuarios(4,22,"Adrian","Cordero","adrian@mail.mx");
		list.add(user);
	}
	
	//Listar usuarios
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public ModelAndView getAll() {
		//List<Usuarios> listUno=getList();
		ModelAndView model=new ModelAndView("users");
		model.addObject("listUsrs",list);						
		return model;
	}
	
	//Buscar por Id
	@RequestMapping(value="/findUsr{id}",method=RequestMethod.GET)
	public String getItem(@RequestParam("id") int id, Model map){
		List<Usuarios> listaDos=new ArrayList<Usuarios>();	
		
		for(Usuarios user:list) {
			if(user.getId()==id) {
				listaDos.add(user);
				break;
			}
		}		
		map.addAttribute("listUsrs",listaDos);
		return "users";
	}
	
	//Registrar nuevo usuario
	@RequestMapping(value="/addUsr",method=RequestMethod.POST)
	public String addUsuario(@RequestParam("pId") int id, 
			@RequestParam("pName") String name,
			@RequestParam("pLName") String lname,
			@RequestParam("pAge") int age,
			@RequestParam("pEmail") String email,
			Model map
	)
	{
		user=new Usuarios(id,age,name,lname,email);
		list.add(user);
		map.addAttribute("listUsrs",list);
		return "users";
	}
}

