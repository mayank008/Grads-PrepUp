package org.tiaa.grads;

public class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {

		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {

		if (this.age == st.age)
			return 0;
		else if (this.age > st.age)
			return -1;
		else
			return 1;
	}
}
