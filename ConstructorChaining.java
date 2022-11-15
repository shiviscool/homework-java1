package com.homework;

public class ConstructorChaining {
	String studentname; 
	int studentage;
	
	public ConstructorChaining() {
		this("Shiv", 12);
	}
	
	public ConstructorChaining(String studentname, int studentage) {
		this.studentname = studentname;
		this.studentage = studentage;
	}
}