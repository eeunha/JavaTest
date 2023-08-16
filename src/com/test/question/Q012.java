package com.test.question;

import java.util.Scanner;

public class Q012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자: ");
		int n = scan.nextInt();

		String result = "";

		result = getNumber(n);
		System.out.printf("입력하신 숫자 '%d'는(은)'%s'입니다.\n", n, result);
		
		scan.close();
	}

	private static String getNumber(int n) {
		if (n % 2 == 0) { // 짝수인 경우,
			return "짝수";
		} else { // 홀수인 경우,
			return "홀수";
		}
	}
}
