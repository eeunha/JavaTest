package com.test.question;

public class Q016 {
	public static void main(String[] args) {
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
	}

	public static void sum(int a) {
		int sum = 0;
		sum = a;
		System.out.printf("%d = %d\n", a, sum);
	}

	public static void sum(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.printf("%d + %d = %d\n", a, b, sum);
	}

	public static void sum(int a, int b, int c) {
		int sum = 0;
		sum = a + b + c;
		System.out.printf("%d + %d + %d = %d\n", a, b, c, sum);
	}

	public static void sum(int a, int b, int c, int d) {
		int sum = 0;
		sum = a + b + c + d;
		System.out.printf("%d + %d + %d + %d = %d\n", a, b, c, d, sum);
	}

	public static void sum(int a, int b, int c, int d, int e) {
		int sum = 0;
		sum = a + b + c + d + e;
		System.out.printf("%d + %d + %d + %d + %d = %d\n", a, b, c, d, e, sum);
	}
}
