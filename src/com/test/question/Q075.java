package com.test.question;

/*

2023.07.27

Q. 아래와 같이 출력하시오.

1	2	3	4	10
5	6	7	8	26
9	10	11	12	42
13	14	15	16	58
28	32	26	40	136

1. 3행까지 입력

2. 4행 0열 ~ 4행 3열 에 해당 열의 합 넣기 

3. 2의 각 합을 모두 더해 4행 4열에 넣기


*/
public class Q075 {
	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		int value = 1;
		int sum = 0;

		for (int i = 0; i < nums.length - 1; i++) { // 행 = i = 0 ~ 3
			sum = 0;
			for (int j = 0; j < nums[0].length - 1; j++) { // 열 = j = 0 ~ 3
				nums[i][j] = value;
				sum += value++;
			}
			nums[i][nums[0].length - 1] = sum; // 가장 우측 합 넣기
		}

		// 4행 채우기
		for (int i = 0; i < nums.length - 1; i++) {	// 열 = i = 0 ~ 3
			sum = 0;
			for (int j = 0; j < nums.length - 1; j++) {	// 행 = j = 0 ~ 3
				sum += nums[j][i];
			}
			nums[nums[0].length - 1][i] = sum; // 맨 아래 행, 열 = 0~3 각 열의 합 넣기
			nums[nums.length - 1][nums[0].length - 1] += sum;	// 최종 합 넣기
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
