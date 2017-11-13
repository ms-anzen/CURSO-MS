package com.anzen.controllers;

import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.anzen.services.UserService;

/** Atributos de sesion **/
@Controller
@SessionAttributes("id")
public class UsersController {
	
	/**Se inyecta servicios de usuario **/
	@Autowired
	private UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(UsersController.class);
	
	/** Funcion que hace la lógica del ultimo acceso y redirecciona la pagina correspondiente
	 * POST desde el formulario
	 * **/
	@RequestMapping(value="/home",method = RequestMethod.POST)  
    public ModelAndView home(Locale locale,Model model, @RequestParam Map<String,String> requestParams) throws Exception {
		String userName=requestParams.get("user");
		String password=requestParams.get("pass");
		/** Usuario Válido **/
		/** entrada: Recuperar datos y pasarlos al servicio de userService 
		 *  salida:  booleano (usuario valido o invalido) **/
		
		if(userService.isValidUser(userName,password)){
			ModelAndView mv = new ModelAndView();
	        mv.setViewName("home");
	        mv.addObject("id", userService.getCurrentUser().getId());
	        mv.addObject("name", userService.getCurrentUser().getUser());/** Este valor deberia comentarse **/
	        mv.addObject("date", userService.ultimoAcceso());
	        return mv;
		}else{
			return new ModelAndView("redirect:/denied.jsp");
		}		
    }	

	/**Regresar a Home
	 * Get de URL
	 * */
    @RequestMapping("/home")
    public ModelAndView home(ModelMap model) {
    	String vista="";
    	ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        
    	if(model.containsKey("id")) {
    		mv.addObject("id", userService.getCurrentUser().getId());
    		mv.addObject("name", userService.getCurrentUser().getUser());
    		mv.addObject("date", userService.ultimoAcceso());
    		return mv;
    	}else{
    		return new ModelAndView("redirect:/bienvenida.html");
    	}
    }
	
	
	/** Pagina principal: muestra el login **/
    @RequestMapping("/binevenida.html")
    public String welcome(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        logger.debug("---------- Pagina inicial ------------");
        System.out.println("Salida estandar");
        return "bienvenida";
    }
    
	/** Pagina principal: muestra el login **/
    @RequestMapping("/salir")
    public ModelAndView salir(ModelMap model, SessionStatus status) {
    	status.setComplete();
        logger.debug("---------- Pagina de Salida ------------");
        System.out.println("Salida estandar");
        return new ModelAndView("redirect:/despedida.html");
    }
    
    
}
