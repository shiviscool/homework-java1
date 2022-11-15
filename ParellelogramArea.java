package com.homework;

import java.util.Scanner;

public class ParellelogramArea {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x = Integer.parseInt(scan.nextLine());
		int y = Integer.parseInt(scan.nextLine());
		
		int area = x*y;
		
		System.out.println(area);
		
		scan.close();
	}
}
