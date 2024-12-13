package com.qa.dsa.list.set.queue.map;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeHash {

	public static void main(String[] args) {
		
		Set<Integer>set= new TreeSet<Integer>();
		
		
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
