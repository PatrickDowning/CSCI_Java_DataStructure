//Patrick Downing
package assg5_downingp18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

interface BookCatalogInterface {
	/*This method extracts the data from the file and stores it in an ArrayList,it has a FileNotFoundException
	   in case the file is not found
	*/	
 public void loadData(String data) throws FileNotFoundException;
//This method shows the objects in the ArrayList
  public void displayCatalog();
//This method searches for a specific book then returns the book object
  public Book searchForBook(String title);
//This method adds a book if unless the book already exists in the ArrayList
  public boolean addBook(String isbn,String title, String author, String publisher,String pubYear);
//This method updates the book object
  public boolean updateBook(String isbn,String title, String author, String publisher,String pubYear);
//this method erases a certain object of book according to titles
 public boolean removeBook(String title);
//This method creates a new ArrayList just for books for a specific publisher
  public ArrayList getBookByPublisher(String publisher);
//This sorts the Books by title
  public void Sort();
//This saves the data from the arrayList into the given file it throws IOException for the FileWriter
  public void Save() throws IOException;
  
 
  
  }
 
