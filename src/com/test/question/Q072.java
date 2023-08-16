package com.test.question;

/*
2023.07.27

Q. 아래와 같이 출력하시오.

1	6	11	16	21
2	7	12	17	22
3	8	13	18	23
4	9	14	19	24
5	10	15	20	25

-> 세로찍기. i와 j를 바꿔서 입력했다.
*/
public class Q072 {
	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		int value = 1;

		for (int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[0].length; j++) {
				nums[j][i] = value++;
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
