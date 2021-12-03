package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assione.Customer;

public class Mainclass {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
		/*Food s1=(Food) context.getBean("s1");
		System.out.println(s1);
		
		context.registerShutdownHook();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		Pepsi p1=(Pepsi) context.getBean("p1");
		System.out.println(p1);*/
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		Example e1=(Example) context.getBean("e1");
		System.out.println(e1);
		
	}

	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		context.registerShutdownHook();
		Customer customer1= (Customer) context.getBean("fd");
		customer1.show();
		}*/



		}

