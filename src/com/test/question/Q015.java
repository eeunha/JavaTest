package com.test.question;

import java.util.Scanner;

public class Q015 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("맑은 날: ");
		int sunny = scan.nextInt();

		System.out.print("흐린 날: ");
		int foggy = scan.nextInt();

		System.out.printf("사과가 총 %d개 열렸습니다.", getApple(sunny, foggy));

		scan.close();
	}

	private static int getApple(int sunny, int foggy) {
		int height = sunny * 5 + foggy * 2;
		int count = 0;

		if (height < 100) {	//키가 1m 미만인 경우 사과는 없다.
			return count;
		} else {
			height -= 100;	//기본 시작 키인 1m를 뺀다.
			count++;	//기본 시작 사과를 1 증가시킨다.
			if (height / 10 > 0) {	//남은 키를 10cm로 나눈다.
				count += height / 10 - 1;	//몫에 1을 뺀 수를 사과 수로 더한다.
			}
		}
		return count;
	}
}
