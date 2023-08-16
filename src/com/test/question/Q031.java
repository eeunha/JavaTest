package com.test.question;

import java.util.Scanner;

public class Q031 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int odd = 0;
		int even = 0;
		int input = 0;

		System.out.print("숫자 입력: ");
		input = scan.nextInt();
		if (input % 2 == 0) { // 짝수인 경우
			odd++;
		} else { // 홀수인 경우
			even++;
		}

		System.out.print("숫자 입력: ");
		input = scan.nextInt();
		if (input % 2 == 0) { // 짝수인 경우
			odd++;
		} else { // 홀수인 경우
			even++;
		}

		System.out.print("숫자 입력: ");
		input = scan.nextInt();
		if (input % 2 == 0) { // 짝수인 경우
			odd++;
		} else { // 홀수인 경우
			even++;
		}

		System.out.print("숫자 입력: ");
		input = scan.nextInt();
		if (input % 2 == 0) { // 짝수인 경우
			even++;
		} else { // 홀수인 경우
			odd++;
		}

		System.out.print("숫자 입력: ");
		input = scan.nextInt();
		if (input % 2 == 0) { // 짝수인 경우
			odd++;
		} else { // 홀수인 경우
			even++;
		}

		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		if (odd > even) {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", odd - even);
		} else if (odd < even) {
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.", even - odd);
		} else {
			System.out.println("홀수와 짝수의 개수가 같습니다.");
		}

		scan.close();
	}

	private static void solve() {
		Scanner scan = new Scanner(System.in);

		int odd = 0;
		int even = 0;
		int input = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("숫자 입력: ");
			input = scan.nextInt();
			if (input % 2 == 0) { // 짝수인 경우
				odd++;
			} else { // 홀수인 경우
				even++;
			}
		}

		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		
		if (odd > even) {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", odd - even);
		} else if (odd < even) {
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.", even - odd);
		} else {
			System.out.println("홀수와 짝수의 개수가 같습니다.");
		}

		scan.close();
	}
}
