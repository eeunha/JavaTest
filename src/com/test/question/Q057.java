package com.test.question;

public class Q057 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (i % 10 == 0) {
				System.out.printf("1 ~ %3d: %4d\n", i, sum);
			}
		}
	}
}
