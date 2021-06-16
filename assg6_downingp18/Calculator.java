//Patrick Downing

/*
 * For this assignment I created a calculator that changes
 * infix to postfix then it evaluates the postfix.
 * 
 */

package assg6_downingp18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
	
	// Global variable for the class
	private String userinput;
	private String postFixForm;
	private String infix;
	//this would be false by default but my program isnt changing this variables boolean
	private boolean tester = true;
	// Constructor for the class
	Calculator(String userinput)throws IllegalStateException{
		
		this.userinput = userinput;
		this.infix = userinput;
	}
	
	//converts infix to a postfix, returns true if successful
	
	private boolean convertPostfix(String userinput) {
		
		if (tester != true) {
            throw new IllegalStateException();
       }
		
		//variables for the method
        String newinput = "";
        Stack<Character> numbers = new Stack<Character>();
        
       
        
        //This for loop iterates through the userinput string until it converts to postfix form
        for (int c = 0; c < userinput.length(); c++) {
        	
        	
        	
        	//Puts numbers and a space into newinput
        	if (Character.isDigit(userinput.charAt(c))) { 
                	newinput += userinput.charAt(c);
                	 
                                if (c+1 >= userinput.length() || 
                                		!Character.isDigit(userinput.charAt(c+1))) { 
                                	newinput += ' ';
                                }                
                }
                //Checks operator precedents
                else if (PrecLevel(userinput.charAt(c)) != 0) {
                        while ((!numbers.isEmpty()) && 
                        		(PrecLevel(numbers.peek()) >= PrecLevel(userinput.charAt(c))) && 
                        		(numbers.peek() != '(')) {
                        	newinput += numbers.pop();
                        	newinput += ' ';  
                        }
                        numbers.push(userinput.charAt(c));
                }

                //Check the parenthesis so it knows when to push characters from string
                //and when to pop characters to postfix
                else if (userinput.charAt(c) == '(') {
                	numbers.push(userinput.charAt(c));
                }

                else if (userinput.charAt(c) == ')') {
                        while (!numbers.isEmpty() && numbers.peek() != '(') {
                        	newinput += numbers.pop();    
                        }

                        numbers.pop();
                }
        }

        // Pops operators into postfix
       while (!numbers.isEmpty()) {
    	   newinput += numbers.pop();
       	}
       
       //removes parentheses from postFix  
       newinput = newinput.replace("(", "");
       newinput = newinput.replace(")", ""); 
       
       userinput = newinput; postFixForm = newinput;
       
       //For some reason on my computer "tester = true;" does not work.I tried it in the other methods and it 
       // worked fine. I dont know if this is an issue with my code, my eclipse, my java, or my computer.
       // I asked my friend to try out the tester = true; on his eclipse and it worked so idk what to say
       tester = true;
        return true;
 
}
	//Gets post fix
	public String getPostfix() throws IllegalStateException 
	{
		if (tester != true) {
            throw new IllegalStateException();
       }
		convertPostfix(this.userinput);
		return postFixForm;
	}
	
	
	
	//Determines operatores precedent level
	public int PrecLevel(char ch) 
    { 
        switch (ch) { 
        case '+': case '-': 
            return 1; 
       
        case '*': case '/': 
            return 2; 
        } 
        return -1; 
    } 
	
	
	//This method will evaluate  a postfix. 
    public int evaluate(String userinput)throws IllegalStateException 
 { 
    	if (tester != true) {
            throw new IllegalStateException();
       }
        Stack<Integer> stack = new Stack<>(); 
          
        // This reads all the character 
        for(int i = 0; i < userinput.length(); i++) { 
            char items = userinput.charAt(i); 
            if(items == ' ') 
            continue; 
              
            //sorts through items to determine operators and numbers
            else if(Character.isDigit(items)) { 
                int check = 0; 
                while(Character.isDigit(items)) 
                { 
                    check = check*10 + (int)(items-'0'); 
                    i++; 
                    items = userinput.charAt(i); 
                } 
                i--;
                stack.push(check); 
            } 
              
            //this does the calculations
            else
            { 
                int x = stack.pop(); 
                int y = stack.pop(); 
                  
                switch(items) 
                { 
                    case '+': 
                    stack.push(y+x); 
                    break; 
                      
                    case '-': 
                    stack.push(y- x); 
                    break; 
                      
                    case '/': 
                    stack.push(y/x); 
                    break; 
                      
                    case '*': 
                    stack.push(y*x); 
                    break; 
            } 
            } 
        } 
        return stack.pop();  
    } 
    //toString for infix
    public String toString()throws IllegalStateException {
    	if (tester != true) {
            throw new IllegalStateException();
       }
    	
    	System.out.println(tester);
    	return "The infix is: " + this.infix;
    	
    } 
	
}