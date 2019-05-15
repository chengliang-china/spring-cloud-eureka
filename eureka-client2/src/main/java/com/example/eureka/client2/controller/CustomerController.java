package com.example.eureka.client2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping(value = "/getHost",method=RequestMethod.GET)
	public String getHostName() {
		return "customer gogogo...";
	}
	
}
