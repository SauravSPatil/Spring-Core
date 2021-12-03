package com.assione;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/assione/config.xml");
		Customer c = (Customer) context.getBean("cust");
		
		
		c.display();
		
		
		
	
		
	}

}
