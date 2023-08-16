package com.test.question;

import java.util.Scanner;

/*
	2023.07.30
	
	Q. 연산식을 입력받아 실제 연산을 하시오.
	
	조건
		- 산술 연산자만 구현하시오.(+,-,*,/,%)
		- 연산식의 공백은 자유롭게 입력 가능합니다.
		- 산술 연산자가 반드시 존재하는지 체크하시오.
		- 피연산자의 갯수가 2개인지 체크하시오.
		
	입력
		입력: 10 + 2
	출력
		10 + 2 = 12
	
	입력
		입력: 10 # 5
	출력
		연산자가 올바르지 않습니다.
		
	입력
		입력: + 20
	출력
		피연산자가 부족합니다.
 	
 	숫자인가?
 	 - 숫자가 연산자 앞뒤로 총 2개 있는가?
 	 
 	연산자인가
 	 - 올바른 연산자인가?
 	 
 	합계를 계산할 변수 생성
 	
	0 이상의 정수가 입력된다고 가정.
*/
public class Q091 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("입력: ");
		String input = scan.nextLine();
		input = input.replace(" ", ""); // 공백 제거
		System.out.println(input);

		double sum = 0;
		int n1 = -1;
		int n2 = -1;
		String operator = "";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char curChar = input.charAt(i);

			// 숫자인가?
			if (curChar - '0' >= 0 && curChar - '0' <= 9) {
				sb.append(curChar - '0');
				System.out.println(sb);
			} else {
				if (sb.length() == 0) { // 처음부터 연산자가 온 경우
					System.out.println("피연산자가 부족합니다.");
					scan.close();
					return;
				} else { // 연산자가 존재하는 경우
					n1 = Integer.parseInt(sb.toString());
					sb.setLength(0); // 초기화
					operator = curChar + "";
				}
			}
		}

		if (sb.length() == 0) { // 두번째 피연산자가 없는 경우
			System.out.println("피연산자가 부족합니다.");
			scan.close();
			return;
		}

		n2 = Integer.parseInt(sb.toString());

		if (operator.equals("")) { // 연산자가 없는 경우
			System.out.println("연산자가 존재하지 않습니다.");
			scan.close();
			return;
		}

		sum = calculateInput(n1, n2, operator);
		if (sum == -1) {
			System.out.println("연산자가 올바르지 않습니다.");
			scan.close();
			return;
		}

		System.out.printf("%d %s %d = %f\n", n1, operator, n2, sum);
		scan.close();
	}

	private static double calculateInput(int n1, int n2, String operator) {
		double sum = 0;

		if (operator.equals("+")) {
			sum = n1 + n2;
		} else if (operator.equals("-")) {
			sum = n1 - n2;
		} else if (operator.equals("*")) {
			sum = n1 * n2;
		} else if (operator.equals("/")) {
			sum = (double) n1 / n2;
		} else if (operator.equals("%")) {
			sum = n1 % n2;
		} else {
			sum = -1;
		}

		return sum;
	}
}
