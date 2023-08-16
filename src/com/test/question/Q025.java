package com.test.question;

import java.util.Scanner;

public class Q025 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번쨰 숫자: ");
		int num1 = scan.nextInt();

		System.out.print("두 번쨰 숫자: ");
		int num2 = scan.nextInt();

		int bigN, smallN;

//		solve(num1, num2);

		if (num1 == num2) {
			System.out.println("두 숫자는 동일합니다.");
			return;
		}

		if (num1 > num2) {
			bigN = num1;
			smallN = num2;
		} else {
			bigN = num2;
			smallN = num1;
		}

		System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", bigN, smallN, bigN - smallN);

		scan.close();
	}

	private static void solve(int num1, int num2) {
		if (num1 == num2) {	// 동일한 경우 출력한 뒤 바로 종료한다.
			System.out.println("두 숫자는 동일합니다.");
			return;
		}

		//동일하지 않은 경우
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);

		System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", max, min, max - min);
	}
}
