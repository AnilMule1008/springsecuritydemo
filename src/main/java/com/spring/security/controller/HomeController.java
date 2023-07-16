package com.spring.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Home")
public class HomeController {
	
	@RequestMapping("")
	public String homePage() {
		return "this is home page.";
	}

}
