package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Food 
{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Food [price=" + price + "]";
	}
	public void init()
	{
		System.out.println("Inside init method");
	}
	public void destroy()
	{
		System.out.println("Inside init destroy");
	}

		
	}
	

