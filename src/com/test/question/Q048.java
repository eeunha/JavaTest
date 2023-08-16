package com.test.question;

import java.util.Scanner;

public class Q048 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int evenSum = 0, oddSum = 0;

		System.out.print("숫자 입력: ");
		num = scan.nextInt();

		while (num > 0) {
			int curNum = num % 10;

			if (curNum % 2 == 0) {	// 짝수인 경우
				evenSum += curNum;
			} else {	// 홀수인 경우
				oddSum += curNum;
			}

			num /= 10; // 10씩 나눠서 일의 자리수부터 상위 수로 올라가면서 자른다.
		}
		
		System.out.println("짝수의 합: " + evenSum);
		System.out.println("홀수의 합: " + oddSum);
		
		scan.close();
	}
}
