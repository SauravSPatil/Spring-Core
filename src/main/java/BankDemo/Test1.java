package BankDemo;

import java.util.Scanner;



import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("BankDemo/config.xml");
		BankAccount Obj1 = (BankAccount) context.getBean("accinfo");
		Obj1.Display();
	}

}