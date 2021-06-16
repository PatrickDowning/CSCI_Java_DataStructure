//PAtrick Downing
package assg3_downingp18;

public class BookNotFoundException extends Exception
{
	//This prints a message if book id is not found
	public BookNotFoundException()
	{
		super(" Not Found");
	}
	//
	public BookNotFoundException(String message)
	{
		super(message);
	}
}
