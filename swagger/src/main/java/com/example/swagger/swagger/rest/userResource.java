package com.example.swagger.swagger.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class userResource {
	@GetMapping
	public List<User> getUsers() {
		return Arrays.asList(new User("a", 100), new User("b", 200));

	}
	
	@GetMapping("/user/{name}")
	public User postName(@PathVariable("name") String name) {
		return new User(name,3400);

}
}
