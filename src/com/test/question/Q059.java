package com.test.question;

public class Q059 {
	public static void main(String[] args) {
		// 등차수열 출력
		// 두 숫자 간 간격이 1부터 차례로 1씩 커지며 더해진다.

		int curNum = 1;
		int sum = 0;
		int add = 0;

		while (curNum <= 100) {
			sum += curNum;
			System.out.print(curNum + " + ");
			curNum += ++add;
		}
		System.out.println("= "+ sum);
	}
}
