package com.spring.appconaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Demo implements ApplicationContextAware
{
	private ApplicationContext ap;
	Demo d2;
	void show()
	{
		System.out.println(d2.toString());
	}

	public void setApplicationContext(ApplicationContext ap) throws BeansException {
		
		this.ap=ap;
		d2 = (Demo)ap.getBean("s1");
	}
	
	
}
