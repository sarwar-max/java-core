package com.learning.core.day4session1.PS9;

public class SubPS04 {

	private int[] queue;
	private int front;
	private int rear;
	private int size;
	private int capacity;

	// Constructor to initialize the queue
	public SubPS04(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
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

	// Method to add an element to the rear of the queue (enqueue)
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot enqueue.");
			return;
		}
		rear = (rear + 1) % capacity; // Circular increment of rear index
		queue[rear] = item;
		size++;
	}

	// Method to remove an element from the front of the queue (dequeue)
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1; // Return -1 or throw an exception for empty queue
		}
		int removedItem = queue[front];
		front = (front + 1) % capacity; // Circular increment of front index
		size--;
		return removedItem;
	}

	// Method to display the elements in the queue
	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.print("Elements in queue: ");
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
		// Create a queue with capacity 4
		SubPS04 queue = new SubPS04(4);

		// Enqueue elements into the queue
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		// Display elements in the queue
		queue.display();

		// Remove the first element from the queue
		int removedElement = queue.dequeue();
		System.out.println("After removing first element: ");
		queue.display();
	}
}
