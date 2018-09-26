package com.mballem.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//bin tipo controller
@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		
		return "/home";
	}

}
