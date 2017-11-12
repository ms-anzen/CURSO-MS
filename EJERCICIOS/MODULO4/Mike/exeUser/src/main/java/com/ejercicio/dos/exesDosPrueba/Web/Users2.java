package com.ejercicio.dos.exesDosPrueba.Web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.dos.exesDosPrueba.domain.User;

//@RestController
public class Users2 {
	
	//private static Map<Integer,String> users=new HashMap<Integer,String>();
	/*private static Map<Integer,List<String>> accounts= new HashMap<Integer, List<String>>();
	
	private static List<String> mikeAccounts=new ArrayList<String>();
	private static  List<String> octavioAccounts=new ArrayList<String>();
	private static  List<String> miguelAccounts=new ArrayList<String>();
	
	private static List<User> users=new ArrayList<User>();
	
	
	/*@RequestMapping(value="/user", method=RequestMethod.GET)
	public Map<Integer,String> getUser(){
		//List <String> users= new ArrayList<String>();
		users.put(1,"mike");
		users.put(2,"jefe octavio");
		users.put(3,"el miguel");
		return users;
	}
	*/
	
	/*@RequestMapping(value="/usuario", method=RequestMethod.GET)
	public List<User> getUser(){
		//List <String> users= new ArrayList<String>();
		users.add(new User(1,"Miguel"));
		users.add(new User(2,"Octavio"));
		users.add(new User(3,"Jesus"));
	
		return users;
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public User getUserById(@PathVariable("id") int id) {
		
		for (User usuario:users) {
			if(usuario.getId()==id) {
				return usuario;
			}
		}		
		return null;
	}
	
	@RequestMapping(value="/accounts", method=RequestMethod.GET)
	public Map<Integer,List<String>> getAccounts(){
		
		mikeAccounts.add("00111");
		mikeAccounts.add("00222");
		mikeAccounts.add("00333");
		
		octavioAccounts.add("00444");
		octavioAccounts.add("00555");
		octavioAccounts.add("00666");
		
		miguelAccounts.add("00777");
		miguelAccounts.add("00888");
		miguelAccounts.add("00999");
		
		accounts.put(1,mikeAccounts);
		accounts.put(2,octavioAccounts);
		accounts.put(3,miguelAccounts);
		
		return accounts;
	}
	
	@RequestMapping(value="/accounts/{id}",method=RequestMethod.GET)
	public List<String> getAccountById(@PathVariable("id")  int id){
		return accounts.get(id);
	}*/
}
