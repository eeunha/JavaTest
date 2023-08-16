package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar now = Calendar.getInstance();

		System.out.print("태어난 년도: ");
		int birthYear = scan.nextInt();

		System.out.printf("나이: %d세", now.get(Calendar.YEAR) + 1 - birthYear);	//이번 년도 + 1 - 태어난 년도 로 나이를 계산.

		scan.close();
	}
}
