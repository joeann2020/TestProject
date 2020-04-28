// Priority queue example

package com.test.java;

//Java program to demonstrate working of 
//priority queue in Java 
import java.util.*; 

class PriorityQueueExample { 
	public static void main(String args[]) 
	{ 
		// Creating empty priority queue 
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(); 

		// Adding items to the pQueue using add() 
		pQueue.add(100); 
		pQueue.add(20); 
		pQueue.add(15); 
		pQueue.add(50); 
		/*
		// Printing the top element of PriorityQueue 
		System.out.println(pQueue.peek()); 

		// Printing the top element and removing it 
		// from the PriorityQueue container 
		System.out.println(pQueue.poll()); 

		// Printing the top element again 
		System.out.println(pQueue.peek()); 
		*/
		System.out.println(pQueue);
	} 
} 
