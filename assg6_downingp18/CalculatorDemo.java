//Patrick Downing
package assg6_downingp18;
//This demo tests the calculator class
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CalculatorDemo {
	
	public static void main(String arg[]) throws FileNotFoundException {
	//variables
	Scanner read = new Scanner(System.in);
	String continu = "yes";

	
	//menu
	 do {
	//asks for infix input and reads it	 
	System.out.println("Please input a infix expression \n");
	String firstInfix = read.nextLine();
	Calculator a = new Calculator(firstInfix);

	System.out.println(a.toString());
	
	//converts infox to postfix and reads it
	String st = a.getPostfix();
	System.out.println("The postfix is: "+a.getPostfix());
	
	//evaluates postfix
	System.out.println("The evaluted post fix is: " + a.evaluate(st) + "\n");
	
	System.out.println("Hit enter to continue or any other key to exit");
	continu =read.nextLine();

	 }
	 while(continu.equals(""));
}
}
