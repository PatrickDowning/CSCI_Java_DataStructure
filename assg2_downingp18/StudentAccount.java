//Patrick Downing
package assg2_downingp18;

public class StudentAccount 
{
	
	// This is the account number
	private long acctNo;
	// This is the balance 
	private double balance;
	
	//This is the counter
	private static long count;
		
		
		
	// This is default constructor
	public StudentAccount ()
	{
		balance = 0;
		count++;
		acctNo = count;
	}
	// Second constructor that provides initial balance
	public StudentAccount (double sbalance)
	{
		balance = sbalance;
		count++;
		acctNo=count;
	}
	
	
	// Method that returns the account numbers
	public long getAcctNo()
	{
		return acctNo;
		
	}
	// Method that returns the account balance
	public double getBalance()
	{
		return balance;
		
	}
	// Method that returns the total amount of accounts
	public long getCounter()
	{
		return count;
		
	}
	// Method that sets a new balance
	public double setBalance(double newbal)
	{
		balance = newbal;
		return balance;
		
	}
	// Method that adds a deposit to the balance
	public double deposit(double depo)
	{
		if(depo<0)
		{
			System.out.println("You can not deposit negative cash");
			
		}
		else if(depo==0)
		{
			System.out.println("There is nothing to deposite");
		}
		else
		{
			balance += depo;
			
		}
		
		return balance;
		
		
	}
	//Method that charges the account
	public double charge(double debt)
	{
		if(debt<0)
		{
			System.out.println("You can not charge negative cash");
		}
		else if(debt==0)
		{
			System.out.println("There is nothing to charge");
		}
		else
		{
			balance -= debt;
		}
		
		return balance;
		
	}
	//Method that transfer to parameter account
	public double transferIn(StudentAccount a, double transfered )
	{
		if(transfered < 0)
			System.out.println("You can not transfer negative funds");
		else if(transfered == 0)
		{
			System.out.println("You did not transfer any funds");
		}
		else
		{
			a.balance = a.balance + transfered;
			this.balance = this.balance - transfered;
		}
		return a.balance;
	}
	//Method that transfer out of parameter account
	public double transferOut(StudentAccount a, double transfered)
	{
				if(transfered < 0)
			System.out.println("You can not transfer negative funds");
		else if(transfered == 0)
		{
			System.out.println("You did not transfer any funds");
		}
		else
		{
			a.balance = a.balance - transfered;
			this.balance = this.balance + transfered;
		}
		return a.balance;
	}
	//This method prints the account information
	public void printInfo()
	{
		System.out.println("Account number: " + acctNo);
		System.out.println("Current balance: "+ balance);
	} 
	
	@Override
	//This is the to String for this class
	public String toString() 
	{
		return "Account number: " + acctNo +"\n"+ "Current balance: " + balance +"\n";
		
		
	}

	/* This method compares to account if the parameter account is less then a 1 will print, 
	 * if the account in the parameter is more then a -1 will appear, if they are equal then 0 will appear.
	 */
	public int compareTo(StudentAccount a)
	{
		if(a.balance < this.balance)
		{
			return 1;
		}
		else if(a.balance == this.balance)
		{
			return 0;
		}
		else 
		{
			return -1;
		}
	}
		
}
	

