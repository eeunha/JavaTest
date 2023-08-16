package com.test.question;

import java.util.Scanner;

public class Q036 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("시작 숫자: ");
		int startNum = scan.nextInt();

		System.out.print("종료 숫자: ");
		int endNum = scan.nextInt();

		System.out.print("증감치: ");
		int add = scan.nextInt();

		for (int i = startNum; i <= endNum; i += add) {	//시작수부터 종료수까지 증감치만큼 더해가며 반복
			System.out.println(i);
		}
		
		scan.close();
	}
}
