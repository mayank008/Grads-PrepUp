package org.demo.grads;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i <9);
		
		Predicate<Integer> greaterthan = i -> (i > 9);
		
		// Calling Predicate method
		System.out.println(lesserthan.test(10));
		System.out.println(greaterthan.test(10));
	}
}
