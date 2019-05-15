package com.example.eureka.client1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.eureka.client1.api.Provider;

@RestController
@RequestMapping("/provider")
public class ProviderController {
	
	@Autowired
	private Provider provider;
	
	@RequestMapping(value = "/test01",method=RequestMethod.GET)
	public String getHostName() {
		
		return provider.getHost();
	}

}
