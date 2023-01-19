package com.met.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.met.model.Registration;
import com.met.service.RegistrationService;

//@Component
@Controller
@RequestMapping("/user")
public class RegistrationController {

	
	
	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping
	public ModelAndView initializeUser() {
		
		ModelAndView modelAndView = new ModelAndView();

		Registration defUser = new Registration();
		
		modelAndView.addObject("user", defUser);
		
		Collection<Registration> allUsers = registrationService.getAllUsers();
		modelAndView.addObject("listUser", allUsers);
		
		modelAndView.setViewName("user");
		
		return modelAndView;
		
	}
	
	@PostMapping
	public ModelAndView saveUser(@ModelAttribute Registration user) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println(user);
		
		registrationService.save(user);
		
		Collection<Registration> allUsers = registrationService.getAllUsers();
		modelAndView.addObject("listUser", allUsers);
		
		
		modelAndView.setViewName("user");							//redirect:/emp
		
		Registration defUser = new Registration();
		  
	
		 modelAndView.addObject("user", defUser);
		 
		
		return modelAndView;
	}
	
	
	@ExceptionHandler
	public ModelAndView handleException(Exception e, HttpServletRequest request) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("error");
		mv.addObject("exMsg", e.getMessage());
		
		mv.addObject("url", request.getRequestURI());
		
		return mv;
		
	}
	
	
}







