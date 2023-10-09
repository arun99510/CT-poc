package com.cpt.payments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

	@GetMapping("/hello")
	public String sayHello() {
	    return "Hello, World!";
	}
	@GetMapping("/invoke")
	public int sum(@RequestParam(value = "num1") int v1,
			       @RequestParam(value = "num2") int v2) {
		       int r=v1+v2;
				return r;
		
		
		
	}
	
	
}
