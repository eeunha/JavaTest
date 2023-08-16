package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("년: ");
		int year = scan.nextInt();

		System.out.print("월: ");
		int month = scan.nextInt();

		System.out.print("일: ");
		int date = scan.nextInt();

		Calendar inputDay = Calendar.getInstance();
		inputDay.set(Calendar.YEAR, year);
		inputDay.set(Calendar.MONTH, month - 1);
		inputDay.set(Calendar.DATE, date);

		int dateNum = inputDay.get(Calendar.DAY_OF_WEEK);

		if (dateNum == 1 || dateNum == 7) { // 주말인 경우
			System.out.println("입력하신 날짜는 '휴일(토/일)입니다.");
			System.out.println("결과가 없습니다.");
		} else { // 평일인 경우
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			inputDay.add(Calendar.DATE, 6 - dateNum + 1);
			System.out.printf("이동한 날짜는 '%tF' 입니다.", inputDay);
		}

		scan.close();
	}
}
