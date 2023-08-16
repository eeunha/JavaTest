package com.test.question;

import java.util.Scanner;

/*
 * Q. 난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
 * 
 * 조건
 * - 난수를 20개 발생 후 배열에 넣는다.
 * - 난수는 1 ~ 20 사이
 * - 배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
 * 
 * */
public class Q065 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] nums = new int[20];

		System.out.print("최대 범위: ");
		int max = scan.nextInt();

		System.out.print("최소 범위: ");
		int min = scan.nextInt();

		for (int i = 0; i < nums.length; i++) { // 생성된 난수로 배열 초기화
			nums[i] = (int) (Math.random() * 20) + 1; //1 ~ 20
		}

		System.out.print("원본: ");
		for (int i = 0; i < nums.length; i++) {	// 원본 배열 출력
			printValDot(nums.length, nums[i], i);
		}

		System.out.print("\n결과: ");
		for (int i = 0; i < nums.length; i++) {	//결과 배열 출력
			if (nums[i] < min || nums[i] > max)	// 해당 범위에 없을 경우 다음 수로 넘어감.
				continue;

			printValDot(nums.length, nums[i], i); // 해당 범위일 경우만 출력
		}

		scan.close();
	}

	private static void printValDot(int length, int val, int i) {
		System.out.print(val);
		if (i != length - 1) {	//마지막이 아닌 경우만 , 붙인다.
			System.out.print(", ");
		}
	}
}
