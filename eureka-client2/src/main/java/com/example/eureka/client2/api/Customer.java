package com.example.eureka.client2.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "customer-server")
public interface Customer {

	@RequestMapping(value = "/demo/getHost", method = RequestMethod.GET)
    public String getHost(String name);
}
