package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/payment-servivce/{price}")
	public String invokePaymentServiceFromClient(@PathVariable int price) {
		String url = "http://PAYMENT-SERVICE//payment-provider//payment/" + price;
		return restTemplate.getForObject(url, String.class);

	}

}
