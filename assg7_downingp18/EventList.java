//Patrick Downing
package assg7_downingp18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class EventList {
	
	//variable
	LinkedList <Event> num = new LinkedList<Event>();
	//constructor
	public EventList() {
		
		num = new LinkedList<Event>();
	}
	
	//insert method
	public void insertE(Event a) {
		if(num.isEmpty()) {
			this.num.add(a);
		}
		
		else if(a.getDep()> num.element().getDep()) {
		this.num.addFirst(a);
		}
		else if(a.getDep()< num.element().getDep()) {
			this.num.addLast(a);
		}
		
	}
	//this is a peek method
	public Event peekE() {
		return this.num.peek();
	}
	//remove method
	public Event removeE() {
		return this.num.remove();
	}
	//retrieve method
	public Event retrieveE() {
		return this.num.poll();
	}
	
	//Checks if event list is empty
	public boolean isEmpty() {
		return this.num.isEmpty();
		
		
	}

//to String
	@Override
	public String toString() {
		return "EventList=" + num;
	}
}
