package com.test.question;

import java.util.Scanner;

public class Q038 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("입력 횟수: ");
		int count = scan.nextInt();

		int oddCount = 0;
		int evenCount = 0;
		int oddSum = 0;
		int evenSum = 0;

		for (int i = 0; i < count; i++) {	//입력 횟수 만큼 만복
			System.out.print("숫자: ");
			int num = scan.nextInt();

			if (num % 2 == 0) { // 짝수인 경우
				evenCount++;
				evenSum += num;
			} else { // 홀수인 경우
				oddCount++;
				oddSum += num;
			}
		}
		System.out.printf("짝수 %d개의 합: %d\n", evenCount, evenSum);
		System.out.printf("홀수 %d개의 합: %d\n", oddCount, oddSum);
		
		scan.close();
	}
}
