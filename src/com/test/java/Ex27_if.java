package com.test.java;

import java.util.Scanner;

public class Ex27_if {

	public static void main(String[] args) {

		// Ex27_if.java

		/*
		 * 제어문 - 수많은 명령어들의 흐름(실행 순서)을 통제하는 수단 
		 * - 조건 제어, 반복 제어, 분기 제어
		 * 
		 * 1. 조건문 
		 * - 개발자가 조건을 제시한 후 결과에 따라 흐름을 제어 
		 * a. if 
		 * b. switch
		 * 
		 * 2. 반복문 
		 * - 특정 코드를 개발자가 원하는 횟수만큼 반복 제어 
		 * a. for 
		 * b. while 
		 * c. do while 
		 * d. for(for each, 향상된 for문(Enhanced for statement))
		 * 
		 * 3. 분기문 
		 * - 개발자가 코드의 흐름을 원하는 곳으로 이동 
		 * a. break 
		 * b. continue 
		 * c. goto(JDK 1.5 폐기) > 가독성 저해
		 * 
		 */

		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		m6();

	}// main

	private static void m6() {

		/*
		 * 
		 * C언어 > boolean 자료형(X) > if문? > 정수 사용(1,0)
		 * 
		 * 자바 > C계열 언어
		 * 
		 * 조건식 
		 * - 조건식은 반드시 boolean을 가진다.(자바)
		 * 
		 * - 정수: 0(false), 1(true), 0이 아닌 모든 정수(true) 
		 * - 실수: 0.0(false), 0이 아닌 모든 실수(true) 
		 * - 문자: \0(null 문자)(false), 그 이외의 모든 문자(true) 
		 * - 문자열: ""(빈 문자열)(false), 그 이외의 모든 문자열(true)
		 * 
		 * int num = 100;
		 * 
		 * if (num) {
		 * 
		 * }
		 */

	}

	private static void m5() {

		// 심리 테스트 > 개발자 성향?

		Scanner scan = new Scanner(System.in);

		int sum = 0; // 누적 변수

		System.out.println("A. 어떤 개발툴을 선호합니까?");
		System.out.println("1. 메모장"); // +3
		System.out.println("2. 이클립스"); // +5
		System.out.println("3. 인텔리제이"); // +7
		System.out.print("선택: ");

		int input = scan.nextInt();

		if (input == 1) {
			sum = sum + 3;
		} else if (input == 2) {
			sum = sum + 5;
		} else if (input == 3) {
			sum = sum + 7;
		}

		System.out.println("B. 어떤 프로그램밍 언어를 선호합니까?");
		System.out.println("1. Java");
		System.out.println("2. C#");
		System.out.println("3. Python");
		System.out.print("선택: ");

		input = scan.nextInt();

		if (input == 1) {
			sum = sum + 3;
		} else if (input == 2) {
			sum = sum + 5;
		} else if (input == 3) {
			sum = sum + 7;
		}

		System.out.println("완료되었습니다.");
		System.out.println("[결과]");

		if (sum > 10) {
			System.out.println("당신은 진취적인 개발자입니다.");
		} else if (sum > 5) {
			System.out.println("당신은 평범한 개발자입니다.");
		} else {
			System.out.println("당신은 개발자로서 적합하지 않습니다.");
		}
	}

	private static void m4() {

		Scanner scan = new Scanner(System.in);

		// 쇼핑몰 > 의류 > 색상 선택(빨강, 파랑, 노랑)
		System.out.println("색상 입력: ");

		String color = scan.nextLine();

		if (color.equals("빨강") || color.equals("파랑")) {
			System.out.println("16000원");

		} else if (color.equals("노랑")) {
			System.out.println("20000원");

		} else {
			System.out.println("재고 없음");
		}

//		if (보유한 색상인지?) {}

		if (color.equals("빨강") || color.equals("파랑") || color.equals("노랑")) {
			System.out.println("16000원");

		} else if (color.equals("노랑")) {
			System.out.println("20000원");

		} else {
			System.out.println("색상 없음");
		}

	}

	private static void m3() {

		Scanner scan = new Scanner(System.in);

		// 기상 > 출근
		System.out.print("기상 시간(시): ");

		int hour = scan.nextInt();

		if (hour < 6) {
			System.out.println("지하철을 타고 출근합니다.");
		} else if (hour >= 6 && hour < 7) {
			System.out.println("버스를 타고 출근합니다.");
		} else if (hour >= 7 && hour < 8) {
			System.out.println("택시를 타고 출근합니다.");
		} else {
			System.out.println("병가를 낸다.");
		}

		if (hour < 6) {
			System.out.println("지하철을 타고 출근합니다.");
		} else if (hour < 7) {
			System.out.println("버스를 타고 출근합니다.");
		} else if (hour < 8) {
			System.out.println("택시를 타고 출근합니다.");
		} else {
			System.out.println("병가를 낸다.");
		}

	}

	private static void m2() {

		Scanner scan = new Scanner(System.in);

		System.out.print("나이: ");

		int age = scan.nextInt();

		String result = "";

		result = (age >= 18) ? "성인" : "미성년자";
		System.out.println(result);

		if (age >= 18) {
			result = "성인";
		} else {
			result = "미성년자";
		}
		System.out.println(result);
	}

	private static void m1() {

		/*
		 * if문 
		 * - 개발자가 조건(boolean)을 제시 > 결과에 따라 흐름을 제어 
		 * - 조건식 > boolean값을 가지는 표현식
		 * 
		 * if (조건식) { 문장; }
		 * 
		 * 
		 * if (조건식) { 문장; //참 블럭 } else { 문장; //거짓 블럭 }
		 * 
		 * 
		 * if (조건식) { 문장; } else if (조건문) { 문장; } else if (조건문) { 문장; }
		 * 
		 * 
		 * if (조건식) { 문장; } else if (조건문) { 문장; } else if (조건문) { 문장; } else { 문장; }
		 * 
		 * 
		 * if (조건식) { 문장; } [else if (조건문) { 문장; }] x N [else { 문장; }]
		 */

//		if(true) {
//			System.out.println("참");
//		}
//		
//		if(false) {
//			System.out.println("거짓"); //Dead code
//		}

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자: ");

		int num = scan.nextInt();

//		if (num > 0) {
//			System.out.printf("입력한 %d는(은) 양수입니다.\n", num);
//		}

//		if (num > 0) {
//			System.out.printf("입력한 %d는(은) 양수입니다.\n", num);
//		} else { 
//			System.out.printf("입력한 %d는(은) 양수가 아닙니다.\n", num);
//		}

		if (num > 0) {
			System.out.printf("입력한 %d는(은) 양수입니다.\n", num);
		} else if (num < 0) {
			System.out.printf("입력한 %d는(은) 음수입니다.\n", num);
		} else if (num == 0) {
			System.out.println("입력한 숫자는 0입니다.");
		}

		if (num > 0) {
			System.out.printf("입력한 %d는(은) 양수입니다.\n", num);
		} else if (num < 0) {
			System.out.printf("입력한 %d는(은) 음수입니다.\n", num);
		} else {
			System.out.println("입력한 숫자는 0입니다.");
		}

	}

}
