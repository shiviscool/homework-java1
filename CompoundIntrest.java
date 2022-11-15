package com.homework;

import java.io.*;
import java.util.*;

public class CompoundIntrest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("initial principal balance:");
		int p = Integer.parseInt(scan.nextLine());
		System.out.print("interest rate:");
		int r = Integer.parseInt(scan.nextLine());
		System.out.print("number of times interest applied per time period:");
		int n = Integer.parseInt(scan.nextLine());
		System.out.print("number of time periods elapsed:");
		int t = Integer.parseInt(scan.nextLine());

		double a = p*Math.pow(1+(r/n), n*t);

		System.out.println(a);

		scan.close();
	}
}
