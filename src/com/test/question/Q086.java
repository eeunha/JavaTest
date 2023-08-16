package com.test.question;

import java.util.Scanner;

/*
	23.07.30
	
	Q. 숫자를 입력받아 3자리마다 , 를 붙이시오.
	
	조건
		-%,d 사용 금지
	
	입력
		숫자: 1234
	출력
		결과: 1,234


*/
public class Q086 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		System.out.print("숫자: ");
		String n = scan.nextLine();

		if (n.length() <= 3) { // 예외. 3자리까지 그대로 출력
			System.out.println("결과: " + n);
			scan.close();
			return;
		}

		for (int i = 0; i < n.length(); i++) { // 맨 뒤 문자부터 맨 앞으로
			sb.append(n.charAt(n.length() - 1 - i));
			if ((i + 1) % 3 == 0) { // 3자리마다 , 붙이기
				sb.append(",");
			}
		}

		System.out.println("결과: " + sb.reverse());	// 완성된 문자를 뒤집기
		scan.close();
	}
}
