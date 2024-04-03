package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	public String fetchFormData(@ModelAttribute User u,Model m) {
		System.out.println(u);
		dao.inserOrUpdatetUser(u);
		List<User> list = dao.getAllUsers();
		m.addAttribute("list", list);
		return "home";
//		String name = request.getParameter("name");
//		long contact = Long.parseLong(request.getParameter("contact"));
//		System.out.println(name+contact);
		
	}
	
	
	@RequestMapping("/home")
	public String home(Model m) {
		List<User> list = dao.getAllUsers();
		m.addAttribute("list", list);
		return "home";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView editUser(@PathVariable("id") int id) {
		System.out.println(id);
		User u= dao.getUserById(id);
		System.out.println(u);
		ModelAndView m = new ModelAndView();
		m.addObject("u", u);
		m.setViewName("update");
		return m;
	}
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") int id,Model m) {
		User u= dao.getUserById(id);
		dao.deleteUser(u);
		System.out.println("deleted");
		List<User> list = dao.getAllUsers();
		m.addAttribute("list", list);
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
