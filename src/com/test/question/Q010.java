package com.test.question;

public class Q010 {
	public static void main(String[] args) {
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
	}

	private static void digit(int num) {
		String result = (num >= 1000) ? num + "" : String.format("%04d", num);	//4자리가 넘어가면 그대로 출력, 넘지 않으면 4자리 앞에 0을 넣어서 출력
		System.out.println(num + " → " + result);
	}
}
