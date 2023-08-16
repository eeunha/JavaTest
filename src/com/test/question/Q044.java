package com.test.question;

import java.util.Scanner;

public class Q044 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int sum = 0;
		int n = 0;
		String result = "";

		while (true) {
			System.out.print("숫자: ");
			n = scan.nextInt();

			if (n > 100) // 처음부터 100 이상의 값이 주어진 경우
				break;

			if (n % 2 == 0) { // 짝수인 경우, 더하기
				sum += n;
				result += "+ " + n + " ";
			} else { // 홀수인 경우, 빼기
				sum -= n;
				result += "- " + n + " ";
			}

			if (sum > 100)
				break;
		}

		System.out.println(result + "= " + sum);
		
		scan.close();
	}
}
