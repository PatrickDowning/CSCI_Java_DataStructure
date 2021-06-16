//Patrick Downing
package assg2_downingp18;

public class RewardsAccount extends StudentAccount
{
	
	double rewards;
	double balance;
	
	//This is the default constructor of Rewards account.
	public RewardsAccount()
	{
		super();
		rewards = 0;
	}

	/* This is the second constructor that set's the balance of the rewards account and adds
	 * 5 if the amount set is 100 or more
	 */
	public RewardsAccount(double bala) 
	{
		super(bala);
		
		if(bala >= 100)
		{
			rewards += 5;
			bala = balance;
		}
	}
	//This method gets the rewards
	public double getRewards()
	{
		return rewards;
	}
	// This is an extra method used to test the redeemRewads method.
	public double setRewards(double rewards)
	{
		this.rewards += rewards;
		return this.rewards;
	}

	//This method will add the rewards to Rewards account balance while setting the rewards to 0
	public double redeemRewards()
	{
		if(rewards >= 25)
		{
			 
			 
			 rewards = 0;
			 return 0;
			 
		}
		else
		{
			System.out.println("Not eligible for rewards");
			return 0;
		}
		
	
	}
	
	@Override
	//This method is the toString for this class
	public String toString()
	{
		return super.toString() +  "Rewards balance: " +rewards;
		
	}
	@Override
	//This method deposits into the rewards account while adding 5 if the amount deposited is 100 or more
	public double deposit(double depo)
	{
		super.deposit(depo);	
		if(depo >= 100)
		{
			rewards += 5;
			depo = balance;
		return depo;
		}
		return depo;
	}
	@Override
	//This method prints the info for the Rewards account
	public void printInfo()
	{
		super.printInfo();
		System.out.println("Rewards balance: " + rewards);
	}
}


