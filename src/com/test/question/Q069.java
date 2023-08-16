package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q. 배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.
 * 
 * 조건
 * - 원본 배열 길이: 사용자 입력
 * - 원본 배열 요소: 난수(1~9)
 * - 결과 배열 길이: 사용자 입력 / 2
 * */
public class Q069 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("배열 길이: ");
		int length = scan.nextInt();

		int[] nums = new int[length];
		int[] shortNums = new int[(length % 2 == 0) ? length / 2 : length / 2 + 1];

		for (int i = 0; i < length; i++) {
			nums[i] = (int) (Math.random() * 9) + 1; // 1~9 난수 생성
		}
		System.out.println("원본: " + Arrays.toString(nums));

		// shortNums[si] = nums[i] + nums[i+1];
		// nums.length % 2 == 0 > 모든 두 수 더해서 넣기
		// nums.length % 2 == 1 > 마지막 한 수를 그대로 넣기.

		int shortNumsIdx = 0;
		for (int i = 0; i < nums.length; i += 2) {
			if (i + 1 == nums.length) { // 홀수일 때만, 마지막 한 수 그대로 넣기
				shortNums[shortNumsIdx] = nums[i];
				shortNumsIdx++;
				continue;
			}
			shortNums[shortNumsIdx] = nums[i] + nums[i + 1]; // 두 수 더하기
			shortNumsIdx++; // 인덱스 증가
		}

		System.out.println("결과: " + Arrays.toString(shortNums));

		scan.close();
	}
}
