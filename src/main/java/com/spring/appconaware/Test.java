package com.spring.appconaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		  ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
		  Demo d1=(Demo)ac.getBean("s1");
		  d1.show();
	}

}
