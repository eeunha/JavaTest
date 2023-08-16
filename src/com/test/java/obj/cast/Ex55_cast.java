package com.test.java.obj.cast;

import java.util.HashSet;
import java.util.Set;

public class Ex55_cast {
	public static void main(String[] args) {

		// Ex55_casting.java

		// 형변환, Type Casting

		// 1. 값형 형변환
		// - 값형끼리 형변환(boolean 제외)
		// - 숫자형끼리 형변환

		// 2. 참조형 형변환
		// - 참조형끼리 형변환
		// - 클래스끼리 형변환

		// 참조형 형변환
		// - 상속 관계의 클래스간 형변환만 지원
		// - 직계끼리만 가능(방계는 불가능)
		// - A클래스 > B클래스

		// 1. 업캐스팅, Up Casting
		// - 암시적 형변환
		// - 100% 안전
		// - 자식 클래스 > 부모 클래스

		// 2. 다운 캐스팅, Down Casting
		// - 명시적 형변환
		// - 불안정 > 100% 불가능
		// - 부모 클래스 > 자식 클래스

		Parent p1;
		Child c1;

		c1 = new Child(); // 원본

		// 복사
		// Parent = Child
		// 암시적인 형변환
		// 부모클래스 = 자식클래스
		// 업캐스팅(***)
		// 100% 안전
//		p1 = c1;
		p1 = (Parent) c1; // 원형

		// 복사 후 검증 방법? > 복사된 참조 변수(p1) > 모든 멤버 접근 테스트(정상동작하는가?)
		p1.a = 10;
		p1.b = 20;

		System.out.println(p1.a);
		System.out.println(p1.b);

//		Parent p2;
//		Child c2;
//
//		p2 = new Parent(); // 원본
//
//		// Child = Parent
//		// 명시적인 형변환
//		// 자식 클래스 = 부모 클래스
//		// 다운 캐스팅
//		c2 = (Child) p2;
//
//		// 검증? 복사본을 사용하는데 문제가 없는지?
//		c2.a = 10;
//		c2.b = 20;
//		c2.c = 30;
//		c2.d = 40;
//
//		// Parent cannot be cast to class com.test.java.obj.cast.Child
//		System.out.println(c2.a);
//		System.out.println(c2.b);
//		System.out.println(c2.c);
//		System.out.println(c2.d);

		Parent p3;
		Child c3;

		c3 = new Child(); // 원본

		// 업캐스팅
		p3 = c3;

		Child c4;

		// 다운 캐스팅 > 100% 불가능
		c4 = (Child) p3; // 하지만 실상은 p3에 child가 들어있어서 문제가 발생하지 않는다.

		c4.a = 10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;

		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);

		Printer pr1;
		LG500 lg2 = new LG500();

		// Printer = LG500
		// 부모 = 자식
		// 업캐스팅
//		pr1 = (Printer) lg2; // 위아래가 같음
		pr1 = lg2;

//		Printer pr2 = (Printer) new HP600();
		Printer pr2 = new HP600();

		Object o1 = new LG500();
	}
}

class Parent {
	public int a;
	public int b;
}

class Child extends Parent {
	public int c;
	public int d;
}
