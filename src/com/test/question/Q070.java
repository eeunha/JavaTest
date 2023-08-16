package com.test.question;

import java.util.Arrays;

/*
 * 2023.07.27
 * 
 * Q. 아래와 같이 출력하시오.
 * 
 * 1  2  3  4  5
 * 10 9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 

- i는 1씩 증가

1	2	3	4	5
0,0	0,1	0,2	0,3	0,4 -> i는 짝수 -> j는 증가

6	7	8	9	10 
1,4	1,3	1,2	1,1	1,0 -> i는 홀수 -> j는 감소

2,0	2,1	2,2	2,3	2,4

3,4	3,3	3,2	3,1	3,0

4,0	4,1	4,2	4,3	4,4

 * */
public class Q070 {
	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		int value = 1;

		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) { // 짝수 행 - j 증가
				for (int j = 0; j < nums.length; j++) {
					nums[i][j] = value++;
//					System.out.printf("nums[%d][%d] = %d ", i, j, nums[i][j]);
				}
			} else { // 홀수 행 - j 감소
				
				for (int j = nums.length - 1; j >= 0; j--) {
					nums[i][j] = value++;
//					System.out.printf("nums[%d][%d] = %d ", i, j, nums[i][j]);
				}
			}
//			System.out.println();
		}

		// 출력 > 수정없이 그대로 사용
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
