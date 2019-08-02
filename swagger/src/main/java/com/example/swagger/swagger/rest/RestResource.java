package com.example.swagger.swagger.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class RestResource {
	@GetMapping
	public String hello() {
		return "hello";
	}

	@PostMapping("/post/{name}")
	public String postName(@PathVariable("name") String name) {
		return name;

	}

	@PutMapping("/put/{name}")
	public String putName(@PathVariable("name") String name) {
		return name;
	}

}
