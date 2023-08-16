package com.test.question;

import java.util.Scanner;

/*
 	23.07.30
 	
	Q. 영단어를 입력받아 분리하시오.
	
	조건
		- 합성어를 입력한다.
		- 합성어는 파스칼 표기법으로 입력한다.
		- 출력은 각 단어를 공백으로 구분한다.
		
	입력
		단어: StudentName
	출력
		결과: Student Name
	
	풀이방법
	1. 예외사항 확인
		파스칼 표기법이므로 맨 처음 문자가 대문자인지 확인한다.
		대문자가 아니라면 그대로 종료한다.
	2. 문자열의 문자를 처음부터 끝까지 하나씩 순회한다.
		현재 문자의 인덱스가 0이 아니면서 대문자라면 " " 공백문자를 넣는다.
		현재 문자를 넣는다.
	3. 그대로 출력한다.
*/
public class Q087 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		System.out.print("단어: ");
		String word = scan.nextLine();

		if (word.charAt(0) < 'A' || word.charAt(0) > 'Z') { // 예외
			System.out.println("잘못된 입력입니다.");
			scan.close();
			return;
		}

		for (int i = 0; i < word.length(); i++) {
			char curChar = word.charAt(i);

			if (curChar >= 'A' && curChar <= 'Z' && i != 0) {
				sb.append(" ");
			}
			sb.append(curChar);
		}

		System.out.println("결과: " + sb);
		scan.close();
	}
}
