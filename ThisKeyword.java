package com.homework;

public class ThisKeyword {
	public String employeename;
	public int employeeid;

	public ThisKeyword() {
		this("Milo",45125);
	}

	public ThisKeyword(String employeename, int employeeid) {
		this.employeeid = employeeid;
		this.employeename = employeename;
	}
}
