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
		stackList();
		
	}
	
	public static void stackList() {
		List<String> stackList = new Stack<String>();
		stackList.add("first");
		stackList.add("second");
		stackList.add("thrid");
		stackList.add("fourth");
		
		System.out.println(System.lineSeparator() + "StackList values..");
		for(String s: stackList) {
			print(s);
		}
		stackList.remove(0);
		System.out.println(System.lineSeparator() + "StackList values after the 0th element is removed");
		for(String s: stackList) {
			print(s);
		}
		
	}

	public static void priorityQueue() {
		Queue<String> qPriority = new PriorityQueue<String>();
		qPriority.add("q1");
		qPriority.add("q4");
		qPriority.add("q3");
		qPriority.add("q2");
				
		//print the priority Queue
		System.out.println(System.lineSeparator() + "PriorityQueue values..");
		System.out.println("[q1, q4, q3, q2]");
		for (String s : qPriority) {
			print(s);
		}
	}

	public static void linkedListQueue() {
		//Queue hiearchy and it's class, implementing & extending interfaces
		Queue<String> qList = new LinkedList<String>();
		qList.add("q1");
		qList.add("q4");
		qList.add("q2");
		qList.add("q3");
		
		//print the LinkedList Queue
		System.out.println("LinkedListQueue values..");
		System.out.println(qList);
		for(String s : qList) {
			print(s);
		}
		
	}

	public static void print(Object o) {
		System.out.print(o.toString() + " ");
	}
	
}
