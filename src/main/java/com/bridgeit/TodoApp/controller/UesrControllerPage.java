package com.bridgeit.TodoApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bridgeit.TodoApp.model.User;

@Controller
public class UesrControllerPage {
	
	@RequestMapping(value="LoginPage")
	public String loginPage(Model model)
	{
		model.addAttribute("userLogin", new User());
		return "UserLogin";
	}
	
	@RequestMapping(value="registerPage")
	public String aboutPage(Model model)
	{	
		model.addAttribute("userRegistration", new User());
		return "UserRegistration";
	}
	
	@RequestMapping(value="homePage")
	public String homePage()
	{
		return "home";
	}
}
