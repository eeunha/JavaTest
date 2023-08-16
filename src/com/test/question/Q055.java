package com.test.question;

public class Q055 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			String result = "";
			int sum = 0;
			result = i + " = [";
			for (int j = 1; j <= i / 2; j++) {
				if (i % j != 0) { // 약수가 아닌 경우, 건너뛰기
					continue;
				}
				// 약수인 경우
				sum += j;
				result += j + ", ";

			}
			if (sum == i) {
				result += "]";
				System.out.println(result);
			}
		}
	}
}
