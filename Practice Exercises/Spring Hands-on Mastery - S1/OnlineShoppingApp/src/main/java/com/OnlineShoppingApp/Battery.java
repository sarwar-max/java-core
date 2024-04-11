package com.OnlineShoppingApp;

public class Battery extends Product {

	private boolean rechargeable;
	
	

	public Battery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Battery(int productId, String productName, double price) {
		super(productId, productName, price);
		// TODO Auto-generated constructor stub
	}

	// Constructor with dependencies
	public Battery(int productId, String productName, double price, boolean rechargeable) {
		super(productId, productName, price);
		this.rechargeable = rechargeable;
	}

	public boolean isRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}

	@Override
	public String toString() {
		return "Battery [productId=" + getProductId() + ", productName=" + getProductName() + ", price=" + getPrice()
				+ ", rechargeable=" + rechargeable + "]";
	}
}
