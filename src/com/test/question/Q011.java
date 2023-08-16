package com.test.question;

import java.util.Scanner;

public class Q011 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 숫자: ");
		int n1 = scan.nextInt();

		System.out.print("두번째 숫자: ");
		int n2 = scan.nextInt();

		String result = "";

		result = add(n1, n2);
		System.out.println(result);

		result = subtract(n1, n2);
		System.out.println(result);

		result = multiply(n1, n2);
		System.out.println(result);

		result = divide(n1, n2);
		System.out.println(result);

		result = mod(n1, n2);
		System.out.println(result);

		scan.close();
	}

	private static String mod(int n1, int n2) {
		return n1 + " % " + n2 + " = " + (n1 % n2);
	}

	private static String divide(int n1, int n2) {
		return String.format("%d / %d = %.1f", n1, n2, (double) n1 / n2);
	}

	private static String multiply(int n1, int n2) {
		return n1 + " * " + n2 + " = " + (n1 * n2);
	}

	private static String subtract(int n1, int n2) {
		return n1 + " - " + n2 + " = " + (n1 - n2);
	}

	private static String add(int n1, int n2) {
		return n1 + " + " + n2 + " = " + (n1 + n2);
	}
}
