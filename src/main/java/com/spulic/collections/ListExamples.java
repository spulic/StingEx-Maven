package com.spulic.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ListExamples {
	
	public static void main (String ...args) {
		//LinkedList implemented Queue
		linkedListQueue();
		//PriorityQueue implemented Queue
		priorityQueue();
		//StackQueue
		stack();
		
	}
	
	public static void linkedListQueue() {
		//Queue hiearchy and it's class, implementing & extending interfaces
		Queue<String> qList = new LinkedList<String>();
		qList.add("q1");
		qList.add("q4");
		qList.add("q2");
		qList.add("q3");
		
		//print the LinkedList Queue
		System.out.println("** LinkedListQueue values (FIFO) **");
		System.out.println("In the orders of addition => " + qList);
		System.out.print("In the order of storage => ");
		for(String s : qList) {
			print(s);
		}
		
	}
	
	public static void priorityQueue() {
		System.out.println(System.lineSeparator());
		PriorityQueue<String> priorityQ = new PriorityQueue<String>();
		priorityQ.add("q1");
		priorityQ.add("q4");
		priorityQ.add("q3");
		priorityQ.add("q2");
				
		//print the priority Queue
		System.out.println(System.lineSeparator() + "** PriorityQueue values, Ordered by priorty, Out of Queue depends on priority **");
		System.out.println("In the orders of addition => [q1, q4, q3, q2]");
		System.out.print("In the order of storage => ");
		for (String s : priorityQ) {
			print(s);
		}
		String value = priorityQ.peek();
		System.out.println("\nValue of the element in the queue (peek value) => " + value);
		//poll out the element
		priorityQ.poll();
		//print the queue
		System.out.print("Value of the element in the queue after the poll => ");
		for (String s : priorityQ) {
			print(s);
		}
	}

	public static void stack() {
		System.out.println(System.lineSeparator());
		Stack<String> stack = new Stack<String>();
		stack.push("first");
		stack.push("second");
		stack.push("third");
		stack.push("fourth");
		
		
		System.out.println(System.lineSeparator() + "** Stack Orders (LIFO) **");
		System.out.print("In the orders of addition => ");
		for(String s: stack) {
			print(s);
		}
		//pop out the last element added to the stack
		stack.pop();
		System.out.print(System.lineSeparator() + "Stack values after an element is poped out => ");
		for(String s: stack) {
			print(s);
		}
		
	}

	public static void print(Object o) {
		System.out.print(o.toString() + " ");
	}
	
}
