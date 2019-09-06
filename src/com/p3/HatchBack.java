package com.p3;

import javax.persistence.Entity;

@Entity
public class HatchBack extends Car{
	int seats;

	public HatchBack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HatchBack(int seats) {
		super();
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "HatchBack [seats=" + seats + "]";
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	
	
}
