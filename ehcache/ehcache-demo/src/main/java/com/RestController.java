package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	Logger logger = LoggerFactory.getLogger(RestController.class);
	
	@GetMapping("/api/{id}")
	@Cacheable("testCache")
	public String api(@PathVariable ("id") String id) {
		logger.info("before cache****"+id);
		return "hi "+id;
	}

}
