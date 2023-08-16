package com.test.java.obj.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_Exception {
	public static void main(String[] args) {

		// Ex59_Exception.java

		// 예외, Exception
		// - 런타임 오류
		// - 컴파일 발견(X) > 실행 중 발견(O)
		// - 개발자가 미리 예측(O) or 예측(X)

		// 예외 처리, Exception Handling
		// 1. 전통적인 방식
		// - 제어문 사용(조건문) -> (각자도생) 더 많이 씀

		// 2. 전용 방식
		// - try catch finally문 사용 -> (중앙집권) 어려워서 잘 안씀

//		m1();
//		m2();
//		m3();
//		m4();

//		try {
//			m5();
//		} catch (Exception e) {
//
//		}

		// => main()에서 throws Exception 절대 쓰면 안된다. 여기서 try-catch로 막아야 한다.
		try {
//			m5();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		m6();

		try {
			int num = 0;
			System.out.println(100 / num);
		} catch (Exception e) {
			System.out.println(111); // 뭐라도 적어놔야 된다. 안적으면 오류난지 모른다.
		}

	}// main

	private static void m6() {
		// code template 변경 try-catch
//		try {
//			
//		} catch (Exception e) {
//			System.out.println("at Ex59_Exception.m6");
//			e.printStackTrace();
//		}
//		

		// 예외 던지기

		// 요구사항] 숫자 입력 > 처리
		// 조건] 반드시 짝수만 입력
		// 홀수 입력 > 에러 처리

		int num = 1;

		if (num % 2 == 0) {
			System.out.println("업무 진행");
		} else {
			System.out.println("예외 처리");
		}

		// try 구현
		try {

			// 강제로 오류 만들기
			// 아래 절을 만나면 바로 catch로 이동.
			// throws 아님 throw임
			if (num % 2 == 1) {
				throw new Exception("홀수 입력"); // 강제로 에러 발생/1
			}
			System.out.println("업무 진행");
		} catch (Exception e) {
			System.out.println("예외 처리");
			System.out.println(e.getMessage()); // 메세지 꺼낼 수 있다.
		}
	}

	private static void m5() throws Exception {

		// 예외 미루기

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Unhandled exception type IOException

//		try {
//			String input = reader.readLine(); // 오류 가능성 있음
//		} catch (Exception e) {
//			
//		}

		String input = reader.readLine();
	}

	private static void m4() {

		try {
			// 0으로 나누기 > java.lang.ArithmeticException
			int num = 10;
			System.out.println(100 / num);

			// 배열 첨자 > java.lang.ArrayIndexOutOfBoundsException
			int[] nums = new int[3];
			nums[5] = 10; // new ArrayIndexOutOfBoundsException()

			// null 참조 > java.lang.NullPointerException
			Scanner scan = null;
			scan.nextLine(); // new NullPointerException()

		} catch (ArithmeticException e) {

			System.out.println("0으로 나누기");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.err.println("배열 첨자");

		} catch (NullPointerException e) {

			System.out.println("널 참조");

		} catch (Exception e) {

			System.out.println("예외 처리"); // ?

		}

	}

	private static void m3() {

		// 0으로 나누기 > java.lang.ArithmeticException
		int num = 10;
		System.out.println(100 / num);

		// 배열 첨자 > java.lang.ArrayIndexOutOfBoundsException
		int[] nums = new int[3];
		nums[0] = 10;

		// null 참조 > java.lang.NullPointerException
		Scanner scan = null;
		scan.nextLine();

	}

	private static void m2() {

		int num = 10;

		try {
			// 비즈니스 코드
			System.out.println(100 / num);
		} catch (Exception e) {
			// 예외 처리 코드
			System.out.println("예외 처리");
		} finally {
			// ? > 마무리 영역 > 무조건 실행되는 블럭 > 뒷수습
			// - 예외와 상관없이 항상 실행해야 하는 코드
			System.out.println("마지막");

			// test.txt 파일 닫기
		}
	}

	private static void m1() {

		// 요구사항] 숫자를 입력받아 연산을 하시오.
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자: ");

		int num = scan.nextInt();

		// 예외 처리 > 전통적인 방식 (오래된)

		// if (조건) {
		// 참 > 실행
		// } else {
		// 거짓 > 실행
		// }

		// 권장 - 일반적으로 이런 구조로 생각함.
		if (num != 0) {
			// 비즈니스 코드(=업무 코드) > 원래 목적!!
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		} else {
			// 예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		}

		// 비권장 > 가독성
		if (num == 0) {
			// 예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		} else {
			// 비즈니스 코드(=업무 코드) > 원래 목적!!
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		}

		// if문 vs try문
		// - if문: 사전에 미리 검사를 해서 사고가 안나게 처리
		// - try문: 일단 실행 > 감시!! > 사고가 나면 그때 뒷처리

		// try 영역 > 감시!! (CCTV) > 예외가 발생하는지 감시
		try {
			System.out.println(1);
			System.out.printf("100 / %d = %d\n", num, 100 / num); // num == 0 -> 오류발생 -> 거기서 컴퓨터가 아예 중단되지 않고 현재 하던 것만
																	// 멈추고 바로 catch로 이동.
			System.out.println(2);
		} catch (Exception e) {
			System.out.println("0을 입력하면 안됩니다.");

			// Exception e
			// - 예외 객체
			// - 예외의 상황을 전달
			System.out.println(e.getMessage());

			e.printStackTrace();
		}
		System.out.println("종료");
	}

}// class
