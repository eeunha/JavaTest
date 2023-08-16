package com.test.java;

import java.util.Scanner;

public class Ex12_Scanner {
	public static void main(String[] args) {
		// Ex12_Scanner.java

		Scanner scan = new Scanner(System.in); // Wrapper Class

//		System.out.print("문자열: ");
//		String line = scan.nextLine();	//reader.readLine()
//		System.out.println(line);
//
//		System.out.print("숫자: ");
//		int num = scan.nextInt();	//형변환이 포함되어 있음.
//		System.out.println(num);

		// 숫자 2개 입력 > 연산
		System.out.print("첫 번째 숫자: ");

		// String input = reader.readLine();
		// int num = Integer.parseInt(input);

		double num1 = scan.nextDouble();

		System.out.print("두 번째 숫자: ");
		double num2 = scan.nextDouble();

		System.out.printf("%.1f + %.1f = %.1f", num1, num2, num1 + num2);

	}
}
