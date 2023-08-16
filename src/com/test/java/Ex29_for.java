	package com.test.java;

import java.util.Scanner;

public class Ex29_for {

	public static void main(String[] args) {
		
		//제어문 > 조건문
		//제어문 > 반복문
		
		/*
		 	반복문
		 	- 특정 코드를 개발자가 원하는 횟수만큼 반복 제어
		 	- 생산성 향상 + 유지보수성 향상
		 	
		 	for문
		 	
		 	for (초기식; 조건식; 증감식) {
		 		문장;
		 	}
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		m15();
		
	} //main
	
	private static void m15() {
		
		//난수 만들기, random
		//임의의 수
		
		//1. Math 클래스 > 대중화 방법(다른 언어)
		//2. Random 클래스 > 자바 방법
		
		System.out.println(3.14);
		System.out.println(Math.PI);
		
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		//Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0.
		
		//0.0 ~ 0.999999999
		
		for (int i=0; i<10; i++) {
			
			//0~9 사이의 난수
			//System.out.println((int)(Math.random() * 10));
			
			//1~10 사이의 난수
			//System.out.println((int)(Math.random() * 10 + 1));
			
			//4~7 사이의 난수
			//0~3 사이의 난수 + 4
			System.out.println((int)(Math.random() * 4) + 4);
		}
	}

	public static void m14() {
		
		//빈 리턴문
		//값을 반환하는 목적이 아니라 메소드를 중단하는 역할
		return;
	}
	
	//모든 경우의 수 > 반드시 return문이 존재
	public static int m13() {
		
		int num = 10;
		
		if(num % 2 == 0) {
			return 10;
		} else {
			return 0;
		}
	}
	
	
	public static int m12() {
		
		return 10;
	}
	
	private static void m11() {

		//요구사항] 사용자 숫자 입력 > 입력받은 숫자 누적 > m6()
		//추가사항] 홀수만 입력~
		
		int sum = 0; //누적변수
		int num = 0; //입력
		
		Scanner scan = new Scanner(System.in);
		
		//회전수를 예측하기 힘들 때 > 무한루프 사용
		for(;;) {
			
			System.out.print("숫자: ");
			num= scan.nextInt();
			
			if(num % 2 == 0) { //짝수 입력
				break;
				//return;
			}
			
			sum += num;
		}
		
		System.out.println(sum);
		
	}

	private static void m10() {

		//학교 담임 선생님 > 학생 상담 > 1번 ~ 30번
		
		for(int i=1; i<=30; i++) {

//			if (i == 16) {
//				break;
//			}
			
			if(i == 10 || i == 15) {
				continue;
			}
			
			System.out.printf("%d번 학생 상담중..\n", i);
			
		}
	}

	private static void m9() {

		//break, continue > 독립적 사용 불가 > 다른 제어문과 함께 사용
		
		//break > 자신이 속한 제어문을 탈출(if문 예외, 인식 불가)
		//continue > 실행 > 제어문의 시작으로 이동(처음으로 돌아가세요.)
		
		for (int i=1; i<=10; i++) {
			
			if (i == 5) {
				//break;
				continue;
			}
			
			System.out.println(i);
		}
	}

	private static void m8() {

		//무한 루프, Infinite Loop
		//1. 사용자 실수 > 수정
		//2. 사용자 의도 > 어떻게?
		
		int num = Integer.MIN_VALUE;
		System.out.println(num);
		
		num--;
		System.out.println(num);
		
		//무판 루프(X) > 21억바퀴
//		for (int i=0; i<10; i--) {
//			
//			System.out.println(i);
//			
//		}
		
		//무한 루프
//		for (int i=0; true; i++) {
//			System.out.println(i);
//		}
		
		
//		for (int i=0; ; i++) {
//			System.out.println(i);
//		}
		
//		for (;;) {
//			System.out.println("반복문");
//		}
		
	}

	private static void m7() {

		//요구사항] 구구단 출력
		/*
		  	5 x 1 = 5 
		  	5 x 2 = 10
		  	5 x 3 = 15
		  	..
		  	5 x 9 = 45
		 */
		
		for (int i=1; i<=9; i++) {
			
			System.out.printf("5 x %d = %2d\n", i, 5 * i);
		}
		
		//요구사항] 사용자가 원하는 구구단 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단: ");
		int dan = scan.nextInt();
		
		for (int i=1; i<=9; i++) {
			
			System.out.printf("%d x %d = %2d\n", dan, i, dan  * i);
		}
		
		
	}

	private static void m6() {

		//요구사항] 사용자로부터 숫자 10개를 입력받아 누적?
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; //누적 변수
		for (int i=1; i<=10; i++) {
			
			System.out.print("숫자: ");
			int num = scan.nextInt();
			sum += num; //사용자 입력 숫자 > 누적
		}
		
		System.out.println(sum);
	}

	private static void m5() {

		//요구사항] 1~ 사용자가 원하는 숫자까지의 합?
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		int sum = 0; //누적 변수
		
		//몇회전할지는 컴파일 시점에는 알수가 없음, 런타임때 알 수 있음
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.printf("1 ~ %d = %d\n", num, sum);
	}

	private static void m4() {
		
		//요구사항] 1~10까지의 합 > 누적
		//누적하기
		//- 누적 변수(반드시 초기화)
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			
			System.out.println(i);
			
			//sum += i;
			sum = sum + i;
			//1 = 0 + 1
			//3 = (0 + 1) + 2
			//6 = (0 + 1 + 2) + 3
			//10 = (0 + 1 + 2 + 3) + 4
			//...
			//45 = (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8) + 9
			//55 = (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) + 10
			
		}
		
		System.out.println(sum);
		
	}

	private static void m3() {
		
		//반복문 >루프변수?
		//2. 루프 변수의 역할 > 회전수 or 값
		
		//요구사항] 숫자 1~10까지 출력
		
		for(int i=1; i<=10; i++ ) {
			System.out.println(i);
		}
		System.out.println();
		
		for(int i=1; i<=10; i+=2 ) {
			System.out.println(i);
		}
		System.out.println();
		
		for(int i=2; i<=10; i+=2 ) {
			System.out.println(i);
		}
		System.out.println();
	}

	private static void m2() {
		
		//반복문 > 회전수?
		//1. 반복문의 실행 횟수를 내가 제어할 수 있는지?
		
		for(int i=1; i<=5; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for(int i=5; i<=5; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for(int i=1; i<=5; i=i+2) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for(int i=5; i>0; i--) {
			System.out.println("실행문");
		}
		System.out.println();
	}

	private static void m1() {
		
		//요구사항] "안녕하세요" x 5회 출력
		
		//Case 1.
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println();
		
		//Case 2.
		hello();
		hello();
		hello();
		hello();
		hello();
		System.out.println();
		
		//Case 3.
		
		//1. int i = 1
		//2. i <= 5
		//3. 블럭(문장) 실행
		//4. i++
		//5. i <= 5
		//6. 블럭(문장) 실행
		//7. i++
		//8. i <= 5
		//9. 블럭(문장) 실행
		
		//초기식: 루프 변수(i)를 초기화하는 역할
		//조건식: 루프 지속 유무 조건
		//증감식: 루프 변수에 변화를 주는 역할 > 언젠가 루프를 탈출(false)
		
		for (int i = 1; i <= 5; i ++) {
			System.out.println("안녕하세요."); // x5 회 실행
		}
		
		
		
	}//m1
	
	public static void hello() {
		System.out.println("안녕하세요");
	}
	
}
