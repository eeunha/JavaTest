package com.test.java;

import java.util.Scanner;

public class Ex30_for {
	public static void main(String[] args) {
		// EX30_for.java

//		m1();
//		m2();
//		m3();
//		m4();

		m5();

		// 잘 나오는 유형이니 알아두기
//		q39();
//		q41();
//		q42();
//		q43();

		// 다중 반복문 > 단일 반복문
	}

	private static void m5() {

		// 별찍기(5x5)

		int n = 1;

		for (int i = 0; i < 5; i++) { // 행 만들기
			for (int j = 0; j < 5; j++) { // 열 만들기
				System.out.print("*");
//				System.out.printf("%3d", n);
//				n++;
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < 5; i++) { // 행 만들기
			for (int j = i; j < 5; j++) { // 열 만들기
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) { // 행 만들기
			for (int j = 0; j <= i; j++) { // 열 만들기
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void q43() {

		// 최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
		// 숫자 입력: 273645281

		Scanner scan = new Scanner(System.in);

//		System.out.print("숫자 입력:");
//		int num = scan.nextInt();

		int sum = 0;
		int oddSum = 0, evenSum = 0;
		int num = 273645281;

		for (;;) {
//			System.out.println(num % 10);

			if (num % 10 % 2 == 0) { // 짝수
				evenSum += num % 10;
			} else { // 홀수
				oddSum += num % 10;
			}

			sum += num % 10;
			num /= 10;

			if (num == 0)
				break;
		}

		System.out.println(oddSum);
		System.out.println(evenSum);
		System.out.println(sum);
	}

	private static void q42() {
		int year = 2023;
		int month = 7;
		int date = 25;

		int sum = 0; // 누적 변수
		String day = ""; // 요일

		// 1. 1년 1월 1일 ~ 2022년 12월 31일
		for (int i = 1; i < year; i++) {
			sum += 365;
			if (isLeapYear(i)) {
				sum++;
			}
		}

		// 2. 2023년 1월 1일 ~ 2023년 6월 30일

		for (int i = 1; i < month; i++) {
			sum += getMaxDate(year, i);
		}

		// 3. 2023년 7월 1일 ~ 2023년 7월 25일
		sum += date;

		// 4. 검증 및 요일 구하기

		day = getDay(sum);

		// 원하는 날짜의 요일?
		// > 기준일 > 1970 1월 1일
		// > 1년 1월 1일 > 월
		// 현재까지의 일수 % 7 > 1=월요일 ... 7 = 일요일
		System.out.printf("2023년 7월 25일은 %,d일째 되는 날이고 %s요일입니다.", sum, day);
	}

	private static String getDay(int sum) {
		// TODO Auto-generated method stub
		if (sum % 7 == 1) {
			return "월";
		} else if (sum % 7 == 2) {
			return "화";
		} else if (sum % 7 == 3) {
			return "수";
		} else if (sum % 7 == 4) {
			return "목";
		} else if (sum % 7 == 5) {
			return "금";
		} else if (sum % 7 == 6) {
			return "토";
		} else if (sum % 7 == 7) {
			return "일";
		}
		return null;
	}

	private static int getMaxDate(int year, int month) {
		// TODO Auto-generated method stub

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeapYear(year) ? 29 : 28;
		}
		return 0;
	}

	// 메소드 이름 패턴
	// 1. setXXX
	// 2. getXXX
	// 3. isXXX - boolean 값 가져올 때
	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else { // 3. 년도 % 400 != 0 > 평년
					return false;
				}
			} else { // 2. 년도 % 100 != 0 > 윤년
				return true;
			}
		} else { // 1. 년도 % 4 != 0 > 평년
			return false;
		}
	}

	private static void q41() {
		int sum = 0;

		for (int i = 1;; i++) { // 무한루프
			sum += i;

			System.out.printf("%d + ", i);

			if (sum > 1000) {
				break;
			}
		}
		System.out.println("= " + sum);
	}

	private static void q39() {
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		Scanner scan = new Scanner(System.in);

		int begin = 0, end = 0;
		int sum = 0; // 누적 변수

		System.out.print("시작 숫자: ");
		begin = scan.nextInt();

		System.out.print("종료 숫자: ");
		end = scan.nextInt();

		for (int i = begin; i <= end; i++) {
			sum += i;
//			System.out.printf("%d + ", i);

			if (i != end) {
				System.out.printf("%d + ", i);
			} else {
				System.out.print(i);
			}
		}

		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + = 55
//		System.out.println("\b\b= " + sum);

		System.out.println(" = " + sum);
	}

	private static void m4() {
		// 루프 > 분기문 개입(break, continue)
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
//				if (i == 5) { // 90번
//				if (j == 5) { // 50번
//				if (i == 5 && j == 5) {	// 95번
				if (i == 5 || j == 5) { // 45번

					break; // 자신이 포함된 제어문을 탈출한다. (j 루프 탈출)
				}
				System.out.printf("i: %d, j:%d\n", i, j);
			}
		}

	}

	private static void m3() {
		// 쌍용 교육 센터
		// - 강의실(1강의실 ~ 6강의실)
		// - 학생들(30명)

		for (int i = 1; i <= 6; i++) { // 강의실
			for (int j = 1; j <= 30; j++) { // 학생
				System.out.printf("%d강의실 %d번 학생\n", i, j);
			}
		}
	}

	private static void m2() {

		// 구구단(2~9단)

		// 2단
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("2 X %d = %2d\n", i, 2 * i);
//		}

		for (int i = 2; i < 10; i++) {
			System.out.println("===========");
			System.out.printf("    %d단\n", i);
			System.out.println("===========");

			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}
	}

	// K&R > Eclipse, IntelliJ > 기본 설정
	public static void test() {

	}

	// Allman
	public static void test2() {

	}

	private static void m1() {
		// 모든 제어문은 중첩이 가능하다.
		// 들여쓰기 연습하자.

		// Ctrl + Shift + F(format) > 자동정렬

		// 2중 for문
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
////				System.out.println("실행문");
//			}
//		}

		// 3중 for문
		for (int i = 0; i < 10; i++) { // 대회전(시침)
			for (int j = 0; j < 10; j++) { // 중회전(분침)
				for (int k = 0; k < 10; k++) { // 소회전(초침)
//					System.out.println("실행문");
					System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
				}
			}
		}
	}
}
