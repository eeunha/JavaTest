package com.test.question;

/*

2023.08.02

Q. 아래와 같이 출력하시오.

2	7	6
9	5	1
4	3	8

마방진

규칙
가로, 세로, 대각선 각각의 합이 모두 같다.

1. 숫자 1 - 아무데나 1 적기 (예시 - 1,2)
2. 방향 정하기 - 2, 5, 7, 11시 방향 중 택 1 (예시 - 2시)
3. 배열이 배열 주변으로 똑같은게 반복된다고 생각하자.
계속 해당 시 방향으로 숫자 넣기
이미 있으면 자기자리(기준점)에서 왼쪽에 넣기


23.07.31
2	7	6
0,0	0,1	0,2

9	5	1
1,0	1,1	1,2

4	3	8
2,0	2,1	2,2

1          2            3             4          5       6            7               8
1,2 - (0,3)=>0,0 - (-1,1)=>2,1 - (1,2)=2,0    - 1,1    - 0,2    - (-1,3)=>0,1  -(-1,2)=>2,2
       범위벗어남       범위벗어남       범위 내       범위 내    범위 내     범위벗어남         범위벗어남
       비어있음         비어있음        값 존재       비어있음    비어있음     값 존재           비어있음
       값 넣기          값 넣기     기존 왼쪽에 넣기    값넣기     값 넣기   기존 왼쪽에 넣기      값 넣기

1. 처음 값은 1,2에 넣기 -> i=1, j=2 시작
2.0 현재 위치에서 2시방향인 i-1, j+1로 이동한다.
2.1 좌표가 범위를 벗어나는가?
	벗어난다
		좌표를 이동시킨다. (음수값 -> +3, 양수값-> -3)
		다음으로 넘어간다.
		
	벗어나지 않는다
		다음으로 넘어간다.	
	
2.2. 해당 위치가 비어있는가?
	비어있다
		해당 위치에 값을 넣는다. 끝
		
	비어있지않다
		이동하기 전 2.0 좌표에 현재 값을 넣는다. 끝

- pseudo code
i = 1, j = 2

i=i-1, j=j+1

//i, j가 좌표를 벗어나는가? (+ 좌표 재 설정)
i = validPos(i, 3);
j = validPos(j, 3);

if (arr[i][j] == 0) { // [i,j]가 비어있는가?
	arr[i][j] = value;
} else {
	arr[i+1][j-2] = value; // 이전 좌표로 이동 + j-1
}
value++;

validPos(int curPos, int maxRange){
	if (curPos >= 0 && curPos < maxRange) { // 올바른 경우
		return curPos;
	} else {
		if (curPos < 0) {	// 0보다 작은 경우
			return curPos + maxRange;
		} else {	// 2보다 큰 경우
			return curPos - maxRange;
		}
	}
}
-> 이전 i, j값 넣고 다시 만들면 될 듯

풀이 방법
0. 1~9까지 값 증가
1. 1을 1,2에 넣기 -> i = 1, j = 2
2. i-1, j+1 하기
3. 변경된 좌표가 범위를 벗어나는지 검사하기
4.1 벗어난다면 
*/
public class Q079 {
	public static void main(String[] args) {
		int maxRange = 3;
		int[][] nums = new int[maxRange][maxRange];

		int value = 1;
		int maxValue = maxRange * maxRange;

		int i = 0;
		int j = 0;

		int lastI = 0;
		int lastJ = 0;

		while (value <= maxValue) {
			if (value == 1) { // 예외사항
				i = 1;
				j = 2;
				nums[i][j] = value;
				value++;
				continue;
			}

			// 이전 값 지정
			lastI = i;
			lastJ = j;

			// 값 변경
			i--;
			j++;

			// 값 유효성 및 재설정
			i = validPos(i, maxRange);
			j = validPos(j, maxRange);

			if (nums[i][j] != 0) { // [i,j]가 비어있는가?
				i = lastI;
				j = lastJ - 1;
			}
			nums[i][j] = value;

			value++;
		}

		printArr(nums);
	}

	private static int validPos(int curPos, int maxRange) {
		if (curPos >= 0 && curPos < maxRange) { // 올바른 경우
			return curPos;
		} else {
			if (curPos < 0) { // 0보다 작은 경우
				return curPos + maxRange;
			} else { // 2보다 큰 경우
				return curPos - maxRange;
			}
		}
	}

	private static void printArr(int[][] nums) {
		// 출력 > 수정없이 그대로 사용
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
