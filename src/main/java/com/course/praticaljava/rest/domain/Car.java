package com.course.praticaljava.rest.domain;

public class Car {

	private String bran;
	private String color;
	private String type;

	public Car(String bran, String color, String type) {
		this.bran = bran;
		this.color = color;
		this.type = type;
	}

	public String getBran() {
		return bran;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public void setBran(String bran) {
		this.bran = bran;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [bran=" + bran + ", color=" + color + ", type=" + type + "]";
	}

}
