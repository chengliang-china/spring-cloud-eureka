package com.example.eureka.client1.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client2")
public interface Provider {
	
	@RequestMapping(value = "/customer/getHost", method = RequestMethod.GET)
    public String getHost();
}
