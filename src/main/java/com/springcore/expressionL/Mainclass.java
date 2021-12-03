package com.springcore.expressionL;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass 
{
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/expressionL/config.xml");
	Value v1 = context.getBean("value",Value.class);
	
	System.out.println(v1);
	
}
