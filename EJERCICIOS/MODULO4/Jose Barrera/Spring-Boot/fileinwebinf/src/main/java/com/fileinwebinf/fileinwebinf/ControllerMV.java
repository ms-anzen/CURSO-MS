package com.fileinwebinf.fileinwebinf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerMV {
	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
}