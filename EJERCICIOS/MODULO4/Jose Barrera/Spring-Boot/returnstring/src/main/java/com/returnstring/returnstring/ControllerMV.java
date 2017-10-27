package com.returnstring.returnstring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMV {
	@RequestMapping("/")
	public String index() {
		return "Spring";
	}
}
