//Patrick Downing
package assg3_downingp18;

public class Book 
{
	private int id;
	private String title;
	private String isbn;
	private String lastName;
	private  char category;
	
	
	// This is the constructor for the class
	public Book(int id, String title, String isbn, String lastName, char category)
	{
		this.id = id;
		this.title = title;
		this.isbn = isbn;
		this.lastName = lastName;
		this.category = category;
	}
	// This gets the book id
	public int getId()
	{
		return id;
		
	}
	// This gets the book title
	public String getTitle()
	{
		return title;
		
	}
	//This gets the ISBN number
	public String getISBN()
	{
		return isbn;
		
	}
	//This gets the authors last name
	public String getLastName()
	{
		
		return lastName;
	}
	//This gets the category for the book
	public String getCategory()
	{
		char N = 0;
		char F = 0;
		if(category == N) 
		{
			return "NonFiction";
		}
		
		else if (category == F)
		{
			return "Fiction";
		}
		return null;
		
	}
	//This searches the library for a specific book
	public static int bookSearch(Book[] catalog, int amountBooks, int bookId) throws BookNotFoundException
	{
		int position = -1;
		boolean bookCheck = false;
		
		for(int i =0; i < amountBooks; i++)
		{
			if(catalog[i].getId() == bookId)
			{
				bookCheck = true;
				position = i;
			}
		}
		if(bookCheck == true) 
		{
			return position;
		}
		else
		{
			throw new BookNotFoundException("Book Id " + bookId + "not found");
		}
		
		
	}
	
// This is the toString
	@Override
	public String toString()
	{
		return"Book id: " + id + ", Title: " + title + ", ISBN: " + isbn + ", Author: " + lastName +", "+ getCategory();
		
	}

}
