package com.test.java;

public class Ex14_Casting {
	public static void main(String[] args) {
		// Ex14_Casting.java

		// 정수형 리터럴은 int이다.
		// 실수형 리터럴은 double이다.

		// byte = int
		// 작은형(1) = 큰형(4)
		byte b1 = 10; // 서비스 문법. overflow 안남. 자잘한거 신경 안쓰게 하려고

		// short = int
		// 작은형(2) = 큰형(4)
		short s1 = 10; // overflow 안남

		// int = int
		int i1 = 10;

		// long = int
		// 큰형(8) = 작은형(4)
		long l1 = 10;

		// float = double
		// 작은형(4) = 큰형(8)
		float f1 = 3.14F; // 원래는 float f1 = (float)3.14; 해야함. 서비스로 편하게 작성하게 해줌. 뒤에 f 붙이기

		// double = double
		double f2 = 3.14D;

		// ----------------------------------------------

		// 정수 > 실수

		int n2 = 100; // 원본(4byte)
		float n3; // 복사본(4byte)

		// 형변환
		// float = int
		// 4byte = 4byte
		// 암시적 형변환 > 안전
		n3 = n2;
		System.out.println(n3); // 100.0

		int n4; // 복사본
		float n5 = 100; // 원본

		// 형변환
		// int = float
		// 4byte = 4byte -> 물리적으로는 같지만 실제 들어가는 값은 오른쪽이 더 크다.
		// 명시적 형변환
		n4 = (int) n5;

		System.out.println(n4);

		// *** 정수와 실수간의 크기 비교는 단순하게 byte로 하는게 아니라
		// 실제 표현 가능한 숫자의 범위로 비교해야 한다.

		// int(4) < float(4)
		// long(8) < float(4)

		// 크기 정리
		// byte(1) < short(2) < int(4) < long(8) <<< float(4) < double(8)

		// char > 겉보기는 문자, 속으론 숫자 > 프로그램 입장 > 숫자 취급
		char m1; // 2byte char - 엄밀히 따지면 정수형이다.
		short m2; // 2byte

		m1 = '가'; // 44035

		// 형변환
		// short = char
		// 2byte = 2byte -> 근데 오류? -> 둘 중에 더 큰게 있다. => char 더 큼
		m2 = (short) m1;

		System.out.println(m2);

		char m3;
		short m4;

		m4 = 65;

		// 형변환
		// char = short
		// 2byte = 2byte -> 근데 왜 여기서도 오류가 나지? -> 얘도 명시적으로 해야 함.
		m3 = (char) m4;

		System.out.println(m3);

		// short와 char가 표현하는 숫자의 범위가 다르기 때문이다.
		// short > -32768 ~ 32767
		// char > 0 ~ 65535
		// 교집합 부분은 형변환 되도 문제 없다.
		// 그 밖에는 (언더플로우 + 오버플로우 = )오버플로우가 발생한다.
		// => 둘 다 위험해! > 명시적 형변환 하자.
		// 결론. short 쓰지마. 한글 다 깨져. int 쓰자.

		int m5;
		char m6;

		m5 = 44032;
		System.out.println((char) m5);

		m6 = '가';
		System.out.println((int) m6);

		// *** 값형끼리 형변환 (String 아님)
		// *** 값형과 참조형끼리는 형변환이 절대 불가능 (메모리 물리구조 때문)
		// *** boolean 형변환 불가능 (얘만 제외. 자바는 안됨.)
		// 정수 > 정수
		// 실수 > 실수
		// 정수 > 실수
		// 실수 > 정수
		// 문자 > 정수 - 실은 정수 > 정수 임
		// 정수 > 문자 - 실은 정수 > 정수 임

		// 값형 <- (형변환) -> 값형
		// 참조형 <- (형변환) -> 참조형

		String a1 = "100";
		int a2;

		// "100" > 100
		a2 = Integer.parseInt(a1); // 형변환이 아님.

		System.out.println(a2);

		// 100 > "100"
		String a3;
		int a4;

		a4 = 100;

		// String.valueOf(값형 데이터)
		a3 = String.valueOf(a4); // 100 > "100" FM. 근데 길어서 잘 안씀

		a3 = a4 + ""; // 얘를 더 씀.  100 +"" > "100" + "" > "100"

	}
}
