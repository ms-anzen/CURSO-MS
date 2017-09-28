package com.anzen.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anzen.dto.Usuario;

@Controller
public class Users {

	private static List<Usuario> usuarios = new ArrayList<Usuario>();

	public Users() {
		usuarios.add(new Usuario("1", "Erick", "Méndez"));
		usuarios.add(new Usuario("2", "Fernando", "Flores"));
		usuarios.add(new Usuario("3", "María", "Regina"));
		usuarios.add(new Usuario("4", "Alejandra", "Soria"));
	}

	@RequestMapping("/users")
	public ModelAndView usuarios() {
		return new ModelAndView("User", "usrs", usuarios);
	}
	
	@RequestMapping("/users/add")
	public ModelAndView addView() {
		return new ModelAndView("Add");
	}
	
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public String create(@RequestParam(name="id") String id,
			@RequestParam(name="nombre") String nombre,
			@RequestParam(name="apellido") String apellido, Model model) {
		Usuario usuario = new Usuario(id, nombre, apellido);
		usuarios.add(usuario);
		
		model.addAttribute("usrs", usuarios);
		return "User";
	}

	@RequestMapping("/users/{dni}")
	public String getUsuario(@PathVariable("dni") String dni, Model model) {
		Usuario usuario = buscar(dni);
		model.addAttribute("usr", usuario);
		return "MostrarUno";
	}

	private Usuario buscar(String id) {
		for (Usuario usuario : usuarios) {
			if(usuario.getId().equals(id)) {
				return usuario;
			}
		}
		return null;
	}
}
