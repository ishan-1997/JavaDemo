package com.p2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="Account")
public class Account {
	private String name;
	@Embedded
	private Address address;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(
				name = "houseAddress",
				column = @Column( name="Temp_HouseAddress")
				),
		@AttributeOverride(name = "city",
				column = @Column( name="Temp_City")
				),
		@AttributeOverride(name = "country",
				column = @Column( name="Temp_Country")
				)
	})
	private Address tempAddress;
	
	private int balance;
	
	@Id
	@SequenceGenerator(name="myLogic", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO,generator="myLogic")
	private int id;
	
	@ElementCollection
	@CollectionTable(name="Policy_Account",joinColumns=@JoinColumn(name = "LinkedAccount"))
	@GenericGenerator(name="myGenerator",strategy="sequence")
	@CollectionId(
	    columns = @Column(name="policyID"),
	    type = @Type(type = "long"),
	    generator="myGenerator"
	)
	private List<Policy> policies = new ArrayList<Policy>();
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address getTempAddress() {
		return tempAddress;
	}

	public void setTempAddress(Address tempAddress) {
		this.tempAddress = tempAddress;
	}

	public List<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", address=" + address + ", tempAddress=" + tempAddress + ", balance="
				+ balance + ", id=" + id + ", policies=" + policies + "]";
	}

	public Account(String name, Address address, Address tempAddress, int balance, int id, List<Policy> policies) {
		super();
		this.name = name;
		this.address = address;
		this.tempAddress = tempAddress;
		this.balance = balance;
		this.id = id;
		this.policies = policies;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
