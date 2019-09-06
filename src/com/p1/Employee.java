package com.p1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
public class Employee {
	private String name;
	private int salary;
	
	@Id
	@SequenceGenerator(name="myLogic", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO,generator="myLogic")
	private int id;

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}

	public Employee(String name, int salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
