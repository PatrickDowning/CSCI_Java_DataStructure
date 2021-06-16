package assg3_downingp18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BookDemo 
{
	public static void main(String args[]) throws BookNotFoundException
	{
		
		
		Scanner input = new Scanner(System.in);
		int storage;
		int booksInLib = 0;
		
		
		
		//I figured out how to save from text file buy kept getting a ArrayIndexOutOfBoundsException
		//and because of this I could not move past this issue
		try {
			
			File file = new File("catalog.txt");
			String[] values;
			String Line = "";
			BufferedReader br = new BufferedReader(new FileReader(file));
			Book[] Lib = new Book[100];
			int position = 0;
			while((Line = br.readLine()) != null)
			
			
			
			{
				values= Line.split("\\s+", 5);
				
				System.out.println("Line" + Line);
				
				
				String id = values[0];
				String title = values[1];
				
				System.out.println("Title"+title);
				String isbn = values[2];
				String lastName = values[3];
				String category = values[4];
			
				int realId = Integer.parseInt(id);
				char realcat = category.charAt(0);
				
				System.out.println("position"+ position );
				
				Lib[position] = new Book(realId, title, isbn, lastName, realcat);
				
				
				
				System.out.println(Lib[position]);
				
				position++;
				
			}
			
			br.close();
		}
		/*
		 * catch(ArrayIndexOutOfBoundsException e) { e.printStackTrace();
		 * System.out.println(""); }
		 */
		
		catch(FileNotFoundException e) {
			
			System.exit(0);
		}
		catch(IOException e) {
			
			System.exit(0);
		}
	//This was to test the toString
		Book a = new Book(12345, "Hans", "1234567890","back",'N' );
		
	System.out.println(a.toString());
	//I attempted to call the searchBook method but without being able to create the arrays I couldn't do anything
	/*
	System.out.println("Enter Book ID: ");
	storage = input.nextInt();
	
	System.out.print(Book.bookSearch(, 1, storage));
	*/
	
	}
	
	}


