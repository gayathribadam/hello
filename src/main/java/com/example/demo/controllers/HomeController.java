package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping(value="/home" ,method= RequestMethod.GET)
	public String home()
	{
		return "Hello welocome to SpringBoot";
	  	
	}

	@RequestMapping(value="/class" ,method= RequestMethod.GET)
	public String class1()
	{
		return "I'm CSE class";
	}
	
}

