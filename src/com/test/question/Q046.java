package com.test.question;

import java.util.Scanner;

public class Q046 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = 0;	//입력 받을 숫자
		String result = "";	// 결과 문자열

		for (int i = 0; i < 10; i++) {
			System.out.print("숫자: ");
			n = scan.nextInt();
			
			if (n == 1) {
				result += "일";
			} else if (n == 2) {
				result += "이";
			} else if (n == 3) {
				result += "삼";
			} else if (n == 4) {
				result += "사";
			} else if (n == 5) {
				result += "오";
			} else if (n == 6) {
				result += "육";
			} else if (n == 7) {
				result += "칠";
			} else if (n == 8) {
				result += "팔";
			} else if (n == 9) {
				result += "구";
			} else { // 예외 처리
				break;
			}
		}
		System.out.println(result);
		
		scan.close();
	}
}
