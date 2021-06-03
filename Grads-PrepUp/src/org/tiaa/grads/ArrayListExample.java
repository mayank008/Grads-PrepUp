package org.tiaa.grads;

import java.util.ArrayList;
import java.util.List;

class ArrayListExample {

	public static void main(String[] args) {

		// create ArrayList and add element
		List<String> languages = new ArrayList<String>();

		// add() method without the index parameter
		languages.add("Java");
		languages.add("C");
		languages.add("Python");
		System.out.println("ArrayList: " + languages);

		// add() method with the index parameter
		languages.add(1, "JavaScript");
		System.out.println("Updated ArrayList: " + languages);

		// Get element from list
		List<String> animals = new ArrayList<String>();
		// add elements in the arraylist
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Cow");
		System.out.println("ArrayList: " + animals);

		// get the element from the arraylist
		String str = animals.get(1);
		System.out.print("Element at index 1: " + str);

		// Remove Element from List
		List<String> animals2 = new ArrayList<String>();

		// add elements in the array list
		animals2.add("Dog");
		animals2.add("Cat");
		animals2.add("Horse");
		System.out.println("ArrayList: " + animals2);

		// aemove element from index 2
		String str2 = animals2.remove(2);
		System.out.println("Updated ArrayList: " + animals2);
		System.out.println("Removed Element: " + str2);
	}

}
