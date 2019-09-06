package com.p2;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String houseAddress;
	private String city;
	private String country;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String houseAddress, String city, String country) {
		super();
		this.houseAddress = houseAddress;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [houseAddress=" + houseAddress + ", city=" + city + ", country=" + country + "]";
	}
	public String getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
