package com.test.question;

import java.util.Scanner;

/*
	2023.07.30
	
	Q. 입력받은 문장에서 숫자를 찾아 그 합을 구하시오.
	
	조건
		- 모든 숫자는 한자리 숫자로 처리한다.
	
	입력
		입력: 국어 접수는 95점입니다.
	출력
		문장에 존재하는 모든 숫자의 합은 14입니다.
		
		
	

*/
public class Q090 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("입력: ");
		String input = scan.nextLine();

		int sum = 0;

		for (int i = 0; i < input.length(); i++) {
			// 1.
//			char curChar = input.charAt(i);
//
//			if (curChar >= 48 && curChar <= 57) {
//				sum += curChar - 48;
//			}

			// 2.
			int curChar = input.charAt(i) - '0'; // char로 한 문자만 받아서 -'0' 하면 입력한 숫자를 int로 받을 수 있다.

			if (curChar >= 0 && curChar <= 9) {	// 숫자인 경우
				sum += curChar;
			}
		}

		System.out.println("문장에 존재하는 모든 숫자의 합은 " + sum + "입니다.");
		scan.close();
	}
}
