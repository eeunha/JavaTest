package com.test.question;

import java.util.Scanner;

public class Q045 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("최대 숫자: ");
		int maxN = scan.nextInt();
		String curN = maxN + "";

		if (curN.length() > 3) { // 예외  maxN >= 1000
			scan.close();
			return;
		}

		for (int i = 1; i <= maxN; i++) {
			curN = i + "";
			// 각 자리 수 비교
			char[] curNArr = curN.toCharArray(); // i = 50 -> {'5', '0'}
			int count = 0;

			for (int j = 0; j < curNArr.length; j++) {
				if (curNArr[j] == '3' || curNArr[j] == '6' || curNArr[j] == '9') {
					count++;
				}
			}

			if (count == 0) { // 숫자
				System.out.print(i + " ");
			} else {
				for (int j = 0; j < count; j++) {
					System.out.print("짝");
				}
				System.out.print(" ");
			}
		}

		scan.close();
	}

//	private static void game(int n) {
//		if (n >= 1000)
//			return;
//
//		for (int i = 1; i <= n; i++) {
//			if (i < 10) { // 1의 자리
//				if (!(i == 3 || i == 6 || i == 9)) {
//					System.out.println(i + " ");
//				} else {
//					System.out.print("짝 ");
//				}
//			} else if (i < 100) { // 10의 자리
//				if (!(i / 10 == 3 || i / 10 == 6 || i / 10 == 9)) {
//					if (!(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)) {
//						System.out.println(i + " ");
//					} else {
//						System.out.print("짝 ");
//					}
//				} else {
//					System.out.print("짝 ");
//				}
//			} else { // 100의 자리
//
//			}
//		}
//	}
}
