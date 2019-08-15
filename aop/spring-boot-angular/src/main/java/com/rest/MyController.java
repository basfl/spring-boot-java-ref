package com.rest;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.modal.User;
import com.repository.UserRepository;

@RestController
//@RequestMapping(value = "/backend/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@CrossOrigin(origins = "http://localhost:4200")
public class MyController {

	@Autowired
	User userOne;
	@Autowired
	UserRepository userRepository;

	

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@CrossOrigin(origins = "http://localhost:4200")
	public User getUser(@RequestBody User user) {
		System.out.println("i get " + user.getUserName());
		Optional<User> result = userRepository.findById("user1");	
		result.ifPresent(res->{
			System.out.println("*****"+res.getPass());
		});
		if (user.getUserName().equals("root") && user.getPass().equals("pass")) {
			return user;
		} else {
			userOne.setUserName("def");
			userOne.setPass("def");
			return userOne;
		}
		

	}

	

}
