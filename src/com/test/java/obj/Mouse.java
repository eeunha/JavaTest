package com.test.java.obj;

import java.util.Calendar;

public class Mouse {

	private String model = "M301";
	private int price = 30000;
	private String color = "white";
	private Calendar date; // 마우스 제조 날짜

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	// Calendar 직접 입출력 불편해!
//	public Calendar getDate() {
//		return date;
//	}
//
//	public void setDate(Calendar date) {
//		this.date = date;
//	}

	// 계산된 프로퍼티 > getter와 setter는 기본적으로 private 멤버 변수를 조작하지만, 그게 필수가 아니다.
	// > 멤버변수와 무관(?)한 getter와 setter를 만들기도 한다.
	public String getState() {
		if (this.date.get(Calendar.YEAR) <= 2021) {
			return "구형";
		} else {
			return "신형";
		}
	}

	// class 만드는 게 더 복잡한게 좋다. 클래스는 한번만 설계하지만 클래스 사용은 계속 있다.
	public void setDate(int year, int month, int date) {

		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, date);

		this.date = c;
	}

	public String getDate() {
//		System.out.printf("%tF", this.date); // 출력 > 자바 콘솔 수업용

		return String.format("%tF", this.date); // 반환 -> 모든 분야 사용~
	}

	// 덤프(dump) 메소드
	public String info() {
		String temp = "[";

		temp += this.model + ", ";
		temp += this.price + ", ";
		temp += this.color + ", ";
		temp += String.format("%tF", this.date);

		temp += "]";

		return temp;
	}
}
