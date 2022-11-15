package com.homework;

import java.io.*;
import java.util.*;

public class StaticKeyword {
	static {
		System.out.println("This block gets executed before public static void main(String[] args)\n");
	}

	public static String str = "This variable is available to public static void main(String[] args)\n";

	public static void main(String[] args) {
		System.out.println(str);
	}
}
