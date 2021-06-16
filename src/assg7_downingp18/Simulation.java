//Patrick Downing
package assg7_downingp18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Simulation {

	public static void main(String[] args) throws FileNotFoundException {
		
		//start simulation
		System.out.println("Simulation begins");
		LinkedList <Event> bankfile = new LinkedList<Event>();
		EventList position = new EventList();
		Queue<Event> customer = new LinkedList<Event>();
		int people = 0;
		
		//Reads file
		File file = new File("input.txt");
		Scanner s = new Scanner(file);
		while(s.hasNextLine()) {
		int arr = s.nextInt();
		int tran = s.nextInt();
		
		Event a = new Event(arr,tran);
		bankfile.addLast(a);;
		}
		
		// beginning of algorithm
		position.insertE(bankfile.pop());
		
		while(!position.isEmpty()) {
			Event newEvent = position.retrieveE();
			position.insertE(newEvent);
			if(newEvent.getType()=='A') {
				arrivalTime(newEvent, bankfile,  position, customer);
				people++;
			}
			
		else {
			departureTime(newEvent, position, customer);
			
			}
			
		}
		System.out.println("\nFinal Statistics");
		System.out.println("Total number of people processed: "+people);
	}
	//method for arrival Time
	public static void arrivalTime(Event newEvent,LinkedList<Event> bankfile, EventList position, Queue<Event> customer) throws FileNotFoundException {
		
		
		
		boolean Front= customer.isEmpty();
		customer.add(newEvent);
		position.removeE();
	
		
		if(Front) {
			Event d = new Event(newEvent.getArrival(),newEvent.getTransaction(),'D');
			position.insertE(d);
		}
		
		if(!bankfile.isEmpty()) {
			Event a = (Event) bankfile.pop();
			position.insertE(a);
		}
		System.out.println("Processing an arrival event at time: " + newEvent.getArrival());
	}
	//Departure TIme
	public static void departureTime(Event newEvent, EventList position, Queue<Event> customer) {
		
		System.out.println("Processing a departure event at time: " + position.peekE().getDep());
		
		customer.remove();
		position.removeE();
		
		if(customer.isEmpty()) {
			Event d = new Event(newEvent.getArrival(),newEvent.getTransaction(),'D');
			position.insertE(d);
		}
		
	}
}


