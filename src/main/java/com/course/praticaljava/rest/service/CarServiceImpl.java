package com.course.praticaljava.rest.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.course.praticaljava.rest.domain.Car;

@Service
public class CarServiceImpl implements CarService{

	private Random random = new Random();
	
	@Override
	public Car generateCar() {
		var randomBrand = BRANDS.get(random.nextInt(BRANDS.size()));
		var randomColor= COLORS.get(random.nextInt(COLORS.size()));
		var randomType = TYPES.get(random.nextInt(TYPES.size()));
		
		var car = new Car(randomBrand, randomColor, randomType);
		
		return car;
	}

}
