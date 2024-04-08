package com.learning.core.day3session1.PS7;

class Product {
	private String productId;
	private String productName;

	public Product(String productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	@Override
	public String toString() {
		return productId + " " + productName;
	}

	@Override
	public int hashCode() {
		return productId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Product product = (Product) obj;
		return productId.equals(product.productId);
	}
}
