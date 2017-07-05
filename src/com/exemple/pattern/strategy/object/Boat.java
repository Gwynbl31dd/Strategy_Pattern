package com.exemple.pattern.strategy.object;

import com.exemple.pattern.strategy.algorithm.Sail;

public class Boat extends Vehicle {

	public Boat(){
		setMovement(new Sail());
	}
}
