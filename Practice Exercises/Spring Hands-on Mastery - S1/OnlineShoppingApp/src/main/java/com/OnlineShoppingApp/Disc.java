package com.OnlineShoppingApp;

public class Disc extends Product {

    private int capacity;
    
    

    public Disc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Disc(int productId, String productName, double price) {
		super(productId, productName, price);
		// TODO Auto-generated constructor stub
	}

	// Constructor with dependencies
    public Disc(int productId, String productName, double price, int capacity) {
        super(productId, productName, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Disc [productId=" + getProductId() +
                ", productName=" + getProductName() +
                ", price=" + getPrice() +
                ", capacity=" + capacity + "]";
    }
}
