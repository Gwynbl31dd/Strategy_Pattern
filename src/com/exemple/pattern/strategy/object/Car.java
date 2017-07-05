package com.exemple.pattern.strategy.object;

import com.exemple.pattern.strategy.algorithm.Drive;

public class Car extends Vehicle {

	public Car(){
		setMovement(new Drive());
	}
}
