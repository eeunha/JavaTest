package com.test.java;

public class Ex13_Casting {
	public static void main(String[] args) {

		// Ex13_Casting.java

		/*
		 * 형변환, (자료)형변환 - Casting, Data Type Casting - 하나의 자료형을 또 다른 자료형으로 변환하는 작업 - int
		 * > double - float > short
		 * 
		 * 1. 암시적 형변환(자동 타입 변환) - 큰 자료형 = 작은 자료형 - 100% 안전한 작업 - 복사를 했을 때 원본과 항상 동일한 값이
		 * 복사된다.
		 * 
		 * 2. 명시적 형변환(강제 타입 변환) - - 작은형 = 큰형 - 경우에 따라 다르다. - 늘 신경써서 관리할 것. (개발자가 알아서
		 * 해야함)
		 * 
		 * 명시적 형변환 시 발생하는 데이터가 넘치는 현상 > 오버플로우(Overflow) 1. 위로 넘치는 현상 > Overflow 2. 아래로
		 * 넘치는 현상 > Underflow 1 + 2. Overflow
		 * 
		 * *** 오버플로우가 발생할만 한 상황을 미리 예측해서 관리가 필요하다.
		 * 
		 */

		byte a;
		short b;

		a = Byte.MIN_VALUE;

		// 암시적 형변환
		// short(2) = byte(1)
		// (자료형) : 형변환 연산자

		b = a;
//		b = (short) a; //자동으로 뒤에서 이렇게 하고 있음

		System.out.println(b);

		byte c = 10;
		long d;

		// 큰형(8) = 작은형(1)
		d = c;
		System.out.println(d);

		short e; // 원본
		byte f; // 복사본

		e = 1000;

		// 작은형(1byte) = 큰형(2byte)
		f = (byte) e;

		System.out.println(f); // -24

		/// 은행 계좌
		int g; // 복사본
		long h; // 원본

		h = 3000000000L;

		// 복사(계좌 이체)
		g = (int) h;

		System.out.println("이체 결과: " + g);

	}
}
