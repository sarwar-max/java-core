package com.OnlineShoppingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShoppingCart {
	private List<Product> items = new ArrayList<>();

	public void addItem(Product item) {
		items.add(item);
	}

	public void removeItem(Product item) {
		items.remove(item);
	}

	public List<Product> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}
}
