package com.example.swagger.swagger.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/rest/hello")
public class RestResource {
	@Value("${msg}")
	private String msg;
	@ApiOperation(value="return hello")
	@GetMapping
	public String hello() {
		return msg;
	}
	@ApiOperation(value="Post method and return name")
	@PostMapping("/post/{name}")
	public String postName(@PathVariable("name") String name) {
		return name;

	}

	@ApiOperation(value="Put method and return name")
	@PutMapping("/put/{name}")
	public String putName(@PathVariable("name") String name) {
		return name;
	}

}
