package com.test.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 난수 생성하기
// 생성된 난수가 중복인가?
// 아니라면 배열에 넣기
// 맞다면 새로운 난수 생성하기
// 언제까지 난수 생성해? 배열이 가득 찰 때까지

// 시간복잡도: O(n^2) -> 중복 확인으로 현재 배열을 한번 더 탐색
// 공간복잡도: O(6) -> O(n)

/*
 * Q. 중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
 * 
 * 조건
 * - 숫자의 범위: 1 ~ 45
 * - 오름차순 정렬
 * */
public class Q066 {
	public static void main(String[] args) {
		int[] nums = new int[6];

		int index = 0; // nums의 index
		int randomNum = 0; // 난수
		boolean isSame = false; // 같은지 비교할 논리값

		while (index < nums.length) {
			randomNum = (int) (Math.random() * 45) + 1; // 난수 생성 (1~45)

			if (index == 0) { // 배열이 비어있을 경우, 바로 삽입
				nums[index++] = randomNum;
				continue; // 다음 인덱스로 넘어감
			}
			// 중복 확인
			// 현재 배열의 값을 0 ~ index - 1까지 탐색(index = 현재 들어갈 자리) -> 메소드
			isSame = findSameNum(index, randomNum, nums);

			if (isSame) { // 중복일 경우
				continue; // 새로운 수 생성
			} else { // 새로운 경우
				nums[index++] = randomNum;
			}

		}
		Arrays.sort(nums);	//오름차순 정렬
		System.out.println(Arrays.toString(nums));

//		useSet(nums); // set을 이용한 문제 풀이

//		useBooleanArr(nums);	// 탐색이 아니라 또 다른 배열을 사용하여 중복여부 탐색.
	}

	// 시간복잡도: O(nlog(n)) -> 탐색
	// 공간복잡도: O(46) -> 약 O(n)
	private static void useBooleanArr(int[] nums) {
		int index = 0; // nums의 index
		int randomNum = 0; // 난수
		boolean[] checkDup = new boolean[46];

		while (index < nums.length) {
			randomNum = (int) (Math.random() * 45) + 1; // 난수 생성 (1~45)

			if (index == 0) { // 배열이 비어있을 경우, 바로 삽입
				nums[index++] = randomNum;
				checkDup[randomNum] = true; // 나왔을 경우 true로 값 변경
				continue; // 다음 인덱스로 넘어감
			}
			// 중복 확인
			if (checkDup[randomNum]) { // 중복일 경우
				continue; // 새로운 수 생성
			} else { // 새로운 경우
				nums[index++] = randomNum;
				checkDup[randomNum] = true;
			}
		}
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static boolean findSameNum(int index, int randomNum, int[] nums) {
		for (int i = 0; i < index; i++) { // 현재 배열의 값을 0 ~ index - 1까지 탐색
			if (randomNum == nums[i]) { // 중복인 경우
				return true; // true 반환
			}
		}
		return false; // 다 돌았는데도 겹치지 않았다 - false 반환
	}

	private static void useSet(int[] nums) {
		Set<Integer> set = new HashSet<>();

		int index = 0;
		int randomNum = 0;

		while (index < nums.length) {
			randomNum = (int) (Math.random() * 45) + 1;

			if (set.contains(randomNum))
				continue;

			set.add(randomNum);
			nums[index++] = randomNum;
		}

		Arrays.sort(nums);

		System.out.println(Arrays.toString(nums));
	}
}
