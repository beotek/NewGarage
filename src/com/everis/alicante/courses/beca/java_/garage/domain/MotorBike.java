package com.everis.alicante.courses.beca.java_.garage.domain;

public class MotorBike {
	private String plate;
	private String color;
	private String model;
	private int numwheels;
	
	public MotorBike(String plate, String color, String model) {
		super();
		this.plate = plate;
		this.color = color;
		this.model = model;
		this.numwheels = 2;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
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

	@Override
	public String toString() {
		return "MotorBike [plate=" + plate + ", color=" + color + ", model=" + model + ", numwheels=" + numwheels + "]";
	}
	
	
	
}