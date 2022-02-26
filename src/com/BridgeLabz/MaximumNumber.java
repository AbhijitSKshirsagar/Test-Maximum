package com.BridgeLabz;

import java.util.Scanner;

/*
 * Purpose to find maximum number among three string numbers using findMax method
 */
public class MaximumNumber {
	private static void compareTo(String s1, String s2, String s3) {

		String max = s1;

		if (s2.compareTo(max) > 0) {
			max = s2;
			if (s3.compareTo(max) > 0)
				max = s3;
			System.out.println("The maximum number is : " + max);

		}

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Maximum nunber");
		String a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = sc.next();
		System.out.println("Enter the value of b");
		b = sc.next();
		System.out.println("Enter the value of c");
		c = sc.next();
		sc.close();
		compareTo(a, b, c);
	}
}
