package com.test.java.obj.inheritance;

public class Ex45_Inheritance {
	public static void main(String[] args) {

		// 상속, Inheritance
		// - 부모가 가지는 재산을 자식에게 물려주는 행동
		// - 부모 클래스가 가지는 재산(변수, 메소드)을 자식 클래스에게 물려주는 행동
		// - 자식 클래스가 코드를 구현하지 않아도, 부모 클래스로부터 구현된 코드를 물려받는 행동

		// 왜?
		// - 비용 절감
		// - 코드 재사용(***********)

		// 상속 관계에 있는 클래스 호칭
		// - 부모 클래스 <- 자식 클래스
		// - 슈퍼 클래스 <- 서브 클래스
		// - 기본 클래스 <- 확장 클래스
		// - 기본 클래스 <- 파생 클래스

		Parent p = new Parent();

		p.a = 10;
		p.b = 20;

		Child c = new Child();
		c.a = 10; // 부모 클래스가 물려준 멤버
		c.b = 20;
		c.aaa();

		c.c = 30;
		c.d = 40;
		c.ccc();

	}
}

class Parent {

	public int a;
	public int b;

	public void aaa() {
		System.out.println("aaa");
	}

}

class Child extends Parent {
	public int c;
	public int d;

	public void ccc() {
		System.out.println("ccc");
	}
}

//회원 - 교집합 존재
//1. 일반 회원
//- 이름
//- 아이디
//- 암호
//- 이메일

//2. 관리자 회원
//- 이름
//- 아이디
//- 암호
//- 등급

//부모 클래스
class Member {
	public String name;
	public String id;
	public String pw;
}

//일반 회원
class User extends Member {
	public String email;
}

//관리자
class Administrator extends Member {
	public String lv;
}

class AAA {
	public int a = 10;
}

class BBB extends AAA {
	public int b = 20;
}

class CCC extends BBB {
	public int c = 30;
}

class DDD extends CCC {
	public int d = 40;
}