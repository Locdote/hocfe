package com.demo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@GetMapping("/xinchao")
	public String xinchao() {
		return "xinchao.html";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String index() {
		return "index.html";
	}
}
