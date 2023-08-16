package com.test.question;

import java.util.Scanner;

public class Q033 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("년도 입력: ");
		int year = scan.nextInt();

		String yearName = findLeapYear(year);

		System.out.printf("%d년은 '%s'입니다.", year, yearName);
		
		scan.close();
	}

	public static String findLeapYear(int year) {
		String name = "";

		// 1. 년도 % 4 == 0 > 윤년 가능
		if (year % 4 == 0) {

			// 2. 년도 % 100 == 0 >
			if (year % 100 == 0) {

				// 3. 년도 % 400 == 0 >
				if (year % 400 == 0) {
					name = "윤년";
				} else { // 3. 년도 % 400 != 0 > 평년
					name = "평년";
				}
			} else { // 2. 년도 % 100 != 0 > 윤년
				name = "윤년";
			}
		} else { // 1. 년도 % 4 != 0 > 평년
			name = "평년";
		}

		return name;
	}
}
