package com.cts.CD.ui;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueueDemo {

	public static void main(String[] args) {
		
		// Queue<String> q = new LinkedList<String>();
		Deque<String> q = new LinkedList<String>();
		    
	      
	      q.add("Yami");
	      q.add("Ayann"); 
	      q.add("Grace");
	      q.add("Nag");
	      q.add("Dany");
	      
	      System.out.println("Elements in Queue:"+q);
	      System.out.println("Removed element: "+q.remove());
	      System.out.println("Head: "+q.element());
	      System.out.println("poll(): "+q.poll());
	      System.out.println("peek(): "+q.peek());
	      System.out.println("Elements in Queue:"+q);

	}

}
