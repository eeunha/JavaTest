package com.test.question;

/*
 
 2023.07.27
 
 Q. 아래와 같이 출력하시오.
 
25	24	23	22	21
20	19	18	17	16
15	14	13	12	11
10	9	8	7	6
5	4	3	2	1

-> 그냥 입력되는 값만 25부터 1까지 하나씩 줄여가면서 입력한다.
 */
public class Q071 {
	public static void main(String[] args) {
		int[][] nums = new int[5][5];

		int value = 25;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				nums[i][j] = value--;
			}
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
