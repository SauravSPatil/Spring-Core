package BankDemo;

import org.springframework.context.ApplicationContext;

public class BankAccount 
{

		int accId;
		String accHolderName, accType;
		double accBalance;
		private BankAccController ctrl;

		public int getAccId() 
		{
			return accId;
		}

		public void setAccId(int accId) 
		{
			this.accId = accId;
		}
		public String getAccHolderName() 
		{
			return accHolderName;
		}
		public void setAccHolderName(String accHolderName) 
		{
			this.accHolderName = accHolderName;
		}
		public String getAccType() 
		{
			return accType;
		}
		public void setAccType(String accType) 
		{
			this.accType = accType;
		}
		public double getAccBalance() 
		{
			return accBalance;
		}
		public void setAccBalance(double accBalance) 
		{
			this.accBalance = accBalance;
		}


		public void Display()
		{
			System.out.println("Bank Account Holder Name is " +getAccHolderName());
			System.out.println("Bank Account Id/number is " +getAccId());
			System.out.println("Bank Account Balance is " +getAccBalance());
		}

}




interface BankAccRepository
	{
		public double getBalance(long accId);
		public double updateBalance(long accId, double newBalance);
	}


class BankAccRepoImpl implements BankAccRepository 
{
	
	public double getBalance(long accId) 
	{
		return 0;
	}

public double updateBalance(long accId, double newBalance) 
	{
		return 0;
	}



interface BankAccService
	{
		public double withdraw(long accId, double Balance);
		public double deposit(long accId, double Balance);
		public double getBalance(long accId);
		public boolean fundTransfer(long fromAcc, long toAcc, double amount);
	}

class BankAccServiceImpl implements BankAccService
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

}
