package com.test.question;

public class Q053 {
	public static void main(String[] args) {
		// 2중 for문 2번 또는

		for (int i = 1; i < 10; i++) { // 행. x1부터 시작
			for (int j = 2; j < 6; j++) { // 열. 단 수 나타냄
				System.out.printf("%d X %d = %d\t", j, i, j * i);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int j = 6; j < 10; j++) {
				System.out.printf("%d X %d = %d\t", j, i, j * i);
			}
			System.out.println();
		}
		System.out.println();

	}
}
