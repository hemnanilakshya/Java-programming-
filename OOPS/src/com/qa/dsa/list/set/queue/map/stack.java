package com.qa.dsa.list.set.queue.map;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<Integer> stack= new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(12);
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		System.out.println(stack);
		System.out.println(stack.search(2));
		System.out.println(stack.peek());

		
	}

}
