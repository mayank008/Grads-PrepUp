package org.tiaa.grads;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		// create and add key and value pairs
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);

		// Access particular item
		System.out.println(capitalCities.get("England"));

		// Remove particular item
		capitalCities.remove("England");
		System.out.println(capitalCities);
	}
}
