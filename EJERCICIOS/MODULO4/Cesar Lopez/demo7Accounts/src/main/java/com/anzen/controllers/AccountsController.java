package com.anzen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.anzen.models.Account;
import com.anzen.models.User;
import com.anzen.services.AccountService;
import com.anzen.services.UserService;

@Controller
@SessionAttributes("id")
public class AccountsController {
	
	/**Se inyecta servicios de usuario **/
	@Autowired
	private UserService userService;
	/**Se inyecta servicios de cuenta**/
	@Autowired
	private AccountService accountService;

	
	/** getAccounts session **/
	@RequestMapping(value="/getAccounts",method = RequestMethod.GET)  
    public ModelAndView getAccounts(ModelMap model) {
		/** obtener objeto de sesion **/
		String id = (String) model.get("id");
		if(id!=null){
			/** obtener información de servicios**/
			User user = userService.buscarPorId(id);
			List<Account> accoutsUser = accountService.obtenerCuentasporUsuario(user);
			/**Seteo de vista**/
			ModelAndView mv = new ModelAndView();
	        mv.setViewName("accounts");
	        mv.addObject("id", user.getId());
	        mv.addObject("newName", user.getUser());
	        mv.addObject("accounts",accoutsUser);
	        return mv;
		}else{
			return new ModelAndView("redirect:/bienvenida.html");
		}
		
    }
		
	
}
