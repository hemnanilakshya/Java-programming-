package com.qa.dsa.list.set.queue.map;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		  LinkedList<String> list = new LinkedList<>();
		  list.addLast("chicko");
		  list.add("mango");
		  list.add("apple");
		  list.add("orange");
		  list.addFirst("watermelon");
		  
		  System.out.println(list);
		  System.out.println(list.getFirst());
		  System.out.println(list.getLast());
		  list.removeFirst();
		  list.removeLast();
		  System.out.println(list);

		  
		  
		  
	}

}
