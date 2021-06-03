package org.demo.grads;

// Java code to demonstrate remove
// case in Fail-fast iterators

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			if (itr.next() == 2) {
				// will not throw Exception
				itr.remove();
			}
		}

		for(Integer z : al) {
			System.out.println(z);
		}
		System.out.println(al);
		for(int i= 0; i<al.size();i++) {
			System.out.println(al.get(i));
			if(i==2) {
				
			}
		}
		
	}
}
