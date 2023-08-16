package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q. 배열의 요소를 삭제하시오.
 * 
 * 조건
 * - 배열 길이: 10
 * - 마지막 요소는 0으로 채우시오.
 * */
public class Q068 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] nums = new int[10];

		System.out.print("삭제 위치: ");
		int index = scan.nextInt();

		// 배열에 넣을 요소 개수를 난수로 생성한다.
		int valCount = (int) (Math.random() * (10 - index)) + index + 1; // index+1 ~ nums.length
//		int valCount = 10;

		for (int i = 0; i < valCount; i++) { // valCount 개 만큼 요소 넣기
			nums[i] = (int) (Math.random() * 10) + 1;
		}

		System.out.println("원본: " + Arrays.toString(nums));

		while (index < nums.length - 1) {
			nums[index] = nums[++index];
		}
		nums[nums.length - 1] = 0;

		System.out.println("결과: " + Arrays.toString(nums));

		scan.close();
	}
}
