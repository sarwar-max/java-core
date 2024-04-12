package com.OnlineShoppingApp;

public class Battery extends Product {
	private boolean rechargeable;

	public Battery(int productId, String productName, double price, boolean rechargeable, double discount) {
		super(productId, productName, price * (1 - discount), discount); // Apply the discount to the price
		this.rechargeable = rechargeable;
	}

	// Getters and setters
	public boolean isRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}

	@Override
	public String toString() {
		return "Battery [productId=" + getProductId() + ", productName=" + getProductName() + ", price=" + getPrice()
				+ ", rechargeable=" + rechargeable + ", discount=" + getDiscount() + "]";
	}
}
