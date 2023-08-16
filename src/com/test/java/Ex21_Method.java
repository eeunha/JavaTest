package com.test.java;

public class Ex21_Method {
	
	public static void main(String[] args) {
		
		//Ex21_Method.java
		
		//public static void hello(String name) {}
		
		//메소드 반환값(리턴값)
		//- 메소드가 실행 후 호출한 곳으로 돌려주는 값
		
		System.out.println(getNum());
		
		String result = getName("홍길동");
		System.out.println(result);
		
		
	}//main
	
	
	public static String getName(String name) {
		
		return "고객명: " + name;
	}
	
	
	public static int getNum() {
		
		//return문
		//- 메소드 종료
		//- 값을 반환
		return 100;
		
		//Unreachable code
		//System.out.println("테스트");
		
	}

}




















