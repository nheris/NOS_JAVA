package com.winter.study3.cars;

import com.winter.study3.star.Marine;
import com.winter.study3.star.Medic;

public class CarMain {

	public static void main(String[] args) {
		Marine marine= new Marine();
		
//		marine.hp=200;
		marine.move();
		
		Medic medic;
//		
//		Car car = new Car();
//		
//		System.out.println(car.engine.fuel);
//		
//		car = null;
		
		Engine engine = new Engine();
		Car car = new Car(engine);
		car=null;

		

	}

}