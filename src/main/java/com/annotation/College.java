package com.annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("collegeBean")

public class College
{
	//@Value("KBP")
	
	
	private String collegename;
	
	
	@Value("${college.Name}")
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public void test()
	{
		System.out.println("My college name is :" +collegename);
		System.out.println("testing this method");
		
	}
	

}
