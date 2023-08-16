package com.test.question;

/*
2023.07.27

Q. 아래와 같이 출력하시오.

1	2	3	4	5
6	7	8	9	0
10	11	12	0	0
13	14	0	0	0
15	0	0	0	0

규칙
- 각 행과 열을 더하면 모두 4다.
- i는 1씩 증가한다.
- j는 0부터 5-i까지 1씩 증가한다. -> nums[0].length - i

*/
public class Q073 {
	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		int value = 1;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length - i; j++) {
				nums[i][j] = value++;
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
