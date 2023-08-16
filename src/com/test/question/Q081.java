package com.test.question;

import java.util.Scanner;

/*
	2023.07.28
	
	Q. 이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
	
	입력
		이메일: hong@gmail.com
		
	출력
		아이디: hong
		도메인: gmail.com

*/
public class Q081 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String email = "";

		System.out.print("이메일: ");
		email = scan.nextLine();
		String[] words = email.split("@");
		
		System.out.println("아이디: " + words[0]);
		System.out.println("도메인: " + words[1]);

		scan.close();
	}
}
