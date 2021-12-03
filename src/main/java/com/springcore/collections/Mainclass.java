package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Question question1= (Question) context.getBean("question1");
		System.out.println(question1.getQuestionId());
		System.out.println(question1.getQuestion());
		System.out.println(question1.getAnswer());
		System.out.println(question1.getAnswer1());
		System.out.println(question1.getAnswer2());
		
	}

}
