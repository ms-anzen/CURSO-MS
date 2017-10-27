package com.cursospring.T2M4.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.cursospring.T2M4.entidades.Usuario;

@Service
public class AutenticaImpl implements Autentica{
	@Autowired
	private Usuario usuario;
	
	@Autowired
	private FechaHora fechahora;
	
	public ModelAndView validaCredenciales(String usuario, String password){
		if(this.usuario.getUsuario().equals(usuario) && this.usuario.getPassword().equals(password)){
			ModelAndView mav = new ModelAndView();
			mav.setViewName("ultimoAcceso");
			mav.addObject("ultimoAcceso", this.usuario.getUltimoAcceso());
			mav.addObject("usuario", this.usuario.getUsuario());
			this.usuario.setUltimoAcceso(fechahora.obtenFechaHora());
			return mav;
		}
		return new ModelAndView("errorCredenciales");
	}
}
