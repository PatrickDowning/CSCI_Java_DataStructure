//Patrick Downing
package assg4_downingp18;

import java.util.Scanner;

import assg1_downingp18.ComplexNum;

public class RecursionTest {
	
	//This method deletes the first instance of the given char
	public static String deleteFirst(String str, char ch)
	{
		if(str.length() == 0)
		{
			return str;
		}
		else
		{
			if(str.charAt(0) == ch) {
	            return deleteAll(str.substring(1),(char) str.indexOf(ch));
	        }
			else {
	            return str.charAt(0) + deleteAll(str.substring(1),ch);
	        }
		}
		
	}
	//This method deletes all instances of the given char
	public static String deleteAll(String str, char ch)
	{

		if(str.length() == 0) 
		{
			return str;
		}
		else
		{
			if(str.charAt(0) == ch) {
	            return deleteAll(str.substring(1),ch);
	        }
			else {
	            return str.charAt(0) + deleteAll(str.substring(1),ch);
	        }
		}
	}
	public static void main(String args[])
	{
		Scanner key = new Scanner(System.in);
		int test = 0;
		//This repeats the menu until the user types 3
		do {
		//This prints the menu
		System.out.println("1.	Test deleteFirst method");
		System.out.println("2.	Test deleteAll method");
		System.out.println("3.	Exit");
		
		test = key.nextInt();
		
		if(test == 1)
		{
		//allows user input for deleteFirst input
			System.out.print("Please type String \n");
			Scanner first = new Scanner(System.in);
			String sfirst = first.nextLine();
			
			System.out.print("Please type Character \n");
			Scanner ch = new Scanner(System.in);
			char sch = ch.next().charAt(0);
			
			System.out.println(deleteFirst(sfirst,sch));
			System.out.println("\n");
		}
		//allows user input for deleteAll method
		else if(test == 2)
		{
			System.out.print("Please type String \n");
			Scanner second = new Scanner(System.in);
			String ssecond = second.nextLine();
			
			System.out.print("Please type Character \n");
			Scanner cha = new Scanner(System.in);
			char scha = cha.next().charAt(0);
			
			System.out.println(deleteAll(ssecond,scha));
			System.out.println("\n");
		}
		}
		//closes program
		while(test != 3);
	}
}
