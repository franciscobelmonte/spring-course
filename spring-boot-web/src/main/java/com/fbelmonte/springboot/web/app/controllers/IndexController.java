package com.fbelmonte.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fbelmonte.springboot.web.app.models.User;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index", "", "/", "home"})
	public String index(Model model) {
		model.addAttribute("title", "Hello Spring Framework!");
		return "index";
	}
	
	@GetMapping({"/profile"})
	public String profile(Model model) {
		User user = new User();
		user.setName("Francisco");
		user.setSurnames("Belmonte Ruiz");
		user.setEmail("fbelmonte@email.com");
		model.addAttribute("user", user);
		
		model.addAttribute("title", "Profile: ".concat(user.getName()));
		return "profile";
	}
	
	@GetMapping({"/list"})
	public String list(Model model) {
		List<User> users = new ArrayList<>();
		
		User user = new User();
		user.setName("Francisco");
		user.setSurnames("Belmonte Ruiz");
		user.setEmail("fbelmonte@email.com");
		
		model.addAttribute("users", users);
		
		model.addAttribute("title", "User list");
		return "list";
	}
}
