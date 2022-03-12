package com.demo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.spring.service.MenuService;

@Controller
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	@GetMapping("/home")
	public String getIndex(Model model) {
		model.addAttribute("menu", menuService.getAllMenu());
		return "index.html";
	}
}
