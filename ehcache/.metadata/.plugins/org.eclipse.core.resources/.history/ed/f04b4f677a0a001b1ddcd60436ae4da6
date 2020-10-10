package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	Logger logger = LoggerFactory.getLogger(RestController.class);
	
	@GetMapping("/api")
	@Cacheable("testCache")
	public String api() {
		logger.info("before cache****");
		return "hi";
	}

}
