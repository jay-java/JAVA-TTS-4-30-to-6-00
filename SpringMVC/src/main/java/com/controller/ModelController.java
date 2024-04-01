package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.UserDao;
import com.model.User;

@Controller
public class ModelController{
	@Autowired
	private UserDao dao;
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	
//	@RequestParam String name,@RequestParam long contact;
	public void fetchFormData(@ModelAttribute User u) {
		System.out.println(u);
		dao.inserOrUpdatetUser(u);
		System.out.println("data stored");
//		String name = request.getParameter("name");
//		long contact = Long.parseLong(request.getParameter("contact"));
//		System.out.println(name+contact);
		
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request) {
		int id = 1;
		String name = "java";
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		List<String> values = new ArrayList<String>();
		values.add("java");
		values.add("php");
		values.add("python");
		values.add(".net");
		values.add("dart");
		request.setAttribute("values", values);
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact(Model m) {
		m.addAttribute("name", 234);
		return "contact";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
