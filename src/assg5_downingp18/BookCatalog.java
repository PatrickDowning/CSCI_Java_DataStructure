//Patrick Downing
package assg5_downingp18;

import java.io.*;
import java.util.*;


public  class BookCatalog implements BookCatalogInterface
{
	//I made the the arraylist a global variable so it can be used by all the methods
	private static ArrayList<Book> bookz = new ArrayList<Book>();
	//The data variable stores the file name
		private String data;
	/*This method extracts the data from the file and stores it in an ArrayList,it has a FileNotFoundException
	   in case the file is not found
	*/	
		public void loadData(String data) throws FileNotFoundException
	{
		//variable declaration
		this.data=data;
		String a, b, c, d, f,g;
		
		File file = new File(data);
		Scanner s = new Scanner(file);
		//this while loop retrieves the data from the file and adds them to the array list
		while(s.hasNextLine()) {
			a = s.nextLine();
			b = s.nextLine();
			c = s.nextLine();
			d = s.nextLine();
			f = s.nextLine();
			g = s.nextLine();
		
			bookz.add(new Book(a,b,c,d,f));
			
			
		}
	}
	//This method shows the objects in the ArrayList
	public void displayCatalog()
	{
		//I used an iterator to go through the ArrayList this time
		Iterator<Book> it = bookz.iterator();
		while(it.hasNext()) { 
			System.out.println(it.next()); 
			}
	}
	//This method searches for a specific book then returns the book object
	public Book searchForBook(String title)
	{
		//This for loop checks if the line read is equal to the title then returns it
		//I used this for loop a lot so I will try not to repeat the comments
		for(int i  = 0; i < bookz.size(); i++) {
            if((bookz.get(i).getTitle()).equals(title)) {
                return bookz.get(i);
            }
            bookz.get(i);
        }
		return null;
	}
	
	//This method adds a book if unless the book already exists in the ArrayList
	public boolean addBook(String isbn,String title, String author, String publisher,String pubYear)
	{
	 
		for(int i  = 0; i < bookz.size(); i++) {
            if((bookz.get(i).getTitle()).equals(title)) {
				System.out.println("Book already exist");
				return false;
			}
		}
			bookz.add(new Book(isbn,title,author,publisher,pubYear));
			return true;
	}
		
	//This method updates the book object
	public boolean updateBook(String isbn,String title, String author, String publisher,String pubYear)
	{
		for(int i  = 0; i < bookz.size(); i++) {
            if((bookz.get(i).getTitle()).equals(title)) {
                bookz.remove(i);
                bookz.add(new Book(isbn,title,author,publisher,pubYear));
                return true;
            }
		} 
		System.out.println("Book not found");
		return false;
	}
	//this method erases a certain object of book according to titles
	public boolean removeBook(String title)
	{
		for(int i  = 0; i < bookz.size(); i++) {
            if((bookz.get(i).getTitle()).equals(title)) {
                bookz.remove(i);
               return true;
            }
		}
		
		System.out.println("Book not found");
		return false;
	}
	//This method creates a new ArrayList just for books for a specific publisher
	public ArrayList<Book> getBookByPublisher(String publisher)
	{
		ArrayList<Book> bPublisher = new ArrayList<Book>();
		for(int i  = 0; i < bookz.size(); i++) {
            if((bookz.get(i).getPublisher()).equals(publisher)) {
            	bPublisher.add(bookz.get(i));
            	return bPublisher;
            }
		}
		System.out.println("Publisher not found");
		return bPublisher;
	}
	//This sorts the Books by title
	public void Sort()
	{
		//I used the Comparator.comparing for this method because I thought it was the most efficient way if doing it
		Collections.sort(bookz, Comparator.comparing(Book::getTitle));
	}
	//This saves the data from the arrayList into the given file it throws IOException for the FileWriter
	public void Save() throws IOException
	{
		
	File file = new File(data);
	FileWriter fw = new FileWriter(file);
	PrintWriter pw = new PrintWriter(fw);
	
	//This iterates through the ArrayList then adds the elements in the list into a file
	Iterator<Book> test = bookz.iterator();
	
	while(test.hasNext()) { 
		pw.println(test.next()); 
		}
	pw.close();
	}

	
}
