package com.test.question;

import java.util.Scanner;

public class Q032 {
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

		int time = (outHour * 60 + outMin) - (inHour * 60 + inMin);
		int cost = 0;
		System.out.println(time);

		if (time > 30) {	//30분 이상일 때 추가금 계산
			cost += (time - 30) / 10 * 2000;
		}

		System.out.printf("주차요금은 %,d원입니다.", cost);

		scan.close();
	}
}
