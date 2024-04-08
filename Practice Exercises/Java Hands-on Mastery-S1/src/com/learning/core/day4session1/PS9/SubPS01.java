package com.learning.core.day4session1.PS9;

public class SubPS01 {
	private int maxSize; // Maximum size of the stack
	private String[] stackArray; // Array to hold the stack elements
	private int top; // Index of the top element in the stack

	// Constructor to initialize the stack with a specific size
	public SubPS01(int size) {
		this.maxSize = size;
		this.stackArray = new String[maxSize];
		this.top = -1; // Initialize top to -1 (empty stack)
	}

	// Method to push an element onto the stack
	public void push(String value) {
		if (isFull()) {
			System.out.println("Stack is full. Cannot push element.");
		} else {
			top++;
			stackArray[top] = value;
			System.out.println("Pushed: " + value);
		}
	}

	// Method to pop the top element from the stack
	public String pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty. Cannot pop element.");
			return null;
		} else {
			String poppedValue = stackArray[top];
			top--;
			return poppedValue;
		}
	}

	// Method to check if the stack is empty
	public boolean isEmpty() {
		return (top == -1);
	}

	// Method to check if the stack is full
	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public static void main(String[] args) {
		// Create a stack of maximum size 5
		SubPS01 stack = new SubPS01(5);

		// Push 4 elements onto the stack
		stack.push("Hello");
		stack.push("world");
		stack.push("java");
		stack.push("Programming");

		// Display stack contents after pushing 4 elements
		System.out.println("After Pushing 4 Elements:");
		stack.printStack();

		// Pop an element from the stack
		String poppedElement = stack.pop();
		System.out.println("\nAfter a Pop:");
		stack.printStack();
	}

	// Helper method to print the elements of the stack
	public void printStack() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
		} else {
			System.out.print("Stack: ");
			for (int i = 0; i <= top; i++) {
				System.out.print(stackArray[i] + " ");
			}
			System.out.println();
		}
	}
}
