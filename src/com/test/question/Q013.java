package com.test.question;

import java.util.Scanner;

public class Q013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("국어: ");
		int kor = scan.nextInt();

		System.out.print("영어: ");
		int eng = scan.nextInt();

		System.out.print("수학: ");
		int math = scan.nextInt();

		String result = test(kor, eng, math);

		System.out.println(result);
		
		scan.close();
	}

	private static String test(int kor, int eng, int math) {
		// 과락 파악
		if (kor < 40 || eng < 40 || math < 40)
			return "불합격입니다.";

		// 평균 점수 파악
		if ((kor + eng + math) / 3 < 60) {
			return "불합격입니다.";
		}
		
		return "합격입니다.";
	}
}
