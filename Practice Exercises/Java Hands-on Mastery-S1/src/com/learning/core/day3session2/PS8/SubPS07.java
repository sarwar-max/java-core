package com.learning.core.day3session2.PS8;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class SubPS07 {
	public static void main(String[] args) {
		Map<Integer, Car> cars = new TreeMap<Integer, Car>();
		cars.put(1, new Car(80050.0, "Bugatti"));
		cars.put(2, new Car(305000.0, "Swift"));
		cars.put(3, new Car(600100.0, "Audi"));
		cars.put(4, new Car(900000.0, "Benz"));

		Optional<Car> greatestPrice = cars.entrySet().stream()
				.max(Comparator.comparing(entry -> entry.getValue().getPrice())).map(Map.Entry::getValue);

		// Retrieve the key associated with the least price
		Optional<Car> leastPrice = cars.entrySet().stream()
				.min(Comparator.comparing(entry -> entry.getValue().getPrice())).map(Map.Entry::getValue);

		// Print the keys associated with the greatest and least prices
		greatestPrice.ifPresent(value -> System.out.println(value));
		leastPrice.ifPresent(value -> System.out.println(value));
	}
}
