//Patrick Downing
package assg7_downingp18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Event {
//the variable
	private int arrival, transaction, departure;
	
	char type;
	//constructor
	public Event(int arrival, int transaction, char type) {
		this.arrival = arrival;
		this.transaction = transaction;
		
		this.type = type;
	}
	//2nd constructor
	public Event( int arrival, int transaction) {
		this.arrival = arrival;
		this.transaction = transaction;
		
		this.type = 'A';
	}
	//gets transaction
	public int getTransaction() {
		return transaction;}
	//gets Arrival
	public int getArrival() {
		return arrival;}
	//get Departure
	public int getDep() {
		return this.departure = this.arrival + this.transaction;
				}
	//get Type
	public char getType() {
		return type;
		}
	
 //to string
	@Override
	public String toString() {
		return "Event arrival=" + arrival + ", transaction=" + transaction + ", departure=" + departure + ", type="
				+ type;
	}
	
	
	
}
