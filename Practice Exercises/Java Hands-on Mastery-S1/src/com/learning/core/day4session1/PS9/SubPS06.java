package com.learning.core.day4session1.PS9;

public class SubPS06 {

	private int[] queue;
	private int front; // Index of the front element
	private int rear; // Index of the rear element
	private int size; // Current number of elements in the queue
	private int capacity; // Maximum capacity of the queue

	// Constructor to initialize the circular queue
	public SubPS06(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

	// Method to check if the queue is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// Method to check if the queue is full
	public boolean isFull() {
		return size == capacity;
	}

	// Method to add an element to the rear of the circular queue (enqueue)
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot enqueue.");
			return;
		}
		if (isEmpty()) {
			front = 0; // Initialize front index when adding the first element
		}
		rear = (rear + 1) % capacity; // Circular increment of rear index
		queue[rear] = item;
		size++;
	}

	// Method to remove an element from the front of the circular queue (dequeue)
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1; // Return -1 or throw an exception for empty queue
		}
		int removedItem = queue[front];
		if (front == rear) {
			front = -1;
			rear = -1; // Reset front and rear indices when the queue becomes empty
		} else {
			front = (front + 1) % capacity; // Circular increment of front index
		}
		size--;
		return removedItem;
	}

	// Method to display the elements in the circular queue
	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.print("Elements in circular queue: ");
		int count = size;
		int index = front;
		while (count > 0) {
			System.out.print(queue[index] + " ");
			index = (index + 1) % capacity;
			count--;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Create a circular queue with capacity 4
		SubPS06 queue = new SubPS06(4);

		// Enqueue elements into the circular queue
		queue.enqueue(14);
		queue.enqueue(13);
		queue.enqueue(22);
		queue.enqueue(-8);

		// Display elements in the circular queue
		queue.display();

		// Remove the first element from the circular queue
		int removedElement = queue.dequeue();
		System.out.println("After removing first element:");
		queue.display();
	}
}
