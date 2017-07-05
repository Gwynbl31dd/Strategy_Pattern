package com.exemple.pattern.strategy.object;

import com.exemple.pattern.strategy.algorithm.Fly;

public class Plane extends Vehicle {
	
	public Plane(){
		setMovement(new Fly());
	}

}
