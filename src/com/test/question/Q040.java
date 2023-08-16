package com.test.question;

import java.util.Scanner;

public class Q040 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("시작 숫자: ");
		int startNum = scan.nextInt();

		System.out.print("종료 숫자: ");
		int endNum = scan.nextInt();

		int sum = 0;
		String result = ""; //결과 문자열

		for (int count = 1, i = startNum; i <= endNum; i++, count++) {
			if (count == 1) {
				result += i;
				sum += i;
				continue;
			}
			if (count % 2 == 0) {
				result += "-" + i;
				sum -= i;
			} else {
				result += "+" + i;
				sum += i;
			}
		}
		System.out.println(result + "=" + sum);
		
		scan.close();
	}
}
