package com.test.question;

/*

2023.07.27

Q. 아래와 같이 출력하시오.

0	0	1	0	0
0	2	3	4	0
5	6	7	8	9
0	10	11	12	0
0	0	13	0	0

배열 안에 넣을 값 = value = 1;

value가 1씩 커질 때마다 들어가는 i, j
0,2 
- 1,1 - 1,2 - 1,3 
- 2,0 - 2,1 - 2,2 - 2,3 - 2,4 

- 3,1 - 3,2 - 3,3
- 4,2

규칙
i = 0부터 nums.length-1 까지 1씩 증가한다.
j - 두 부분으로 나누어 진행
	- 위의 세 줄
		- 2 * i + 1 개수만큼 입력된다.
		- j는 2를 기준으로 2-i ~ 2+i 이다.
	
 	
	- 아래의 두 줄
	
	
*/
public class Q074 {
	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		int value = 1;

		for (int i = 0; i < nums.length / 2 + 1; i++) { // 위의 세모
			for (int j = 2 - i; j <= 2 + i; j++) { // 조건식이 j-i <= i+2 와 같음
				nums[i][j] = value++;
			}
		}

		for (int i = nums.length / 2 + 1; i < nums.length; i++) { // 아래 세모
			for (int j = i - 2; j <= 6 - i; j++) {
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
