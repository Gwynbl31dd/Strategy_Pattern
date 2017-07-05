package com.exemple.pattern.strategy;

import com.exemple.pattern.strategy.algorithm.Drive;
import com.exemple.pattern.strategy.algorithm.Sail;
import com.exemple.pattern.strategy.object.Boat;
import com.exemple.pattern.strategy.object.Car;
import com.exemple.pattern.strategy.object.Plane;

public class Main {

	public static void main(String[] args) {
		
		//Make Vehicles
		Car car = new Car();
		car.move();
		Plane plane = new Plane();
		plane.move();
		Boat boat = new Boat();
		boat.move();
		
		//Make Vehicle and change its movement type
		Car amphibious = new Car();
		amphibious.move();
		amphibious.setMovement(new Sail());
		amphibious.move();
		amphibious.setMovement(new Drive());
		amphibious.move();
	}

}
