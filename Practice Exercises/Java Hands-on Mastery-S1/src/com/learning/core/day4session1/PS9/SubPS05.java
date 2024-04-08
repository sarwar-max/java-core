package com.learning.core.day4session1.PS9;

public class SubPS05 {

	private Node front; // Front of the queue (first element)
	private Node rear; // Rear of the queue (last element)

	// Constructor to initialize an empty queue
	public SubPS05() {
		this.front = null;
		this.rear = null;
	}

	// Method to check if the queue is empty
	public boolean isEmpty() {
		return front == null;
	}

	// Method to enqueue an element to the rear of the queue
	public void enqueue(int item) {
		Node newNode = new Node(item);
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	// Method to dequeue an element from the front of the queue
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1; // Return -1 or throw an exception for empty queue
		}
		int removedItem = (int) front.data;
		front = front.next;
		if (front == null) {
			rear = null; // If queue becomes empty after dequeue
		}
		return removedItem;
	}

	// Method to display the elements in the queue
	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.print("Elements in queue: ");
		Node current = front;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Create a queue using linked list
		SubPS05 queue = new SubPS05();

		// Enqueue elements into the queue
		queue.enqueue(89);
		queue.enqueue(99);
		queue.enqueue(109);
		queue.enqueue(209);
		queue.enqueue(309);

		// Display elements in the queue
		queue.display();

		// Remove two elements from the queue
		queue.dequeue();
		queue.dequeue();

		// Display elements after removing two elements
		System.out.println("After removing two elements: ");
		queue.display();
	}
}
