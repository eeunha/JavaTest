package com.test.question;

public class Q017 {
	public static void main(String[] args) {
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
	}

	public static void position(String name1) {
		System.out.printf("사원 : %s\n", name1);
		System.out.println();
	}

	public static void position(String name1, String name2) {
		System.out.printf("사원 : %s\n", name1);
		System.out.printf("대리 : %s\n", name2);
		System.out.println();
	}

	public static void position(String name1, String name2, String name3) {
		System.out.printf("사원 : %s\n", name1);
		System.out.printf("대리 : %s\n", name2);
		System.out.printf("과장 : %s\n", name3);
		System.out.println();
	}

	public static void position(String name1, String name2, String name3, String name4) {
		System.out.printf("사원 : %s\n", name1);
		System.out.printf("대리 : %s\n", name2);
		System.out.printf("과장 : %s\n", name3);
		System.out.printf("부장 : %s\n", name4);
		System.out.println();
	}
}
