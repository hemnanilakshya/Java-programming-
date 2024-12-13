package com.qa.dsa.list.set.queue.map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListOperations {

    // Demonstrates operations with ArrayList
    public static void arrayListOperations() {
        // List interface, ArrayList class
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(9);
        list.add(8);

        list2.add(1);
        list2.add(5);
        list2.add(9);
        list2.add(8);
        list2.add(6);
        list2.add(7);
        list2.add(1);
        list2.add(2);

        System.out.println("ArrayList 1: " + list);
        System.out.println("ArrayList 2: " + list2);

        list.remove(1);

        System.out.println( list.contains(9));

        list.addAll(list2);

        System.out.println(list);
    }

    public static void linkedListOperations() {
        LinkedList<String> list = new LinkedList<>();

        list.addLast("chicko");
        list.add("mango");
        list.add("apple");
        list.add("orange");
        list.addFirst("watermelon");

        System.out.println( list);

        System.out.println( list.getFirst());
        System.out.println(  list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("remove " + list);
    }

    public static void stackOperations() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(12);

        System.out.println(stack);

        System.out.println( stack.peek());

        System.out.println( stack.pop());

        System.out.println( stack);

        System.out.println( stack.search(2));

        System.out.println( stack.peek());
    }

    	public static void main(String[] args) {
        System.out.println("ArrayList Operations");
        arrayListOperations();

        System.out.println("LinkedList Operations ");
        linkedListOperations();

        System.out.println("Stack Operations");
        stackOperations();
    }
}
