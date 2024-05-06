package com.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

	@GetMapping("/home")
	public String Home(Model model) {
		model.addAttribute("title", "Home-Smart Sales Manager");
		return "home";
	}
	
	@GetMapping("/about")
	public String About(Model model) {
		model.addAttribute("title", "About-Smart Sales Manager");
		return "about";
	}
	
}
