package com.p3;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="car")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="Car_Type",discriminatorType=DiscriminatorType.STRING)
public class Car {
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String name;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
