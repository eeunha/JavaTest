package com.test.question;

/*

2023.07.27

Q. 아래와 같이 출력하시오.

1	2	3	4	5
16	17	18	19	6
15	24	25	20	7
14	23	22	21	8
13	12	11	10	9

ㄱ, ㄴ 모양으로 각각의 패턴이 있다.
ㄱ - 방번호 증가
ㄴ - 방번호 감소
=> 규칙 찾기

https://shinny.tistory.com/266
*/
public class Q078 {
	public static void main(String[] args) {
		int[][] nums = new int[5][5];	// 결과값 저장소

		int row = 0; // 행
		int column = -1; // 열

		int value = 1; // 배열에 저장될 값
		int maxValue = 25; // 배열에 저장될 최대값

		int control = 1; // 행과 열을 도와주는 수
		int count = 5; // 한 줄마다 입력될 값의 수

		for (int i = 0; i < 5; i++) { // 회전 수
			for (int j = 0; j < count; j++) { // 가로로 저장(오른쪽 or 왼쪽)
				column += control;
				nums[row][column] = value;
				value++;
			}
			count--;
			for (int j = 0; j < count; j++) { // 세로로 저장(아래 or 위)
				row += control;
				nums[row][column] = value;
				value++;
			}
			control *= -1;
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
