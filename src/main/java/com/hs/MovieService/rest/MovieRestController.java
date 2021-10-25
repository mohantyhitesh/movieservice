package com.hs.MovieService.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@RestController
@RequestMapping("/movie")
public class MovieRestController {

    @Autowired
EurekaClient eurekaClient;
	
	 @GetMapping
	    public String movie(){
	        return eurekaClient.getApplicationInfoManager().getInfo().getInstanceId();
	    }
	
}

