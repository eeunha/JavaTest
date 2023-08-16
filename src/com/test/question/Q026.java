package com.test.question;

import java.util.Scanner;

public class Q026 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String grade = "";

		System.out.print("점수: ");
		int score = scan.nextInt();

		if (score < 0 || score > 100) {	// 예외. 올바르지 않은 수가 입력된 경우
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
			scan.close();
			return;
		}

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("입력한 " + score + "점은 성적 " + grade + "입니다.");

		scan.close();
	}
}
