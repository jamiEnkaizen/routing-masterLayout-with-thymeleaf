package com.routing.routing25July.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping({"/","/home"})
	public String home() {
		return "home";
	}

	@GetMapping("/contact")
	public String contact(){
		return "contact";
	}

	@GetMapping("/services")
	public String services(){
		return "services";
	}

}
