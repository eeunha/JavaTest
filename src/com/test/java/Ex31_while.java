package com.test.java;

import java.util.Scanner;

public class Ex31_while {
	public static void main(String[] args) {
		/*
		 * 반복문
		 * 
		 * 1.for문
		 * 
		 * 2. while문 > for문으로 푼 문제를 whlie문으로 풀어보기 3. do-while문 > 거의 안씀
		 * 
		 * 4. for문
		 * 
		 * if (조건식) { 문장; }
		 * 
		 * while (조건식) { 문장; }
		 * 
		 * do > 머리. 구분지으려고 { 문장; } while (조건식); > 문장 종결자 필요
		 * 
		 */

//		m1();
//		m2();
//		m3();
		m4();
	}

	private static void m4() {
		// 콘솔 > UI
		// 자판기
		// 1. 메뉴 출력
		// 2. 선택
		// 3. 결과
		// 1~3 반복

		Scanner scan = new Scanner(System.in);

		int sel = 0; // 사용자 선택 메뉴 번호
		boolean loop = true; // 반복 조건 > 루프 변수

		while (loop) { // > 최대한 간결히 적기 위해 메소드로 코드 빼기
			
			menu();

			sel = scan.nextInt(); // 엔터 남김
			scan.skip("\r\n"); // 남긴 엔터 지우기

			if (sel == 1) {
				m1(scan);
//				System.out.println("콜라~~");
//
//				pause(scan); // 아래 세줄을 메소드로 뺌
//				// 프로그램을 잠시 중단(콘솔버전) > 블럭
//				System.out.println("계속하려면 엔터를 입력하세요.");
//				scan.nextLine();
				// > 중복되니까 메소드로 빼서 사용하기 - 이클립스 기능 이용
				// 리팩토링 : 결과의 변경 없이 코드의 구조를 재조장함
				// 메소드 만들 코드 드래그해서 Alt + Shift + M

			} else if (sel == 2) {
				m2(scan);
			} else if (sel == 3) {
				m3(scan);
			} else {
				loop = false;
			}
		}

	}

	private static void m3(Scanner scan) {
		System.out.println("커피");
		pause(scan);
	}

	private static void m2(Scanner scan) {
		System.out.println("사이다");
		pause(scan);
	}

	private static void m1(Scanner scan) {
		System.out.println("콜라~~");

		pause(scan); // 아래 세줄을 메소드로 뺌
	}

	private static void menu() {
		System.out.println("================");
		System.out.println("    자판기");
		System.out.println("================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 커피");
		System.out.println("----------------");
		System.out.print("선택(번호): ");
	}

	private static void pause(Scanner scan) {
		// 프로그램을 잠시 중단(콘솔버전) > 블럭
		System.out.println("계속하려면 엔터를 입력하세요.");
		scan.nextLine();
	}

	private static void m3() {
		// 1~10까지 누적하시오.

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		int num = 1;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
	}

	private static void m2() {
		int num = 11;

		while (num <= 10) {
			System.out.println(num);
			num++;
		}
		System.out.println();

		num = 11;
		do {
			System.out.println(num);
			num++;
		} while (num <= 10);
	}

	private static void m1() {
		// 요구사항] 1~10까지 출력하시오.

		for (int i = 1; i <= 10; i++) { // 초기식; 조건식; 증감식
			System.out.println(i);
		}

		int num = 1; // 초기식

		while (num <= 10) { // 조건식
			System.out.println(num);
			num++; // 증감식
		}

	}
}
