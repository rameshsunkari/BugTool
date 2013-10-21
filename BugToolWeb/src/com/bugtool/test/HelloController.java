package com.bugtool.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {

		String message = "Hello World, Spring 3.0!";
		ModelAndView modelView = new ModelAndView("hello", "message", message);
		return modelView;
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeWorld() {

		String message = "Welcome to the World of Spring 3.0!";
		ModelAndView modelView = new ModelAndView("welcome", "message", message);
		return modelView;
	}
	
	@RequestMapping("/login")
	public ModelAndView loginPage(){
		return new ModelAndView("login", "message", "User Login Page");
	}
	
	@RequestMapping("/")
	public ModelAndView showIndex(){
		return new ModelAndView("login", "message", "User Login Page");
	}
}
