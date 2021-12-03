package com.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("adrress2")
	private Adrress adrress;

	public Adrress getAdrress() {
		return adrress;
	}

	public void setArdress(Adrress adrress) {
		this.adrress = adrress;
	}
	
	public Emp()
	{
		super();
	}

	public Emp(Adrress adrress) {
		super();
		this.adrress = adrress;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return "Emp [adrress=" + adrress + "]";
	}
	

}
