//Patrick Downing
package assg5_downingp18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LibraryApplication 
{
	
	 public static void main(String args[]) throws IOException {
	  
	  //This declares an object of BookCatologe and reads the file immediately
	 BookCatalog library = new BookCatalog(); 
	 library.loadData("assg5_BookCatalog.txt");
	 //This creates the variables for the menu
	 Scanner menu = new Scanner(System.in);
	 int choice; 
	 
	
	 do {
	  
	  //The menu
	  System.out.println("1. Display all the books");
	  System.out.println("2. Search for a book");
	  System.out.println("3. Add a new book");
	  System.out.println("4. Update an existing book");
	  System.out.println("5. Remove a book");
	  System.out.println("6. Search for books by publisher");
	  System.out.println("7. Sort all the books based on title");
	  System.out.println("8. Save data"); 
	  System.out.println("9. Exit");
	  
	  
	  choice = menu.nextInt();
	   
	  //Display all menu
	  if(choice == 1) 
	  	{ 
		  Scanner read = new Scanner(System.in);
		  
		  library.displayCatalog();
		  
		//enter phase
			 System.out.println("Please hit enter to continue");
			 read.nextLine();
			 
		  }
	  //Search Book menu
	  else if(choice == 2) { 
		  System.out.println("Please input title. \n");
		  Scanner read = new Scanner(System.in);
		 String two = read.nextLine();
		 System.out.println(library.searchForBook(two));
		 //enter phase
		 System.out.println("Please hit enter to continue");
		 read.nextLine();
		
	  }
	  //Add book menu
	  else if(choice == 3) { 
		  
		  Scanner read = new Scanner(System.in);
		  
		  System.out.println("enter isbn\n"); 
		  String isbn = read.nextLine(); 
		  System.out.println("enter title\n"); 
		  String title = read.nextLine();
		  System.out.println("enter author\n"); 
		  String author = read.nextLine();
		  System.out.println("enter publisher\n"); 
		  String publisher = read.nextLine();
		  System.out.println("enter pubYer\n"); 
		  String pubYear = read.nextLine();
		  
		  library.addBook(isbn, title, author, publisher, pubYear);
		  //enter phase
		  System.out.println("Please hit enter to continue");
			 read.nextLine();
			
		  } 
	  //Update book menu
	  else if(choice == 4) {
		  //varaibles
		  Book bk = new Book();
		  Scanner read = new Scanner(System.in);
		  System.out.println("Please input title. \n");
		  
		  String two = read.nextLine();
		  bk=library.searchForBook(two);
		  int subm;
		  if(bk!=null) {
		  do {
			  //submenu
		  System.out.println("1. Change ISBN \n");
		  System.out.println("2. Change author \n");
		  System.out.println("3. Change publisher \n");
		  System.out.println("4. Change year \n");
		  System.out.println("5. go back to menu \n");
		  subm = read.nextInt();
		  //Isbn
		  	if(subm==1) {
		  		Scanner sub = new Scanner(System.in);
				  System.out.println("Please input ISBN. \n");
				  String isbn = sub.nextLine();
				  bk.setISBN(isbn);
				  library.updateBook(bk.getISBN(), two, bk.getAuthor(),bk.getPublisher(), bk.getPubYear());
		  	}
		  	//author
		  	else if(subm==2) {
		  		Scanner sub = new Scanner(System.in);
				  System.out.println("Please input author. \n");
				  String author = sub.nextLine();
				  bk.setAuthor(author);
				  library.updateBook(bk.getISBN(), two, bk.getAuthor(),bk.getPublisher(), bk.getPubYear());
		  	}
		  	//publisher
		  	else if(subm==3) {
		  		Scanner sub = new Scanner(System.in);
				  System.out.println("Please input publisher. \n");
				  String publisher = sub.nextLine();
				  bk.setPublisher(publisher);
				  library.updateBook(bk.getISBN(), two, bk.getAuthor(),bk.getPublisher(), bk.getPubYear());
		  	}
		  	//year
		  	else if(subm==4) {
		  		Scanner sub = new Scanner(System.in);
				  System.out.println("Please input PubYear. \n");
				  String pubYear = sub.nextLine();
				  bk.setPubYear(pubYear);
				  library.updateBook(bk.getISBN(), two, bk.getAuthor(),bk.getPublisher(), bk.getPubYear());
		  	}
		  }
		  //close menu
		  while(subm !=5);
		  }
		  else {
			  System.out.println("Book title does not exist");
			  System.out.println("Please hit enter to continue");
			  read.nextLine();
		  }
	  } 
	  //Remove book menu
	  else if(choice == 5) { 
		  
		  Scanner read = new Scanner(System.in);
		  System.out.println("enter book\n");
		  String remove = read.nextLine();
		  
		  library.removeBook(remove);
		  
		//Enter phase
		  System.out.println("Please hit enter to continue");
			 read.nextLine();
			 
		  }
	  //Search publisher menu
	  else if(choice == 6) { 
		  Scanner read = new Scanner(System.in);
		  System.out.println("enter Publisher\n");
		  String publisher = read.nextLine();

		  System.out.println(library.getBookByPublisher(publisher));
		  
		//Enter phase
		  System.out.println("Please hit enter to continue");
			 read.nextLine();
		
		  } 
	  //Sort by title menu
	  else if(choice == 7) {
		  Scanner read = new Scanner(System.in);
		  library.Sort();
		  library.displayCatalog();
		//Enter phase
		  System.out.println("Please hit enter to continue");
			 read.nextLine();
			
		  } 
	  //Save data menu
	  else if(choice == 8) {
		  Scanner read = new Scanner(System.in);
		  library.Save();
		  
		//Enter phase
		  System.out.println("Please hit enter to continue");
			 read.nextLine();
			
		  }
	  
	  }
	 //closes menu
	 while(choice != 9);
	 //saves data after closing
	 library.Save();
	 //This is the only scanner I can close, If i close the other scanners the program will run into an error
	 menu.close();
	 }
}
