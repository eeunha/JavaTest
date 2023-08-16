package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex57_Generic {
	public static void main(String[] args) {

		// Ex55_Generic.java

		// 클래스
		// 1. 클래스
		// 2. 인터페이스
		// 3. 추상 클래스
		// 4. enum
		// 5. 제네릭 클래스

		// 요구사항] 클래스 설계
		// 1. 멤버 변수 선언 > int
		// 2. 멤버 변수를 중심으로 여러가지 행동을 하는 메소드 선언

		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1.toString());
		System.out.println(n1.getData() * 2);
		System.out.println();

		// 추가사항] String 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		// => int 뿐만 아니라 String 데이터도 들어갈 수 있게 해달라.
		// => 클래스 추가 생성

		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.toString());
		System.out.println(s1.getData().length());
		System.out.println();

		// 추가사항] boolean 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.toString());
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();

		// 추가사항] double 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		// 추가사항] Byte 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		// 추가사항] Calendar 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		// 추가사항] Student 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		// 추가사항] 무한대...

		// 위의 문제점 > 해결방안
		// 1. Object 클래스 > 오래된 방식 ~ 현재 방식
		// 2. 제네릭 클래스 > 최신 방식(2014) ~ 현재 방식 (=> 조금 더 많이 씀)

		// Object 변수 == 만능 주머니(모든 자료형을 담을 수 있는 변수)
		// 단점: 넣을 때는 좋은데 꺼내기 어렵다. 뭐가 들었나 알아내기 어렵다.
		Object o1 = new Object();
		Object o2 = new Hong(); // 업캐스팅
		Object o3 = new Scanner(System.in);
		Object o4 = new WrapperInt(100);
		Object o5 = "홍길동";
		// ----------------------------------- 위는 참조형, 아래는 값형 -> 형변환
		// 박싱(Boxing) > 오토박싱
		Object o6 = 10; // = new Integer(10);
		Object o7 = true;

		// 모든 주소를 저장하는 참조변수는 4byte int다. 주소번지가 항상 이렇게 잡힌다.
		// 값형 변수는 절대로 주소값을 넣을 수 없다. 값만 넣을 수 있다.
		// int 변수와 참조형 변수의 생긴거를 보면 똑같이 생겼지만 실상 안에 들어가는 값이 다르다.
		// 근데 o6, o7이 되네? 왜지? -> 박싱(Boxing) > 오토박싱
		// 참조형 변수에 값형 변수를 넣을 경우, 자동으로 값형 변수의 자료형을 객체로 바꾸어 참조형 변수에 새 객체 주소값을 저장한다.

//		System.out.println(o6 * 2); // => 주소값이라 연산의 대상이 될 수 없다. 그래서 오류가 발생한다.
		// 다운 캐스팅. 꺼낼 때 조심해야한다.
		System.out.println((Integer) o6 * 2); // (내부적으로는)언박싱(Unboxing)
		System.out.println((int) o6 * 2);

//		Integer num = new Integer(10);
//		System.out.println(num);
//		System.out.println(num + 100);

		// 다운 캐스팅
//		o3.nextLine(); // Object 객체라 .nextLine() 메소드가 보이지 않는다.
//		((Scanner) o3).nextLine();
//		((Scanner) o4).nextLine(); // 컴파일 오류. 형변환이 안된다.

		System.out.println();
		WrapperObject n2 = new WrapperObject(200);
		System.out.println(n2.toString());
		System.out.println((int) n2.getData() * 2);
		System.out.println();

		System.out.println();
		WrapperObject s2 = new WrapperObject("아무개");
		System.out.println(s2.toString());
		System.out.println(((String) s2.getData()).length());
		System.out.println();

		System.out.println();
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2.toString());
		System.out.println((boolean) b2.getData() ? "참" : "거짓");
		System.out.println();

		// Generic - 데이터 가져온 후에 추가 형변환이 필요 없다.
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3.toString());
		System.out.println(n3.getData() * 2);
		System.out.println();

		Wrapper<String> s3 = new Wrapper<>("이순신");
		System.out.println(s3.toString());
		System.out.println(s3.getData());
		System.out.println();

		Wrapper<Boolean> b3 = new Wrapper<>(true);
		System.out.println(b3.toString());
		System.out.println(b3.getData() ? "참" : "거짓");
		System.out.println();

	}// main
}

class WrapperInt {

	private int data; // 1. 클래스 중심

	// 2. data 중심 > 행동
	public WrapperInt(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}

}

class WrapperString {

	private String data; // 1. 클래스 중심

	// 2. data 중심 > 행동
	public WrapperString(String data) {
//		this.data = data;
		this.setData(data); // => 생성자가 setter 호출하도록 이클립스가 변경시켰다. 생성자는 아무때나 부를 수 없고, 세터에서 유효성 검사를 하기 쉬우니까 이렇게
							// 바꿔둔 듯 하다.
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}

class WrapperBoolean {

	private boolean data;

	public WrapperBoolean(boolean data) {
		this.data = data;
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}

class WrapperObject {

	private Object data; // ***

	public WrapperObject(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}

class Wrapper<T> {
	private T data;

	public Wrapper(T data) { // <> 안씀
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}

}
