package com.everis.alicante.courses.beca.java_.garage.domain;

public class Car {

	private String plate;
	private String color;
	private String modelo;
	private int numWheels;
	
	public Car(String plate, String color, String modelo) {
		super();
		this.plate = plate;
		this.color = color;
		this.modelo = modelo;
		this.numWheels = 4;
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
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumWheels() {
		return numWheels;
	}
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	@Override
	public String toString() {
		return "Car [plate=" + plate + ", color=" + color + ", modelo=" + modelo + ", numWheels=" + numWheels + "]";
	}



}
