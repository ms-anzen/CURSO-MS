package com.anzen.digital;


import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anzen.digital.application.Cache;
import com.anzen.digital.models.User;

/**
 * cilopez
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private boolean first=true;
		
	/** Peticion inicial Listar Usuarios **/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		if(first){
			Cache.loadUsers();
			first=false;
		}
		
		model.addAttribute("serverList", Cache.listUser );
		return "home";
	}

	/** Agregar nuevo usuario **/
    @RequestMapping("/addUser")  
    public ModelAndView showform(){
    	//nombre de vista nombre de modelo y objeto
    	/** Podria usar esta forma 
    	 * Nota: command es el valor por default para recuperar del formulario **/
    	//ModelAndView mv = new ModelAndView("addUser", "command", new User());
    	//mv.addObject(new User(100,"Carolina"));
    	/** Podria usar esta forma **/
        return new ModelAndView("addUser","usuario",new User());  
    	//return mv;
    }
    
    /** Guardar nuevo usuario **/
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("usuario") User user){  
    	//aumentamos id y agregamos a lista
    	user.setId(Cache.contador++);
        Cache.listUser.add(user);
        //Este comando redirecciona a home :)
        return new ModelAndView("redirect:/");  
    }
    
    
    /** buscar un usuario **/
    @RequestMapping(value="/search{id}", method=RequestMethod.GET)  
    public ModelAndView searsh(@RequestParam int id){
    	logger.debug("hola mundo---------");
        User user = new User();
        for(User u: Cache.listUser){
        	if(u.getId() == id)
        		user=u;
        }
        if(user.getName().equals("")){
        	user.setName("-----");
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("searchRes");
        mv.addObject("usuario", user);
        
       // Retornamos la vista de edicion con el usuario cargado  
        return mv;
    }
    
    /** Editar un usuario existente **/
    @RequestMapping(value="/editUser/{id}", method=RequestMethod.GET)  
    public ModelAndView edit(@PathVariable int id){
        User user = new User();
        for(User u: Cache.listUser){
        	if(u.getId() == id)
        		user=u;
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("userEdit");
        mv.addObject("usuario", user);
       // Retornamos la vista de edicion con el usuario cargado  
        return mv;
    }
    
    /* Actualiza un usuario existente Cuando piche en boton de guardar y este en en edituser */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public ModelAndView editsave(@ModelAttribute("usuario") User user){
    	for(int x=0; x<Cache.listUser.size();x++){
    		if(Cache.listUser.get(x).getId()==user.getId()){
    			Cache.listUser.set(x, user);
    			break;
    		}
    	}
    	//lo mandamos a home y actualizando la lista
        return new ModelAndView("redirect:/");
    }
    
    /* Eliminar un usuario se invocara desde el home */  
    @RequestMapping(value="/deleteUser/{id}",method = RequestMethod.GET)  
    public ModelAndView delete(@PathVariable int id){  
        /*Eliminar el usuario de la lista*/
    	for(int x=0; x<Cache.listUser.size();x++){
    		if(Cache.listUser.get(x).getId()==id){
    			Cache.listUser.remove(x);
    			break;
    		}
    	}
    	//lo retornamos a home
        return new ModelAndView("redirect:/");  
    }
    
}



