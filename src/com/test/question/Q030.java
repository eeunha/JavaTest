package com.test.question;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("문자: ");
		String input = scan.nextLine();

		int curCode = input.charAt(0);

		if (curCode >= 65 && curCode <= 90) { // 대문자인 경우. 아스키코드를 사용하였다.
			System.out.printf("'%s'의 소문자는 '%s'입니다.", input, input.toLowerCase());
		} else if (curCode >= 97 && curCode <= 122) { // 소문자인 경우
			System.out.printf("'%s'의 대문자는 '%s'입니다.", input, input.toUpperCase());
		} else { // 예외
			System.out.println("영문자만 입력하시오.");
			scan.close();
			return;
		}
		scan.close();
	}
}
