package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("남자 이름: ");
		String maleName = scan.nextLine();

		System.out.print("여자 이름: ");
		String femaleName = scan.nextLine();

		System.out.print("만난날(년): ");
		int year = scan.nextInt();

		System.out.print("만난날(월): ");
		int month = scan.nextInt();

		System.out.print("만난날(일): ");
		int day = scan.nextInt();

		Calendar anniversary = Calendar.getInstance();
		anniversary.set(year, month - 1, day);

		System.out.printf("'%s'과(와) '%s'의 기념일\n", maleName, femaleName);
		
		anniversary.add(Calendar.DATE, 100);	// 지정된 날짜에 100일을 더한다.
		System.out.printf("100일: %tF\n", anniversary);
		
		anniversary.add(Calendar.DATE, 100);	//지정된 날짜(초기 + 100일)에 100일을 더한다.
		System.out.printf("200일: %tF\n", anniversary);

		anniversary.add(Calendar.DATE, 100);	//지정된 날짜(초기 + 200일)에 100일을 더한다.
		System.out.printf("300일: %tF\n", anniversary);

		anniversary.add(Calendar.DATE, 200);	//지정된 날짜(초기 + 300일)에 200일을 더한다.
		System.out.printf("500일: %tF\n", anniversary);

		anniversary.add(Calendar.DATE, 500);	//지정된 날짜(초기 + 500일)에 500일을 더한다.
		System.out.printf("1000일: %tF\n", anniversary);

		scan.close();
	}
}
