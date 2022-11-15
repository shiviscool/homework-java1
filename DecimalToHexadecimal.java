package com.homework;

import java.io.*;
import java.util.*;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = Integer.parseInt(scan.nextLine());

		System.out.println(Integer.toHexString(a));

		scan.close();
	}
}
