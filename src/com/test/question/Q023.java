package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("아빠 생일(년): ");
		int fatherYear = scan.nextInt();

		System.out.print("아빠 생일(월): ");
		int fatherMonth = scan.nextInt();

		System.out.print("아빠 생일(일): ");
		int fatherDay = scan.nextInt();

		System.out.print("딸 생일(년): ");
		int daughterYear = scan.nextInt();

		System.out.print("딸 생일(월): ");
		int daughterMonth = scan.nextInt();

		System.out.print("딸 생일(일): ");
		int daughterDay = scan.nextInt();

		Calendar fatherBirthDay = Calendar.getInstance();
		fatherBirthDay.set(fatherYear, fatherMonth - 1, fatherDay);

		Calendar daughterBirthDay = Calendar.getInstance();
		daughterBirthDay.set(daughterYear, daughterMonth - 1, daughterDay);

		long fatherTick = fatherBirthDay.getTimeInMillis();
		long daughterTick = daughterBirthDay.getTimeInMillis();

		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.", (daughterTick - fatherTick) / 1000 / (24 * 60 * 60));	//아빠와 딸의 시간(ms) 차를 s단위로 변경하고, 일로 만들기 위해 시 분 초의 단위만큼 나눠준다.

		scan.close();
	}
}
