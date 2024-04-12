package com.OnlineShoppingApp;

public class Disc extends Product {
	private int capacity;

	public Disc(int productId, String productName, double price, int capacity, double discount) {
		super(productId, productName, price * (1 - discount), discount); // Apply the discount to the price
		this.capacity = capacity;
	}

	// Getters and setters
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Disc [productId=" + getProductId() + ", productName=" + getProductName() + ", price=" + getPrice()
				+ ", capacity=" + capacity + ", discount=" + getDiscount() + "]";
	}
}
