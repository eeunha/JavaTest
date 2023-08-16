package com.test.question;

import java.util.Scanner;

public class Q035 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("이름: ");
		String name = scan.nextLine();

		System.out.print("횟수: ");
		int count = scan.nextInt();

		for (int i = 0; i < count; i++) {	//count번 반복
			System.out.printf("%s님 안녕하세요~\n", name);
		}
		
		scan.close();
	}
}
