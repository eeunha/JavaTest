package com.test.question;

import java.util.Scanner;

/*
 * Q. 숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
 * 
 * 조건
 * - int[] nums = new int[5];
 * */
public class Q061 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] nums = new int[5];	// 입력받은 수를 저장할 배열 선언

		for (int i = 0; i < nums.length; i++) {
			System.out.print("숫자: ");
			nums[i] = scan.nextInt();
		}

		for (int i = nums.length - 1; i >= 0; i--) {	// 역순으로 탐색
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}

		scan.close();
	}
}
