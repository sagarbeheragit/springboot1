package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@RequestMapping(value="/hi")  
	public String greet()
	{
		return "<h1>Retun From 12nd API running on Docker....</h1>";
	}
}
