package com.test.question;

/*
 * Q. 1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
 * 
 * 조건.
 * - 난수를 20개 발생 후 배열에 넣는다.
 * - 난수는 1 ~ 20 사이
 * */
public class Q064 {
	public static void main(String[] args) {
		int[] nums = new int[20];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 20) + 1;

			// 난수 생성과 동시에 최대, 최소값을 찾는다.
			max = (max < nums[i]) ? nums[i] : max;
			min = (min > nums[i]) ? nums[i] : min;

			// 이렇게도 가능.
//			max = Math.max(max, nums[i]);
//			min = Math.min(min, nums[i]);
		}

		System.out.print("원본: ");
		
		for (int n : nums) { // 원본 배열 값을 탐색하며 출력
			System.out.print(n + ", ");
		}
		System.out.println();
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}
}
