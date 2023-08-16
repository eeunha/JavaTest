package com.test.java.obj;

public class Ex43_Constructor {
	public static void main(String[] args) {

		// Ex43_Constructor.java

//		Member m = new Member();	// 기본 생성자 없어서 오류남
		
		Member m = new Member("hong", "1111", "홍길동", 1);

		System.out.println(m.info());
		
		
	}
}
