package BankDemo;

import org.springframework.stereotype.Controller;

@Controller
public class BankAccController 
{	
	public double withdraw(long accId, double Balance) 
	{
		return 0;
	}
	public double deposit(long accId, double Balance) 
	{
		return 0;
	}
	public double getBalance(long accId) 
	{
		return 0;
	}
	public boolean fundTransfer(long fromAcc, long toAcc, double amount) 
	{
		return false;
	}

}