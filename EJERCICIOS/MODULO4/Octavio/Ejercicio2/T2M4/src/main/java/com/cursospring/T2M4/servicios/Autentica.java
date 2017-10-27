package com.cursospring.T2M4.servicios;

import org.springframework.web.servlet.ModelAndView;

public interface Autentica {
	public ModelAndView validaCredenciales(String usuario, String password);
}
