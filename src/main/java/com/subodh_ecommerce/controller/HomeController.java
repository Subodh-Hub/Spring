package com.subodh_ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	@GetMapping({"/home","/"})
	public String openHome() {
		return "index";
	}
	
	@GetMapping("/about")
	public String openAbout() {
		return "about";
}
}
