//Patrick Downing
package assg5_downingp18;

public class Book implements Comparable<Book>
{
//These are the variable declarations
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private String pubYear;
	
	public Book() {
		
	}
	//This is the constructor for this class
	public Book(String isbn,String title, String author, String publisher,String pubYear)
	{
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pubYear = pubYear;
	}
	//This returns the isbn String
	public String getISBN()
	{
		return isbn;
	}
	//This String sets a new isbn
	public String setISBN( String isbn)
	{
		return this.isbn = isbn;
	}
	//This returns the title String
	public String getTitle()
	{
		return title;
	}
	//This returns the author String
	public String getAuthor()
	{
		return author;
	}
	//This String sets a new author
	public String setAuthor(String author)
	{
		return this.author = author;
	}
	//This returns the publisher String
	public String getPublisher()
	{
		return publisher;
	}
	//This String sets a new publisher
	public String setPublisher(String publisher)
	{
		return this.publisher = publisher ;
	}
	//This returns the pubYear String
	public String getPubYear()
	{
		return pubYear;
	}
	//This String sets a new pubYear
	public String setPubYear(String pubYear)
	{
		return this.pubYear = pubYear;
	}
	//This is the equals method 
	@Override
	public boolean equals(Object obj) {
		//I used eclipse to start the equals and then I edited a lot of the if statements
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (pubYear != other.pubYear)
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	//This is the toString method made to match the file
	@Override
	public String toString() {
		return isbn + "\n" + title + "\n" + author+"\n"+publisher+"\n"+pubYear+"\n"+" ";
	}
	@Override
	public int compareTo(Book obj) {
		char book1;
		char book2;
        String size = obj.getTitle();
        //This for loop is where the actual comparing occurs
        for(int i = 0; i < size.length(); i++ ) {
             book1 = this.title.charAt(i);
             book2 = obj.title.charAt(i);
             if (book1 < book2 ) { 
                return 1;   
            }
            else if (book1 > book2) {
                return -1;     
            }
        }
        return 0; 
    }

	
	}

