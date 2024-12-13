package com.qa.dsa.list.set.queue.map;

import java.util.ArrayList;
import java.util.List;

public class ListBasics {

	public static void main(String[] args) {
			List<String>list=new ArrayList<>();
			list.add("apple");
			list.add("banana");
			list.add("greapes");
			
			//add element to specific position
			
			list.add(0,"mango");
			System.out.println(list);
			System.out.println(list.get(2));
			
			list.remove(1);
			System.out.println(list);
			
			
			System.out.println(list.contains("mango"));
			System.out.println(list.size());
			
			

			list.clear();
			System.out.println(list);
	}

}
