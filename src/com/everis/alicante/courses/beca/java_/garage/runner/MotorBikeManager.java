package com.everis.alicante.courses.beca.java_.garage.runner;

import java.util.ArrayList;
import java.util.List;
import com.everis.alicante.courses.beca.java_.garage.domain.MotorBike;


public class MotorBikeManager {
  List<MotorBike> elements = new ArrayList<>();
  
 public List<MotorBike> list(){
	 return elements;
 }
 
 public MotorBike save(MotorBike motorbike) {
	 elements.add(motorbike);
	 return motorbike;
 }
 
 public void delete(MotorBike motorbike) {
	 elements.remove(motorbike);
	 System.out.println("Motorbike delete");
 }
 public MotorBike get(int i) {
	 return elements.get(i);
 }
 
}
