package com.test.question;

public class Q060 {
	public static void main(String[] args) {
		// 현재 수 + 직전 수 더해서 다음 수 만들기
		int curNum = 1;
		System.out.print(curNum + " + ");

		int sum = 1;
		int lastNum = 0;
		int temp = 0;


		while ((lastNum + curNum) <= 100) {
			sum += lastNum + curNum;
			System.out.print(lastNum + curNum + " + ");

			temp = lastNum;
			lastNum = curNum;
			curNum += temp;
		}
		System.out.println("= " + sum);
	}
}
