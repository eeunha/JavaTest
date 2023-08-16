package com.test.question;

import java.util.Scanner;

/*
	2023.07.30
	
	Q. 입력받은 금액을 한글로 출력하시오.
	
	조건
		- 입력 범위(원): 0 ~ 99,999,999
	
	입력
		금액(원): 120
	출력
		일금 일백이십원
		
	99,999,999
	일금 구천 구백 구십 구 만 구천 구백 구십 구  원
         7   6   5   4    3   2   1   0	
	
		구 십구 백구 천구 만 구 십구 백구 천구

*/
public class Q089 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("금액(원): ");
		String money = scan.nextLine();
		StringBuilder sb = new StringBuilder();

		String[] units = { "", "십", "백", "천", "만", "십", "백", "천" };
		String[] numToKor = { "", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };

		if (money.equals(0)) { // 예외
			System.out.println("일금 영원");
			scan.close();
			return;
		}

		for (int i = money.length() - 1; i >= 0; i--) {
			int curNum = Integer.parseInt(money.substring(i, i + 1));
			sb.append(units[money.length() - 1 - i]); // 단위
			sb.append(numToKor[curNum]); // 수
		}

		System.out.println("일금 " + sb.reverse() + "원");
		scan.close();
	}
}
