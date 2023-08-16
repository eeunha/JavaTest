package com.test.java;

public class Ex10_Input {
	public static void main(String[] args) throws Exception {

		// Ex10_Input.java

		/*
		 * 콘솔 출력 > 모니터 1. System.out.print() 2. System.out.println() 3.
		 * System.out.printf()
		 * 
		 * 콘솔 입력 > 키보드 
		 * 1. System.in.read(); //불편함 
		 * 2. BufferedReader 클래스 
		 * 3. Scanner 클래스 *** 주로 사용할 것
		 * 
		 * 
		 * 
		 * 
		 */

		// 요구사항] 사용자에게 문자 1개를 입력받아 > 화면에 출력하시오.

		// 1. 안내 메시지 출력
		// 2. 키 입력
		// 3. 키를 화면에 출력

		// 1.
		System.out.println("문자 입력: ");

		// 2.
		// - 입력 대기 상태 > 블럭 걸렸다.
		// - 사용자의 키 입력을 기다리고 있는 중
		// - 콘솔 > 키 입력 완료 > 엔터 입력
		
		//read() 메소드 1회 > 문자 1개 입력
		int code = System.in.read(); //문자코드. 메인메소드에 throws Exception 필요. 문자 코드 값을 반환해서 int다.
		
		//3. 한 문자만 출력됨
		System.out.println("출력: " + code); // a = 97, A = 65
		System.out.printf("출력: %c\n", code); // char에 int 들어가면 그에 해당하는 문자 반환.
		
		code = System.in.read(); //문자코드. 메인메소드에 throws Exception 필요. 문자 코드 값을 반환해서 int다.
		System.out.println("출력: " + code); // a = 97, A = 65
		System.out.printf("출력: %c\n", code); // char에 int 들어가면 그에 해당하는 문자 반환.

		code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);

		code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);

		code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		
		System.out.println("프로그램 종료");
		
		//ex) 출력 세 세트만 있고, 하나만 입력한 경우
		//\n\r이 버퍼에 남아있어서 남아있는 것을 읽었다.
		//97 - a, 13 - \r(Carriage Return), 10 - \n(Line Feed)
		
		//ex) 출력 5 세트 있고, 하나만 입력한 경우
		//3개 출력되고 남은 2개 입력 대기한다.
		
	}
}
