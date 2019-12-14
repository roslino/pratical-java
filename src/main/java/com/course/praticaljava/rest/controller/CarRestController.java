package com.course.praticaljava.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.praticaljava.rest.service.CarService;

@RestController
@RequestMapping
public class CarRestController {

	@Autowired
	CarService carService;
}
