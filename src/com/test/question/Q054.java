package com.test.question;

public class Q054 {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			boolean isPrimeNum = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrimeNum = false;
					break;
				}
			}
			if (isPrimeNum) {
				System.out.printf("%d, ", i);
			}
		}
	}
}
