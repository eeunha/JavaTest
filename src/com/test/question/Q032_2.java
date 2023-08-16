package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q032_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("[들어온 시간]");
		System.out.print("시: ");
		int inHour = scan.nextInt();

		System.out.print("분: ");
		int inMin = scan.nextInt();

		System.out.println();

		System.out.println("[나간 시간]");
		System.out.print("시: ");
		int outHour = scan.nextInt();

		System.out.print("분: ");
		int outMin = scan.nextInt();

		Calendar inTime = Calendar.getInstance();
		inTime.set(Calendar.HOUR_OF_DAY, inHour);
		inTime.set(Calendar.MINUTE, inMin);

		Calendar outTime = Calendar.getInstance();
		outTime.set(Calendar.HOUR_OF_DAY, outHour);
		outTime.set(Calendar.MINUTE, outMin);

		long diff =  outTime.getTimeInMillis() - inTime.getTimeInMillis();

		long fee = (((diff / 1000 / 60) - 30) / 10) * 2000;

		System.out.printf("주차요금은 %,d원입니다.", fee);

		scan.close();
	}
}
