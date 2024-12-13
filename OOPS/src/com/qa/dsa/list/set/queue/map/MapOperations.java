package com.qa.dsa.list.set.queue.map;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {

	public static void main(String[] args) {
		Map<Integer,String>map= new HashMap<Integer,String>();
		map.put(1, "sourav");
		map.put(2, "dharshan");
		map.put(3, "prena");
		map.put(4, "sagar");
		
		System.out.println(map);
		
		System.out.println(map.get(2));
		System.out.println(map.isEmpty());
		System.out.println(map.remove(1));
		System.out.println(map);
		System.out.println(map.size());
		

	}

}
