//Patrick Downing
package assg8_downingp18;

import java.io.IOException;
import java.util.Scanner;

public class CustomerMIS {

	public static void main(String[] args) throws IOException {
		
		 //The variables for the menu
		 Scanner menu = new Scanner(System.in);
		 Scanner check = new Scanner(System.in);
		 int choice; 
		 String a,b,c;
		 CustomerRoster people = new CustomerRoster();
		 people.loadData();
		 do {
		  
		  //The menu
		  System.out.println("1. Display all sorted customers");
		  System.out.println("2. Add a customer");
		  System.out.println("3. Delete a customer");
		  System.out.println("4. Search for a customer");
		  System.out.println("5. Update the information of a customer");
		  System.out.println("6. Save and Exit:");
		  
		  choice = menu.nextInt();
		  //displays data
		  if(choice == 1) {
			  people.displayData();
			  
			  System.out.println("\nPlease press enter to continue...");
			  check.nextLine();
		  }
		  //adds
		  else if(choice == 2) {
			  System.out.println("Add isbn");
			  a = check.nextLine();
			  System.out.println("Add name");
			  b = check.nextLine();
			  System.out.println("Add number");
			  c = check.nextLine();
			  
			  people.addCustomer(a, b, c);
			  System.out.println("\nPlease press enter to continue...");
			  check.nextLine();
			  
		  }
		  //deletes
		  else if(choice == 3) {
			  System.out.println("Please insert isbn number of customer you want to delete");
			  a = check.nextLine();
			  people.deleteCustomer(a);
			  System.out.println("\nPlease press enter to continue...");
			  check.nextLine();
		  }
		  //search
		  else if(choice == 4) {
			  System.out.println("Please insert isbn number of customer you want to seach for");
			  a = check.nextLine();
			  people.searchCustomer(a);
			  System.out.println("\nPlease press enter to continue...");
			  check.nextLine();
		  }
		  //update
		  else if(choice == 5) {
			  System.out.println("Add isbn");
			  a = check.nextLine();
			  System.out.println("Add name");
			  b = check.nextLine();
			  System.out.println("Add number");
			  c = check.nextLine();
			  people.updateCustomer(a, b, c);
			  System.out.println("\nPlease press enter to continue...");
			  check.nextLine();
		  }
		  
	}
		 //closes and saves
		 while(choice != 6);
		 menu.close();
		 check.close();
		 people.Save();
	}
}
