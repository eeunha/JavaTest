package com.test.java.obj.inheritance;

import java.util.Date;

public class Ex48_Overriding {
	public static void main(String[] args) {

		// Ex48_Overriding.java

		// 대중적인 오버라이드
		// -toString()

		Time t1 = new Time(2, 30);

		// com.test.java.obj.inheritance.Time@5aaa6d82
		System.out.println(t1); // 현재 줄은 아랫줄로 변환됨.

		// String java.lang.Object.toString() > Object 클래스가 구현한 것 사용
		System.out.println(t1.toString()); // 2:30 > 전세계 개발자 아는 이름 > 이거 쓰자.
		System.out.println(t1.info()); // 2:30 > 나밖에 모르는 이름

		Date now = new Date();

		// Wed Aug 02 11:48:32 KST 2023
		System.out.println(now);

		// String java.util.Date.toString() > 오버라이드 됨
		System.out.println(now.toString());

	}
}

class Time {
	private int hour;
	private int minute;

	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	// 덤프
	public String info() {
		return this.hour + ":" + this.minute;
	}

	@Override // 어노테이션(Annotation)
	public String toString() {
		// TODO Auto-generated method stub
		return this.hour + ":" + this.minute;
	}
}