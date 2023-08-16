package com.test.question;

import java.util.Scanner;

public class Q056 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 숫자: ");
		int n1 = scan.nextInt();

		System.out.print("두번째 숫자: ");
		int n2 = scan.nextInt();

		// 첫번째 숫자 약수 구하기
		findDivisor(n1);

		// 두번째 숫자 약수 구하기
		findDivisor(n2);

		// 둘의 공약수 구하기
		findDivisor(n1, n2);
	}

	private static void findDivisor(int n) {
		String result = n + "의 약수: ";
		for (int i = 1; i <= n; i++) {
			if (n % i != 0) { // 약수가 아닐 경우
				continue;
			}
			// 약수일 경우
			result += i + ", ";
		}
		System.out.println(result);
	}

	private static void findDivisor(int n1, int n2) {
		String result = n1 + "과 " + n2 + "의 공약수: ";
		int minNum = Math.min(n1, n2);
		int maxNum = Math.max(n1, n2);
		for (int i = 1; i <= minNum; i++) {
			if (minNum % i != 0) { // 약수가 아닐 경우
				continue;
			}
			
			// 공약수일 경우
			if (maxNum % i == 0) {
				result += i + ", ";				
			}
		}

		System.out.println(result);
	}
}
