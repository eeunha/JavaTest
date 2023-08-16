package com.test.question;

import java.util.Scanner;

public class Q037 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자: ");
		int num = scan.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) { //1부터 입력한 수까지 반복
			sum += i;
		}

		System.out.printf("1 ~ %d = %d", num, sum);
		
		scan.close();
	}

}
