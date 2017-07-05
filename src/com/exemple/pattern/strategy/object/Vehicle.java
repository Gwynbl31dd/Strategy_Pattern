package com.exemple.pattern.strategy.object;

import com.exemple.pattern.strategy.algorithm.Move;

public abstract class Vehicle {
	
	private Move movement;
	
	public void setMovement(Move movement){
		this.movement = movement;
	}
		
	public void move(){
		movement.move();
	}
}
