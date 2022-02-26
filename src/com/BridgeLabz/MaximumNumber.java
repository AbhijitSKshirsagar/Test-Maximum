package com.BridgeLabz;

import java.util.Scanner;

/*
 * Purpose to find maximum number among three float numbers using findMax method
 */
public class MaximumNumber {
	private static void compareTo(Float n1, Float n2, Float n3) {

		Float max = n1;

		if (n2.compareTo(max) > 0) {
			max = n2;
			if (n3.compareTo(max) > 0)
				max = n3;
			System.out.println("The maximum number is : " + max);

		}

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Maximum nunber");
		float a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = sc.nextFloat();
		System.out.println("Enter the value of b");
		b = sc.nextFloat();
		System.out.println("Enter the value of c");
		c = sc.nextFloat();
		sc.close();
		compareTo(a, b, c);
	}
}
