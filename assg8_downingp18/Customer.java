//Patrick Downing
package assg8_downingp18;

public class Customer extends KeyedItem<String>{
 //the variables
	private String isbn,name,number;
	//constructor
	public Customer(String isbn, String name, String number) {
		super(isbn);
		
		this.isbn=isbn;
		this.name=name;
		this.number=number;
		
		
	}
	//get method
	public String getISBN() {
		return isbn;
		
	}
	//get method
	public String getName() {
		return name;
		
	}
	//get method
	public String getNumber() {
		return number;
		
	}
	//toString
	@Override
	public String toString() {
		return "Customer: isbn = " + isbn + ", name = " + name + ", number = " + number;
	}
	
}
