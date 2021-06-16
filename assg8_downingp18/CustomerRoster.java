//Patrick Downing
package assg8_downingp18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CustomerRoster {
  //Lists
	BinarySearchTree<Customer,String> tree = new BinarySearchTree<Customer,String>();
	TreeIterator<Customer> showtree = new TreeIterator<Customer>(tree);
	//loads data from file
	public void loadData() throws FileNotFoundException {

			File file = new File("assg8_CustomerRoster.txt");
			Scanner s = new Scanner(file);
				
				
			while(s.hasNextLine()) {
				String currentLine = s.nextLine();
				String[] words = currentLine.split("	"); 
				tree.insert(new Customer(words[0],words[1],words[2]));
				}
				s.close();
	}
	//displays data
	public void displayData(){
		showtree.setInorder();
		Customer a;
		while(showtree.hasNext()== true) {
			a =(Customer) showtree.next();
			System.out.print(a.toString());
		}
	}
	//add customers
	public void addCustomer(String isbn, String name, String number) {
		if(tree.retrieve(isbn)!=null) {
			System.out.println("Customer already exists");
		}
		else {
		tree.insert(new Customer(isbn,name,number));
		}
	}
	//delete customer
	public void deleteCustomer(String isbn) {
		if(tree.retrieve(isbn)==null) {
			System.out.println("Customer does not exists");
		}
		else {
		tree.delete(isbn);
		}
	}
	//search for customers
	public void searchCustomer(String isbn) {
		if(tree.retrieve(isbn)==null) {
			System.out.println("Customer does not exists");
		}
		else {
		System.out.println(tree.retrieve(isbn));
		}
	}
	//update customers
	public void updateCustomer(String isbn,String name, String number) {
		if(tree.retrieve(isbn)==null) {
			System.out.println("Customer does not exists");
		}
		else {
		tree.delete(isbn);
		addCustomer(isbn,name,number);
		}
	}
	//save customers
	public void Save() throws IOException {
		File file = new File("assg8_CustomerRoster.txt");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		Customer a;
		showtree.setInorder();
		while(showtree.hasNext()==true) { 
			a = (Customer) showtree.next(); 
			pw.println(a.getKey()+"	"+a.getName()+"	"+a.getNumber());
			}
	
		pw.close();
	}
}
