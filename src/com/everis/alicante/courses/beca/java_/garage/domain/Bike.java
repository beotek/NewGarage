package com.everis.alicante.courses.beca.java_.garage.domain;

public class Bike {
	private String color;
	private String model;
	private int numwheels;
	public Bike(String color, String model) {
		super();
		this.color = color;
		this.model = model;
		this.numwheels = 2;
	}
	@Override
	public String toString() {
		return "Bike [color=" + color + ", model=" + model + ", numwheels=" + numwheels + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumwheels() {
		return numwheels;
	}
	public void setNumwheels(int numwheels) {
		this.numwheels = numwheels;
	}
	
	
}
