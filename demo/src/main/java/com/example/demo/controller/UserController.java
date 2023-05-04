package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController 
{
	@Autowired
//	UserService service;
	
	
//	@GetMapping("/")
//	public String viewHome()
//	{
//		return "Registration";
//	}
//	
	@GetMapping("/")
	public String viewRegistration()
	{
		return "Registration";
	}
	
	@PostMapping("/save")
	public String save()
	{
//		service.saveUser(user);
		return "UserList";
	}
	
//	@GetMapping("/list")
//    public String viewUserList(Model model) 
//	{
//        List<User> listuser = service.ListAll();
//        model.addAttribute("listuser", listuser);
//        //System.out.print("Get / ");
//        return "UserList";
//    }
}
//