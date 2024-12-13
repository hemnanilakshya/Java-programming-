package com.qa.dsa.list.set.queue.map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSet {

	public static void main(String[] args) {
		Set<Integer>set= new LinkedHashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		System.out.println(set);
		System.out.println(set.size());
		
		System.out.println(set.contains(2));
		
		System.out.println(set.isEmpty());
		System.out.println(set.remove(4));
		System.out.println(set);
		System.out.println(set.size());
		
		


	}

}
