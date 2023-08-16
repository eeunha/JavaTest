package com.test.java.obj.inheritance;

public class Ex58_Generic {
	public static void main(String[] args) {

		// Ex58_Generic.java

		Item<String> item = new Item<String>();

		Item<Integer> item2 = new Item<Integer>();
//		Item<int> item2 = new Item<int>();
		item2.c = 100;

		Pen<Boolean> pen = new Pen<Boolean>();
		pen.a = true;
		pen.b = false;
		pen.c = true;

		Note<String, Integer> note = new Note<String, Integer>("홍길동", 20);
		System.out.println(note.getA());
		System.out.println(note.getB());
	}
}

//제네릭 클래스
//- T: 타입 변수(메소드의 매개변수 역할) > 자료형을 전달하는 변수 > 반드시 참조형만 가능
//- <>: 인자 리스트(메소드의 () 역할) - 최대 2개, 보통 1개
class Item<T> {
	public int a;
	public int b;
	public T c; // 클래스 선언까지는 결정(X) > 객체를 생성할 떄 결정(O)
}

class Pen<T> {
	public T a;
	public T b;
	public T c;
}

class Desk<T> {
	public T a;// 멤버 변수의 자료형

	public void set(T a) { // 메소드 매개변수의 자료형
		this.a = a;

		T b; // 지역변수의 자료형 > 비권장
	}

	public T get() { // 메소드 반환타입
		return this.a;
	}

}

class Note<T, U> {
	public T a;
	public U b;

	public Note(T a, U b) {
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return this.a;
	}

	public U getB() {
		return this.b;
	}
}