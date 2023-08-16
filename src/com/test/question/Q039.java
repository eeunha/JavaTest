package com.test.question;

import java.util.Scanner;

public class Q039 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("시작 숫자: ");
		int startNum = scan.nextInt();

		System.out.print("종료 숫자: ");
		int endNum = scan.nextInt();

		String result = "";
		int sum = 0;

		for (int i = startNum; i <= endNum; i++) {	//시작 수부터 종료 수까지 반복
			sum += i;
			result += i;
			
			if (i != endNum) {
				result += " + ";
			} else {
				result += " = ";
			}
		}
		System.out.println(result + sum);
		
		scan.close();
	}
}
