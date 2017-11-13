package com.anzen.services.impl;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anzen.models.User;
import com.anzen.repository.UserRepository;
import com.anzen.services.UserService;

/** Lista de servicios en relación a usuarios **/
@Service
public class UserServiceImpl implements UserService{

	/** Carga Usuarios **/
	@Autowired
	private UserRepository userRepository;
	
	private User currentUser;
	public String lastAccess="";
	
	/** Obtiene lista de usuario **/
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAllUsers();
	}
	
	public void actualizarUser(User u){
		userRepository.updateUser(u);
	}
	

	/** Valida Usuario **/
	@Override
	public boolean isValidUser(String user, String pass) {
		boolean estatus=false;
		for(User u:getAllUsers()){
			if(u.getUser().equals(user) && u.getPass().equals(pass)){
				Date date = new Date();
				DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
				String formattedDate = dateFormat.format(date);
				if(u.getLastAccess().equals("")){
					lastAccess=formattedDate;
					u.setLastAccess(formattedDate);
				}else{
					lastAccess=u.getLastAccess();
					u.setLastAccess(formattedDate);
				}
				currentUser = u;
				estatus=true;
			}
		}
		if(estatus){
			actualizarUser(currentUser);
		}
		return estatus;
	}
	
	@Override
	public User getCurrentUser() {
		return currentUser;
	}

	@Override
	public User buscarPorId(String id) {
		User u = null;
		u = userRepository.findById(id);
		return u;
	}

	@Override
	public String ultimoAcceso() {
		// TODO Auto-generated method stub
		return lastAccess;
	}

}
