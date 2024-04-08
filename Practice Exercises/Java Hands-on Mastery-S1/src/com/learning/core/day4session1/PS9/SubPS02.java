package com.learning.core.day4session1.PS9;

class Node {
	double data;
	Node next;

	public Node(double data) {
		this.data = data;
		this.next = null;
	}
}

public class SubPS02 {
	private Node top;

	// Constructor to initialize an empty stack
	public SubPS02() {
        this.top = null;
    }

	// Method to check if the stack is empty
	public boolean isEmpty() {
		return top == null;
	}

	// Method to push an element onto the stack
	public void push(double value) {
		Node newNode = new Node(value);
		newNode.next = top;
		top = newNode;
	}

	// Method to pop the top element from the stack
	public double pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty. Cannot pop element.");
			return Double.NaN; // Return NaN (Not-a-Number) for empty stack
		} else {
			double poppedValue = top.data;
			top = top.next;
			return poppedValue;
		}
	}

	// Method to display the elements of the stack
	public void displayStack() {
		Node current = top;
		System.out.print("Elements of the stack are: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// Create a new stack
		SubPS02 stack = new SubPS02();

		// Push elements onto the stack (based on input)
		double[] elements = { 10.0, 20.0, 30.0, 40.0 };
		for (double element : elements) {
			stack.push(element);
		}

		// Display the elements of the stack
		System.out.print("The Elements of the stack are: ");
		stack.displayStack();

		// Pop elements from the stack (twice)
		System.out.println("After popping twice:");
		stack.pop();
		stack.pop();
		stack.displayStack();
	}
}
