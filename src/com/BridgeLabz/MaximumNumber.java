package com.BridgeLabz;

import java.util.Scanner;

public class MaximumNumber {
	private static void compareTo(Integer n1, Integer n2, Integer n3) {
		// TODO Auto-generated method stub
		Integer max = n1;

		if (n2.compareTo(max) > 0) {
			max = n2;
			if (n3.compareTo(max) > 0)
				max = n3;
			System.out.println("The maximum number is : " + max);

		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Maximum nunber");

		Integer a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = sc.nextInt();
		System.out.println("Enter the value of b");
		b = sc.nextInt();
		System.out.println("Enter the value of c");
		c = sc.nextInt();
		sc.close();
		compareTo(a, b, c);
	}
}
