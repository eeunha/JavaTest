package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

/*
 * i: int hour, int minute
 * O: String 시간들
 * c: 짜장면은 전화건 후 10분 뒤 도착
 * 		치킨은 18분 뒤 도착
 * 		피자는 25분 뒤 도착
 * 		음식 받는 시간은 오후 11시 이전만 가능
 * e: 
 * 
 * 음식을 받기 원하는 시간에서
 * 짜장면은 -10분
 * 치킨은 -18분
 * 피자는 -25분 한 뒤 
 * 출력시키면 된다.
 * 
 * */
public class Q024 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시: ");
		int hour = scan.nextInt();

		System.out.print("분: ");
		int min = scan.nextInt();

		Calendar wantedTime = Calendar.getInstance();
		wantedTime.set(Calendar.HOUR_OF_DAY, hour);
		wantedTime.set(Calendar.MINUTE, min);

		wantedTime.add(Calendar.MINUTE, -10);
		System.out.printf("짜장면: %tH시 %tM분\n", wantedTime, wantedTime);

		wantedTime.add(Calendar.MINUTE, -8);
		System.out.printf("치킨: %tH시 %tM분\n", wantedTime, wantedTime);

		wantedTime.add(Calendar.MINUTE, -7);
		System.out.printf("피자: %tH시 %tM분\n", wantedTime, wantedTime);

		scan.close();
	}
}
