package com.cursoSBoot.tareaDos.Login.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cursoSBoot.tareaDos.Login.Entidades.Usuario;

@Controller
public class MainController {
	
	  private Usuario userUno;
	  
	
	
	//For bienvenida Login
	@RequestMapping("/bienvenida.html")
	public ModelAndView login(){
		return new ModelAndView("vwLogin");
	}
	
	
	//For tryLogin
	@RequestMapping("/tryLogin")
	public ModelAndView validaLogin(@RequestParam("user") String user, @RequestParam("password") String password){
			userUno=new Usuario("Jesus","Cruz",24,"jesuscruz","12345678");
			if (userUno.valida(user,password)){
				ModelAndView view=new ModelAndView();
				view.setViewName("vwAcceso");
				view.addObject("nombre", userUno.getNombre());
				view.addObject("dateLogin",userUno.dateLogin());
				view.addObject("timeLogin",userUno.timeLogin());
				return view;
			}
			
			else{
				return new ModelAndView("vwError");
			}
		
	}

	@RequestMapping("despedida.html")
	public ModelAndView logout() {
		return new ModelAndView("vwLogout");
	}
}
