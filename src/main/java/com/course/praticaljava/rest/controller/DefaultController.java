package com.course.praticaljava.rest.controller;

import java.time.LocalTime;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultController {

	@GetMapping("/welcome")
	public String welcome() {
		System.out.println(StringUtils.join("Hello", " This is", " Spring Boot", " REST API"));
		return "Welcome to Spring Boot";
	}
	
	@GetMapping("/time")
	public String getLocalTime() {
		return  LocalTime.now().toString(); //getLocalTime();
	}
}
