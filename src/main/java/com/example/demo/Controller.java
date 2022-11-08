package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Welcome To Spring Boot";
	}
}
