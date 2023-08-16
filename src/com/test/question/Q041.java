package com.test.question;

public class Q041 {
	public static void main(String[] args) {
		int i = 1;
		int sum = i++;
		String result = "1";

		while (sum <= 1000) { //더한 값이 1000 넘어가면 종료
			result += "+" + i;
			sum += i++;
		}
		System.out.println(result + "=" + sum);
	}
}
