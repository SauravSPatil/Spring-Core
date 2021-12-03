package com.assione;

import org.springframework.context.ApplicationContext;

public class Customer 
{
	public int customerId;
	public String customerName;
	public int customerContact;
	private Address Ob;
	
	ApplicationContext context = null;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	public Address getOb() {
		return Ob;
	}
	public void setOb(Address ob) {
		this.Ob = ob;
	}
	public void display()
	{
		
		System.out.println("name is "+getCustomerName());
		System.out.println("id is "+getCustomerId());
		System.out.println("contact is "+getCustomerContact());
		System.out.println("Address is "+getOb().getStreet()+" "+getOb().getCity()+""+getOb().getZip()+" "+getOb().getState()+" "+getOb().getState());
		
		
	}

	
	
	}
