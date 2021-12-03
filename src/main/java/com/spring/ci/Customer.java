package com.spring.ci;

public class Customer 
{
	public int customerId;
	public String customerName;
	public int customerContact;
	private Address address;
	

	public Customer(int customerId, String customerName, int customerContact, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.address=address;
	}
	
	@Override
	public String toString() {
		
		return this.customerName+" : "+this.customerId+" : "+this.customerContact+"addres is { " +this.address.city  +  this.address.country + this.address.state + this .address.street+this.address.zip+"}"; //this.address.country + this.address.state + this.address.street + this.address.zip"};
		
	}
}
