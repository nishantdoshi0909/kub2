package com.wrapperapi.WrapperAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WrapperController {
	@RequestMapping("/wrapperhello")
	public String hello() {
		//return "Hello World";
		String uri = "http://helloword-api-v1/hello";
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	    return result; 
	}

}
