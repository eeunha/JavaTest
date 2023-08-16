package com.test.question;


/*

2023.07.27

Q. 아래와 같이 출력하시오.

0	0	1	0	0
0	2	3	4	0
5	6	7	8	9
0	10	11	12	0
0	0	13	0	0


*/
public class Q074_2 {
	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		int value = 1;
		
		
		
		printArr(nums);
	}

	private static void printArr(int[][] nums) {
		// 출력 > 수정없이 그대로 사용
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
