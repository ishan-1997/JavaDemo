package com.p3;

import javax.persistence.Entity;

@Entity
public class SportsCar extends Car{
	
	private int speed;

	public SportsCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SportsCar(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "SportsCar [speed=" + speed + "]";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
