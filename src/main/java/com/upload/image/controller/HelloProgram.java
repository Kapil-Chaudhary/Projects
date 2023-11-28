package com.upload.image.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProgram {

	@GetMapping("/hello")
	public String hello() {
		return "this is my program 1";
	}
	
}
