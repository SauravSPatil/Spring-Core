package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client 
{
	public static void main(String[] args)
	
		{
			ApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);
			College college = context.getBean("collegeBean" , College.class);
			System.out.println("This is college : " + college);
			college.test();
		}
	
}

