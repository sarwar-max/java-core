package com.learning.core.day3session2.PS8;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class SubPS08 {

	public static void main(String[] args) {
		Map<Integer, Car> cars = new TreeMap<>();
		cars.put(1, new Car(80050.0, "Bugatti"));
		cars.put(2, new Car(305000.0, "Swift"));
		cars.put(3, new Car(600100.0, "Audi"));
		cars.put(4, new Car(900000.0, "Benz"));

		// Find the key associated with the greatest key
		Optional<Integer> greatestKey = cars.entrySet().stream().max(Comparator.comparing(Map.Entry::getKey))
				.map(Map.Entry::getKey);

		// Check if the greatest key is present and remove the corresponding entry
		greatestKey.ifPresent(key -> {
			cars.remove(key);
			System.out.println("Removed entry with greatest key (Key = " + key + ")");
		});

		// Print remaining cars in the map
		System.out.println("Remaining cars after removal:");
		cars.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

		// PS09_SubPS01 Replace the value mapped by the specified
		cars.replace(1, new Car(180050.0, "Ferrari"));
		cars.forEach((key, value) -> System.out.println(value));
	}
}
