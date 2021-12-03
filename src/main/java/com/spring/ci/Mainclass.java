package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ci/config.xml");
		Customer c =(Customer) context.getBean("cust1");
		System.out.println(c);

	}

}
