package com.test.question;

import java.util.Scanner;

public class Q043 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.\n");
		int n = 0;

		int answer = (int) (Math.random() * 10) + 1;	// 1부터 10까지의 난수 생성

		for (int i = 0; i < 10; i++) {
			System.out.print("숫자: ");
			n = scan.nextInt();

			if (n == answer) {
				System.out.println("맞았습니다.\n");
				System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", answer);
				System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n\n", i + 1);
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				return;
			} else {
				System.out.println("틀렸습니다.\n");
			}
		}

		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", answer);
		System.out.println("모든 기회를 실패했습니다.\n");
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
	}
}
