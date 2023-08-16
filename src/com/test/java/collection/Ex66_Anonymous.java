package com.test.java.collection;

//23.08.08
public class Ex66_Anonymous {
	public static void main(String[] args) {

		// Ex66_Anonymous.java

		// 익명 객체, Anonymous Object
		// - 익명 클래스, Anonymous Class
		// - 이름 없는 클래스

		// 요구사항] 인터페이스를 구현한 클래스 선언 > 객체 생성

		// 1. 본인 타입으로 참조 변수 만들기
		BBB b1 = new BBB();
		b1.aaa();
		System.out.println();

		// 2. 부모 타입(인터페이스)으로 참조 변수 만들기
		AAA b2 = new BBB();
		b2.aaa();
		System.out.println();

		// 3.
//		AAA b3 = new AAA();
//		b3.aaa();

		// The type new AAA(){} must implement the inherited abstract method AAA.aaa()
		AAA b3 = new AAA() {

			@Override
			public void aaa() {
				System.out.println("aaa");
			}

		};

		// 이름 없는 클래스처럼 생겼다 -> 익명 클래스
//		{
//
//			@Override
//			public void aaa() {
//				System.out.println("aaa");
//			}
//
//		};
		// 인터페이스 뒤에 익명 클래스를 붙이면 인터페이스도 일반 클래스처럼 사용할 수 있다.
		// 클래스는 이미 선언부가 있어서 다른 곳에 선언한 것을 불러와 사용한다.
		// 인터페이스는 구현부가 없기 때문에 바로 뒤에 익명 클래스를 선언하여 사용할 수 있다.

		b3.aaa();
		System.out.println();

		// b2 vs b3
		// b2
		// - AAA 인터페이스 선언
		// - BBB 클래스 구현

		// b3
		// - AAA 인터페이스 선언
		// - 실명 클래스 구현(X) > 익명 클래스 구현(O)

		// 익명 클래스 구현 > 클래스 재사용성 때문
		// 익명 클래스 > 재사용 의사 없음
		// 실명 클래스 > 재사용 의사 있음

		// 클래스 사용 목적 > 객체 생성
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();

		// 익명 클래스 > 붕어빵 틀 > 붕어빵을 딱 1개만 만들기 위한 틀
		// 인터페이스를 인스턴스 사용하듯이 적기 > 인터페이스의 추상메소드 구현하기
		AAA t4 = new AAA() {

			@Override
			public void aaa() {
				// TODO Auto-generated method stub

			}
		}; // 사용하고 나면 재사용할 수 없다.

		AAA t5 = new AAA() {

			@Override
			public void aaa() {
				// TODO Auto-generated method stub

			}

		};

	}// main
}

class Test { // 클래스 이름이 있어야 객체와 참조변수를 만들 수 있다.
	public int a;
	public int b;

	public void ccc() {

	}

}

interface AAA {
	void aaa();
}

//The type BBB must implement the inherited abstract method AAA.aaa()
class BBB implements AAA {

	@Override
	public void aaa() {
		System.out.println("aaa");
	}

}
