package com.spring.auto;

public class Adrress {
	
	private String street,city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Adrress [street=" + street + ", city=" + city + "]";
	}
	

}
