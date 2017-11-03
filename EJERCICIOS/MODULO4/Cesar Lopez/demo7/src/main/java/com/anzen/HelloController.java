package com.anzen;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	private List<Users> users = new ArrayList<Users>();
	private Users currentUser;
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	/** Lista de Usuarios Validos **/
	public HelloController(){
		users.add(new Users("Cesar", "Lopez"));
		users.add(new Users("Ivan", "Mtz"));
		users.add(new Users("Ana", "Galindo"));
		users.add(new Users("Jose", "Diaz"));
		users.add(new Users("Karen", "Hernandez"));
	}
	
	/** Funcion que valida el login **/
	public boolean validarLogin(String user,String pass){
		boolean valido=false;
		for(Users u:users){
			if(user.equals(u.getUser()) && pass.equals(u.getPass())){
				currentUser = u;
				return true;
			}
		}
		return valido; 
	}
	
	/** Funcion que hace la lógica del ultimo acceso y redirecciona la pagina correspondiente**/
	@RequestMapping(value="/home",method = RequestMethod.POST)  
    public ModelAndView hello(Locale locale,Model model, @RequestParam Map<String,String> requestParams) throws Exception {
		String userName=requestParams.get("user");
		String password=requestParams.get("pass");
		if(validarLogin(userName,password)){
	        ModelAndView mv = new ModelAndView();
	        mv.setViewName("home");
	        mv.addObject("name", userName);
	        mv.addObject("pass", password);
	        Date date = new Date();
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
			String formattedDate = dateFormat.format(date);
			/** Si es la primera vez que entra, almacenar la fecha actual y 
			 * actualizar la lista **/
	        if(currentUser!=null && currentUser.getLastAccess().equals("")){
	        	currentUser.setLastAccess(formattedDate);
	        	for(Users u:users){
	    			if(u.getUser().equals(currentUser.getUser()) && u.getPass().equals(currentUser.getPass())){
	    				u.setLastAccess(currentUser.getLastAccess());
	    			}
	    		}
	        }else{
	        	/** Si no viene vacio quiere decir que ya previamente realizo login,
	        	 * obtener ese valor para mostrarlo y guardar el nuevo acceso **/
	        	String dateActual = formattedDate;
	        	formattedDate=currentUser.getLastAccess();
	        	currentUser.setLastAccess(dateActual);
	        	for(Users u:users){
	    			if(u.getUser().equals(currentUser.getUser()) && u.getPass().equals(currentUser.getPass())){
	    				u.setLastAccess(currentUser.getLastAccess());
	    			}
	    		}
	        }
	        mv.addObject("date", formattedDate);
	        return mv;
		}else{
			return new ModelAndView("redirect:/denied.jsp");
		}
    }
    
	/**Pagina principal*/
    @RequestMapping("/binevenida.html")
    public String welcome(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "bienvenida";
    }
}