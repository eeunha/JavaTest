package com.test.question;

import java.util.Scanner;

/*
  	2023.07.28
 
	Q. 문장을 입력받아 역순으로 출력하시오.
	
	입력
		문장 입력: 가나다
		
	출력
		역순 결과: "다나가"

*/
public class Q080 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("문장 입력: ");
		StringBuilder sb = new StringBuilder(scan.nextLine());

		System.out.print("역순 결과: \"" + sb.reverse() + "\"");
		
		scan.close();
	}
}
