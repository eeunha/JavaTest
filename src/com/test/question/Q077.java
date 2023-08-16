package com.test.question;

/*

2023.07.27

Q. 아래와 같이 출력하시오.

1	2	4	7	11
3	5	8	12	16
6	9	13	17	20
10	14	18	21	23
15	19	22	24	25

*/
public class Q077 {
	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		int value = 1;

		for (int i = 0; i < nums[0].length; i++) {
			for (int j = 0; j <= i; j++) {
				nums[j][i - j] = value++;
			}
		}

		for (int i = 1; i < nums.length; i++) {
			for (int j = 4; j >= i; j--) {
				nums[i + 4 - j][j] = value++;
			}
		}

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
