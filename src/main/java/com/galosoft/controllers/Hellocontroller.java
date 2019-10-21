package com.galosoft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class Hellocontroller {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("message", "Hello Spring MVC");
		return "hello";
	}

}
