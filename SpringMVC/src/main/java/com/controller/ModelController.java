package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController{
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request) {
		int id = 1;
		String name = "java";
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
