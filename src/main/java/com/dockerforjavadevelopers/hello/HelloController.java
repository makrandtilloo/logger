package com.dockerforjavadevelopers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World\n";
	}
	
	@RequestMapping("/hi")
	public String hi() {
		
		
		
		
		return "reached hi\n";
	}

}
