package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q. 배열에 요소를 삽입하시오.
 * 
 * 조건
 * - 배열 길이: 10
 * - 마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
 * */
public class Q067 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] nums = new int[10];
		int temp = 0;

		System.out.print("삽입 위치: ");
		int index = scan.nextInt();

		System.out.print("값: ");
		int value = scan.nextInt();

		// 배열에 넣을 요소 개수를 난수로 생성한다.
		int valCount = (int) (Math.random() * (10 - index)) + index + 1; // index+1 ~ nums.length

		for (int i = 0; i < valCount; i++) { // valCount 개 만큼 요소 넣기
			nums[i] = (int) (Math.random() * 10) + 1;
		}

		System.out.println("원본: " + Arrays.toString(nums));

		// nums[index] = value
		// 로 바꾸고 기존 값 오른 쪽으로 밀기.
		// 밀 때 배열의 길이를 넘어가면 버림.
		// valCount = nums[]의 처음으로 빈 인덱스 -> x
		// temp로 값을 하나씩 뒤로 민다.

		while (index < nums.length) {
			// 바꿀 값 = value
			// 임시 값 = temp
			// 현재 인덱스값 = nums[index]

			if (index == nums.length - 1) { // 배열의 마지막 자리일 경우 바로 넣고 종료.
				nums[index++] = value;
				break;
			}

			temp = nums[index];
			nums[index] = value;
			value = temp;
			index++;
		}

//		solve(nums, index, value); //while문을 대신하는 풀이방법

		System.out.println("결과: " + Arrays.toString(nums));
	}

	private static void solve(int[] nums, int index, int value) {
		// 위의 while문과 같음.
		for (int i = nums.length - 1; i > index; i--) {
			nums[i] = nums[i - 1];
		}
		nums[index] = value;
	}
}
