package com.everis.alicante.courses.beca.java_.garage;

import java.util.Scanner;

import com.everis.alicante.courses.beca.java_.garage.domain.Bike;
import com.everis.alicante.courses.beca.java_.garage.domain.Car;
import com.everis.alicante.courses.beca.java_.garage.domain.MotorBike;
import com.everis.alicante.courses.beca.java_.garage.runner.BikeManager;
import com.everis.alicante.courses.beca.java_.garage.runner.CarManager;
import com.everis.alicante.courses.beca.java_.garage.runner.MotorBikeManager;
import com.everis.alicante.courses.becajava.garage.ui.GarageMenu;

public class GarageRunner {
	static Scanner in = new Scanner(System.in);
	static BikeManager bikemanager = new BikeManager();
	static CarManager carmanager = new CarManager();
	static MotorBikeManager motorbikemanager = new MotorBikeManager();

	public static void main(String[] args) {

		String option = null;
		do {
			option = GarageMenu.getInstance().play();
			switch (option) {
			case "1.1":
				listvehicle(1);
				break;
			case "1.2":
				newvehicle(1);
				break;
			case "1.3":
				deletevehicle(1);
				break;
			case "2.1":
				listvehicle(2);
				break;
			case "2.2":
				newvehicle(2);
				break;
			case "2.3":
				deletevehicle(2);
				break;
			case "3.1":
				listvehicle(3);
			case "3.2":
				newvehicle(3);
				break;
			case "3.3":
				deletevehicle(3);
				break;

			}
		} while (!option.equals("0"));

	}

	public static void newvehicle(int i) {

		if (i == 1 || i == 2) {
			System.out.println("Add Plate");
			String plate = in.nextLine();
			System.out.println("Add Color");
			String color = in.nextLine();
			System.out.println("Add model");
			String model = in.nextLine();
			if (i == 1) {
				Car car = new Car(plate, color, model);
				carmanager.save(car);
			} else {
				MotorBike motorbike = new MotorBike(plate, color, model);
				motorbikemanager.save(motorbike);
			}
		} else {
			System.out.println("Add Color");
			String color = in.nextLine();
			System.out.println("Add model");
			String model = in.nextLine();
			Bike bike = new Bike(color, model);
			bikemanager.save(bike);
		}

	}

	public static void listvehicle(int i) {
		if (i == 1) {
			System.out.println(carmanager.list());
		} else if (i == 2) {
			System.out.println(motorbikemanager.list());
		} else {
			System.out.println(bikemanager.list());
		}
	}

	
	
	public static void deletevehicle(int i) {
		if (i == 1) {
		//	CarManager carmanager = new CarManager();
		}
	}
}
