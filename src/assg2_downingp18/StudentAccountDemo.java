//Patrick Downing
package assg2_downingp18;

public class StudentAccountDemo {

	public static void main(String[] args) {
		
		//Tests the constructors of student class
		StudentAccount a1 = new StudentAccount(44);
		StudentAccount a2 = new StudentAccount(16);
		StudentAccount a3 = new StudentAccount();
		StudentAccount a4 = new StudentAccount(-54);
		StudentAccount a5 = new StudentAccount(100);
		
		//test get balance for Student Account
		System.out.println("Get balance test");
		System.out.println("Account 1 balance is "+a1.getBalance());
		System.out.println("Account 3 balance is "+a3.getBalance());
		System.out.println("Account 4 balance is "+a4.getBalance());
		System.out.println("\n");
		
		//shows account number
		System.out.println("Get account number test");
		System.out.println("Account 1 number is "+a1.getAcctNo());
		System.out.println("Account 2 number is "+a2.getAcctNo());
		System.out.println("\n");
		
		//shows the total amount of accounts
		System.out.println("Get counter test");
		System.out.println("The total amount of accounts are "+ a4.getCounter());
		System.out.println("\n");
		// sets a new balance
		System.out.println("Get new balance test");
		System.out.println("Account 1 balance is "+a1.getBalance());
		System.out.println("Account 1 new balance is " +a5.setBalance(144));
		System.out.println("\n");
		//test deposit
		System.out.println("Deposit test");
		System.out.println("Account 1 balance is \n"+a1.getBalance());
		System.out.println("Account 1 new balance is \n"+a1.deposit(1));
		System.out.println(a1.deposit(0));
		System.out.println(a1.deposit(-1));
		System.out.println("\n");
		// tests charge
		System.out.println("Deposit test");
		System.out.println("Account 1 balance is \n"+a1.getBalance());		
		System.out.println("Account 1 new balance is \n"+a1.charge(1));
		System.out.println(a1.deposit(0));
		System.out.println(a1.deposit(-1));
		System.out.println("\n");
		
		//Transfer out and in test
		System.out.println("Transfer In test");
		System.out.println("This transfer from account 1 to account 2 \n"+a1.transferIn(a2, 12));
		System.out.println(a1.deposit(0));
		System.out.println(a1.deposit(-1));
		System.out.println("\n");
		System.out.println("Transfer Out test");
		System.out.println("This transfer from account 2 to account 1 \n"+a1.transferOut(a2, 12));
		System.out.println(a1.deposit(0));
		System.out.println(a1.deposit(-1));
		System.out.println("\n");
		
		//Print Info test
		System.out.println("Print info test");
		a1.printInfo();
		System.out.println("\n");
		
		//to String test
		System.out.println("To string test");
		System.out.println(a2.toString());
		System.out.println("\n");
		
		//Compare to test
		System.out.println("Compare to test");
		System.out.println(a1.compareTo(a2));
		System.out.println(a2.compareTo(a1));
		System.out.println(a1.compareTo(a1));
		System.out.println("\n");
		/*
		These are to test the RewardsAccount class
		*/
		//Tests the constructor for RewardsAccount
		RewardsAccount b1 = new RewardsAccount(15);
		RewardsAccount b2 = new RewardsAccount(100);
		RewardsAccount b3 = new RewardsAccount(120);
		RewardsAccount b4 = new RewardsAccount();
		
		//I added a set rewards method to test the redeem rewards method
		System.out.println("Set Rewards Test");
		System.out.println(b3.setRewards(20));
		System.out.println("\n");
		
		//Get Rewards test
		System.out.println("Get Rewards Test");
		System.out.println("Amount of rewards in rewards account 1 \n" + b1.getRewards());
		System.out.println("Amount of rewards in rewards account 2 \n"+b2.getRewards());
		System.out.println("Amount of rewards in rewards account 3 \n"+b3.getRewards());
		System.out.println("Amount of rewards in rewards account 4 \n"+b4.getRewards());
		System.out.println("\n");
		
		//Redeem rewards test
		System.out.println("Redeem Rewards Test");
		System.out.println(b1.redeemRewards());
		System.out.println(b2.redeemRewards());
		System.out.println(b3.redeemRewards());
		System.out.println("Amount of rewards in rewards account 3 \n"+b3.getRewards());
		System.out.println("lol" +b3.getBalance());
		System.out.println("\n");
		
		//Rewards Deposit test
		System.out.println("Deposit Test");
		System.out.println(b4.deposit(100));
		System.out.println("Amount of rewards in rewards account 4 \n"+b4.getRewards());
		System.out.println("\n");
		
		//To string test
		System.out.println("To string test");
		System.out.println(b2.toString());
		System.out.println("\n");
		
		//Print Info test
		System.out.println("Print info test");
		b2.printInfo();
		System.out.println("\n");
		
	}
}


