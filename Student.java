/*
 * Create a class as student
 * Attributes – id, name, class
 * Create two objects – Copy one object from other
 * Create a method – which print all the attributes
*/

package com.test;

public class Student {
	int id;
	String name;
	String section;

	public void display() {
		System.out.println(id + "\n" + name + "\n" + section);
	}

	Student(int id, String name, String section) {
		this.id = id;
		this.name = name;
		this.section = section;
	}

	public void copy(Student new_student) {
		name = new_student.name;
		id = new_student.id;
		section = new_student.section;
	}

	Student() {}

	public static void main(String[] args) {
		Student student = new Student(1325, "Bob", "6SS");
		Student student1 = new Student();

		student.display();
		student1.copy(student);
		student1.display();
	}
}
