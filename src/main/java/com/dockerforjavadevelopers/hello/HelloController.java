package com.dockerforjavadevelopers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@RestController
public class HelloController {

		
		private static final Log LOGGER = LogFactory.getLog(ExampleController.class);

	@RequestMapping("/log")
	public String log() {
		String message = "This line was written to the log.";
		String secondMessage = "This line was also written to the log with the same Trace ID.";
		LOGGER.info(message);
		LOGGER.info(secondMessage);
		return message;
	}
		
	
		
	

}
