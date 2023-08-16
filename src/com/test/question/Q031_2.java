package com.test.question;

import java.util.Scanner;

public class Q031_2 {
	public static void main(String[] args) {
		m2();
	}

	public static void m2() {
		int count = 0;

		Scanner scan = new Scanner(System.in);

		count += check(scan);
		count += check(scan);
		count += check(scan);
		count += check(scan);
		count += check(scan);

		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", count / 10, count % 10);
		System.out.printf("홀수가 짝수보다 %d개 더 많습니다.\n", count / 10 - count % 10);

		scan.close();
	}

	public static int check(Scanner scan) {
		System.out.print("숫자 입력: ");
		int n = scan.nextInt();

		if (n % 2 == 0) {
			return 10;
		} else {
			return 1;
		}
	}
}
