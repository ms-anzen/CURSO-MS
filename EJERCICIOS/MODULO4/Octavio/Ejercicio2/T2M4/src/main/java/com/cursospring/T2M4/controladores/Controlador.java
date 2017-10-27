package com.cursospring.T2M4.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cursospring.T2M4.servicios.Autentica;

@Controller
public class Controlador {
	@Autowired
	private Autentica autentica;
	
	@RequestMapping("/bienvenida.html")
	public ModelAndView muestraPaginaBienvenida(){
		return new ModelAndView("bienvenida");
	}
	
	@RequestMapping("/validaCredenciales")
	public ModelAndView validaLogin(
			@RequestParam("usuario") String usuario,
			@RequestParam("password") String password){
		return autentica.validaCredenciales(usuario, password);
	}
}
