package com.test.question;

import java.util.Scanner;

public class Q052 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("행: ");
		int num = scan.nextInt();

		// num = 5
		// _ _ _ _ aa > 공백 4개, a 2개
		// _ _ _ abba > 공백 3개, ab ba
		// _ _ abccba > 공백 2개, abc cba
		// _ abcddcba > 공백 1개, abcd dcba
		// abcdeedcba > 공백 0개, abcde edbca

		// a = 97

		// 공백을 4 3 2 1 0 순으로 넣기
//		for (int i = 0; i < num; i++) {
//			for (int j = num - i - 1; j > 0; j--) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}

		// a ab abc abcd abcde 순으로 넣기
//		for (int i = 0; i < num; i++) {
//			for (int j = num - i - 1; j > 0; j--) {
//				System.out.print(" ");
//			}
//
//			for (int j = 0; j <= i; j++) {
//				System.out.print((char) (j + 97));
//			}
//			System.out.println();
//		}

		// a ba cba dcba edcba 순으로 넣기

		for (int i = 0; i < num; i++) {
			for (int j = num - i - 1; j > 0; j--) { // 공백
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) { // 정순 알파벳
				System.out.print((char) (j + 97));
			}

			for (int j = i; j >= 0; j--) { // 역순 알파벳
				System.out.print((char) (j + 97));
			}
			System.out.println();
		}
		scan.close();
	}
}
