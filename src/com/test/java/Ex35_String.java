package com.test.java;

public class Ex35_String {
	public static void main(String[] args) {

		// Ex35_String.java

		/*

		이 부분을 수정했습니다.
		 * 문자열 - 물리적으로는 참조형이지만, 약간의 값형의 성질을 가진다. - 박쥐
		 * 
		 * 
		 * 1. 메모리의 공간은 한 번 할당되면 더 이상 늘리거나 줄일 수 없다. 2. "문자열은 불변(Immutable)이다." > 한 번 만들어진
		 * 문자열은 절대 수정할 수 없다. (면접질문) 3. 문자열은 참조형이다.
		 * 
		 * 
		 */

//		m1();
//		m2();
		m3();

	}// main

	private static void m3() {

		// String vs StringBuilder

		String s1 = "홍길동"; // 문자열 리터럴 사용 > 특혜 (String만 다른 취급)
		String s2 = new String("홍길동");

//		StringBuilder s3 = "홍길동";	// 불가능
		StringBuilder s3 = new StringBuilder("홍길동");

		System.out.println(s1);
		System.out.println(s3);

		System.out.println(s1.length());
		System.out.println(s3.length());

		// StringBuilder > 수정 작업에 강하다.

		long begin = System.nanoTime();

		// 작업 > String
		String txt1 = "홍길동";

		for (int i = 0; i < 100000; i++) {
			txt1 += "."; // 수정 작업
		}
		long end = System.nanoTime();

		System.out.println(txt1.length());
		System.out.println(end - begin + "ns");

//		StringBuilder s4 = new StringBuilder("홍길동");
//
//		System.out.println(s3 == s4);

		begin = System.nanoTime();

		StringBuilder txt2 = new StringBuilder("홍길동");

		for (int i = 0; i < 100000; i++) {
			txt2.append("."); //txt2 = txt2 + "."
		}
		
		end = System.nanoTime();

		System.out.println(txt2.length());
		System.out.println(end - begin + "ns");
		
		//2,508,670,800ns > 2.7s (String)
		//2,780,400ns > 0.002s (StringBuilder)
		
		
		
		
	}

	private static void m2() {

		// 문자열은 불변이다. > 되도록 하지 말아야 하는 행동
		// 1. 문자열의 잦은 수정
		// 2. 커다란 문자열의 수정

		String txt1 = "홍길동";

		// 생성하고 제거하는게 100번 반복됨. 반복 횟수가 증가하면 느려진다. 피하자.
		for (int i = 0; i < 100; i++) { // 어느정도까지는 괜찮지만, 그 정도가 어디인지 상황따라 다르고 정확히 모른다. 그러니 피하자.
			txt1 = txt1 + "님"; // 수정
		}
		System.out.println(txt1);

		txt1 = "홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.";

		txt1 = txt1 + "!"; // 이것도 하지마. 메모리 낭비야.
	}

	private static void m1() {

		// ** 모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변이다.

		int n1 = 10; // 4byte
		int n2 = 2000000000; // 4byte

		// 하나의 메소드 안에서 선언된 상수는 같이 사용한다.
		String s1 = "홍길동"; // 2*3=6byte
		String s2 = "안녕하세요. 홍길동입니다."; // 2*14=28byte

		String s3 = "홍길동";
		String s4 = "홍";
		s4 = s4 + "길동";

		// 문자열을 리터럴로 할당할 경우 같은 주소를 공유한다.
		// new 생성자를 사용할 경우, 문자열이 같더라도 새롭게 생성하여 주소가 달라진다.
		// 같은 주소를 왜 공유할까?
		// 문자열이 거대해지면 사용하는 메모리가 커진다. 이를 매번 새로 생성할 경우 메모리 사용이 과다해진다.
		// 메모리를 아끼고자 공유하여 사용한다.
		System.out.println(s1 == s3); // true -> 절대 사용 금지
		System.out.println(s1 == s4); // false

		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // false

		s1 = s1 + "님"; // 홍길동 > 홍길동님

		System.out.println(s1); // 홍길동님 -> 새로운 "홍길동님" 생성 -> "홍길동님"의 주소로 덮어쓰기
		System.out.println(s3); // 홍길동

		// 문자열 수정 시 매번 새로운 문자열이 생성된다.
		// 문자열은 불변한다.

	}
}
