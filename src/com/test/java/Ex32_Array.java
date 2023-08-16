package com.test.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex32_Array {
	public static void main(String[] args) {

		/*
		 * 
		 * 배열, Array - 자료 구조 - 자료형 > 참조형 - 집합 > 집합 자료형 > 데이터를 여러 개 저장할 수 있는 자료형 - 같은 자료형
		 * / 같은 성격 > 집합
		 * 
		 * 
		 * - 알고리즘 - 자료구조
		 * 
		 * 1. 자료형 + 변수 2. 콘솔 > 입출력 3. 제어문(*****) > 알고리즘 생성에 주요 역할 4. 배열(*********) >
		 * 자료구조 중 하나
		 * 
		 */

//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
//		m12();
//		m13();

//		q64();
//		q66();
//		q67();
		q68();
	}

	private static void q68() {

		// 배열의 요소를 삭제하시오.

		// 배열 요소 삭제 > Left Shift 구현(발생)

//		int[] nums = new int[] { 5, 6, 1, 3, 2, 0, 0, 0, 0, 0 };
		int[] nums = new int[] { 5, 6, 1, 3, 2, 8, 7, 10, 4, 9 };

		int index = 2;

		System.out.println(Arrays.toString(nums));

		// Left Shift
		for (int i = index; i < nums.length - 1; i++) {
			//왼쪽방 = 오른쪽방
			nums[i] = nums[i + 1];
		}
		nums[nums.length - 1] = 0;

		System.out.println(Arrays.toString(nums));
	}

	private static void q67() {

		// 배열에 요소를 삽입하시오.

		// 배열 요소 삽입 > Right Shift 구현(발생)

		Scanner scan = new Scanner(System.in);

		int[] nums = new int[] { 5, 6, 1, 3, 2, 0, 0, 0, 0, 0 };

		System.out.print("삽입 위치: ");
		int index = scan.nextInt();

		System.out.print("값: ");
		int value = scan.nextInt();

		System.out.println(Arrays.toString(nums));

		// Right Shift
		for (int i = nums.length - 2; i >= index; i--) {
			// 오른쪽방 = 왼쪽방
			nums[i + 1] = nums[i];
		}
		nums[index] = value;

		System.out.println(Arrays.toString(nums));
	}

	private static void q66() {

		// 난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.(로또)

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int n = (int) (Math.random() * 45) + 1;

			if (isDuplicate(lotto, n)) {
				i--;
			} else {
				lotto[i] = n;
			}
		}

		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

	private static boolean isDuplicate(int[] lotto, int n) {
		for (int i = 0; i < lotto.length; i++) {
			if (lotto[i] == n)
				return true;
		}
		return false;
	}

	private static void q64() {

		// 1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.

		int[] nums = new int[20];

		int max = 0; // 입력 받을 수 있는 수보다 더 작은 수
		int min = 21; // 입력 받을 수 있는 수보다 더 큰 수

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 20) + 1; // 1 ~ 20
		}

		System.out.println(Arrays.toString(nums));

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}

			if (nums[i] < min) {
				min = nums[i];
			}
		}

		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

	private static void m13() {

		int[] nums = { 5, 3, 1, 4, 2 };

		Arrays.sort(nums); // Quicksort implementations > 퀵 정렬 > 오름차순

		System.out.println(Arrays.toString(nums));

	}

	private static void m12() {

		// 정렬
		// - 요소간의 크기 비교 > 재배치

		// 1. 오름차순
		// a. 숫자: 작은 수 > 큰 수
		// b. 문자열: 문자 코드값 순으로
		// c. 날짜시간: 과거 > 미래

		// 2. 내림차순
		// a. 숫자: 큰 수 > 작은 수
		// b. 문자열: 문자 코드값 역순으로
		// c. 날짜시간: 미래 > 과거

		// 정렬 구현
		// 1. 개발자 구현
		// 2. JDK or Library 사용 > 주로 사용

		// 버블 정렬
		// 오름차순 정렬
		int[] nums = { 5, 3, 1, 4, 2 };
		System.out.println(Arrays.toString(nums));
		System.out.println();

		for (int i = 0; i < nums.length - 1; i++) { // 0, 1, 2, 3 > cycle
			for (int j = 0; j < nums.length - 1 - i; j++) { // 비교 후 스왑
				if (nums[j] > nums[j + 1]) { // 오름차순
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));

		for (int i = 0; i < nums.length - 1; i++) { // 0, 1, 2, 3 > cycle
			for (int j = 0; j < nums.length - 1 - i; j++) { // 비교 후 스왑
				if (nums[j] < nums[j + 1]) { // 내림차순
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));

//		int temp = 0;
//		for (int i = 0; i < nums.length; i++) {	// 마지막 한 줄은 사실 안돌아도 됨.
//			for (int j = 0; j < nums.length - (i + 1); j++) {
//				if (nums[j] > nums[j + 1]) {
//					temp = nums[j];
//					nums[j] = nums[j + 1];
//					nums[j + 1] = temp;
//				}
//				System.out.println(Arrays.toString(nums));
//			}
//			System.out.println();
//		}
	}

	private static void m11() {

		// 배열 초기화 리스트
		int[] nums = new int[3];
		System.out.println(Arrays.toString(nums));

		// 초기화
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		System.out.println(Arrays.toString(nums));

		// 초기화 리스트
		int[] nums2 = new int[] { 100, 200, 300 }; // 0, 0, 0 아니고 처음부터 100, 200, 300으로 초기화
		System.out.println(Arrays.toString(nums2));

		int[] nums3 = { 100, 200, 300 };
		System.out.println(Arrays.toString(nums3));

		String[] names1 = new String[3];

		names1[0] = "홍길동";
		names1[1] = "아무개";
		names1[2] = "하하하";

		String[] names2 = { "홍길동", "아무개", "하하하" };

		System.out.println(Arrays.toString(names1));
		System.out.println(Arrays.toString(names2));
	}

	private static void m10() {

//		int a; //null
//		System.out.println(a); //컴파일 오류

		// 배열 자동 초기화
		// - 배열(참조형)은 생성 직후에 자동으로 초기화가 된다.\

		// 초기화 규칙
		// 1. 정수 배열 > 0
		// 2. 실수 배열 > 0.0
		// 3. 문자 배열 > \0
		// 4. 논리 배열 > false
		// 5. 참조형 배열 > null

		int[] nums = new int[3]; // int x 3
		System.out.println(nums[0]);
		System.out.println(Arrays.toString(nums));

		double[] nums2 = new double[3];
		System.out.println(Arrays.toString(nums2));

		char[] list1 = new char[3];
		System.out.println(Arrays.toString(list1)); // \0이 안보임.

		boolean[] list2 = new boolean[3];
		System.out.println(Arrays.toString(list2));

		String[] list3 = new String[3];
		System.out.println(Arrays.toString(list3));
	}

	private static void m9() {

		// 유틸리티 클래스
		// - int > Integer
		// - double > Double

		// Arrays
		// - 배열 유틸리티 클래스

		int[] nums = new int[3];

		nums[0] = 111;
		nums[1] = 222;
		nums[2] = 333;

		// 배열의 상태가 궁금?
		printArray(nums); // 배열의 주소값 복사

		// 덤프(dump): 객체의 상태를 하나의 문자열로 풀어내는 행동
		System.out.println(nums); // [I@7d6f77cc -> [:배열, I:int > 해시코드 > 아무 의미 없음.

		System.out.println(Arrays.toString(nums));

		// 깊은 복사 메소드
		int[] copy;

		copy = Arrays.copyOfRange(nums, 0, nums.length); // 0~length-1까지 깊은 복사 진행

		nums[0] = 1000;

		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(copy));

	}

	public static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

//		System.out.println(Arrays.toString(nums));
	}

	private static void m8() {

		// 배열 복사
		// 1. 얕은 복사, Shallow Copy
		// - 주소값 복사
		// - Side Effect 발생

		// 2. 깊은 복사, Deep Copy
		// - 요소 복사
		// - Side Effect 없음

		// 개발자는 stack까지 접근할 수 있다.
		// heap은 stack을 거쳐야만 접근이 가능하다.

		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;

		int[] copy = new int[3];

		for (int i = 0; i < nums.length; i++) {

			// 배열 = 배열 > x
			// int = int > 값형 복사
			copy[i] = nums[i];
		}

		nums[0] = 1000;

		System.out.println("nums[0]: " + nums[0]);
		System.out.println("copy[0]: " + copy[0]);
	}

	private static void m7() {

		// 배열 복사

		// 값형 복사 > Side Effect가 발생하지 않는다.
		int a = 10;
		int b;

		b = a;

		// 원본 수정 > 복사본에게 영향을 미치는지 확인
		a = 20;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();

		// *** 개발자가 만드는 모든 지역 변수는 Stack에 생성한다.
		// 값형 변수는 stack속에 진짜 값이 들어있다.
		// 참조형 변수는 stack속에 데이터의 주소(참조값)가 들어있다.
		int n = 10;

		// *** new 가 붙으면 stack이 아니라 heap에 생성된다.
		// 배열 생성 시, int[3] 은 heap에 생긴다
		// int[3]의 배열명은 stack에 생성된다.

		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;

		int[] copy;

		// int[] = int[]
		// *** 배열 변수끼리의 복사는 주소값 복사다.
		copy = nums;

		// 원본 수정
		// *** nums와 copy는 같은 주소값을 가지고, 같은 배열을 가리킨다. > 둘 중 하나를 조작하면 나머지 배열도 영향을 받는다. >
		// Side Effect가 발생한다. > 조심!!
		nums[0] = 1000;

		System.out.println("nums[0]: " + nums[0]);
		System.out.println("copy[0]: " + copy[0]); // shallow copy
	}

	private static void m6() {

		// 배열의 길이는 런타임 때 정할 수도 있다.

		Scanner scan = new Scanner(System.in);

		System.out.print("학생 수: ");
		int count = scan.nextInt();

		int[] kors = new int[count];

		System.out.println(kors.length);

	}

	private static void m5() {

		// *** 메모리의 공간은 한 번 할당되면, 절대(100%)로 공간을 더 늘리거나 줄일 수 없다.

		int n; // 4byte

		// *** 배열은 처음부터 사용하는 최대 길이를 미리 예측해야한다. > 나중에 수정 물가능!

		int[] nums = new int[3]; // 4byte X 3 = 12byte

		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;

		// 갑자기 > 방이 하나 더 필요함!
//		nums[3] = 400;	//100% 불가능

	}

	private static void m4() {

		// 각 자료형

		// 정수 배열(byte, short, int, long)
		long[] list1 = new long[5];
		list1[0] = 100;
		System.out.println(list1[0]);

		// 실수 배열(float, double)
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);

		// 문자 배열(char)
		char[] list3 = new char[5];
		list3[0] = 'A';
		System.out.println(list3[0]);

		// 논리 배열(boolean)
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		System.out.println(list4[0]);

		// 참조형
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);

//		Calendar c1 = Calendar.getInstance();

		// 캘린더 x 5개 생성 > X
		// 캘린더 저장 변수 x 5개 생성 > O
		Calendar[] list6 = new Calendar[5];
		list6[0] = Calendar.getInstance();
		System.out.printf("%tF\n", list6[0]);

	}

	private static void m3() {

		int[] nums = new int[3];

		// 길이(방의 개수): 3
		// 인덱스(방 번호): 0 ~ 2, 0 ~ 길이-1
		// 방 1개(데이터): 요소(Element)

		// java.lang.ArrayIndexOutOfBoundsException:
		// Index 3 out of bounds for length 3
//		nums[0] = 100;
//		nums[1] = 200;
//		nums[2] = 300;
//		nums[3] = 400; 

		// 입력

		for (int i = 1; i <= 10; i++) { // 이렇게는 잘 안함

		}

		for (int i = 0; i < 10; i++) { // 잘 씀

		}

		// 배열의 방을 원하는 순서대로 접근 > 탐색 > for문
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}

		// 출력
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}

	}

	private static void m2() {

		// 요구사항] 학생 3명 > 국어 점수 > 총점, 평균(실수)
		// 추가사항] 학생 수 증가 > 300명

		// 배열 선언하기(생성하기)
		// - 자료형[] 배열명 = new 자료형[길이];

		int[] kors = new int[300]; // 생성 시 메모리 어딘가에 int[300]가 잡힌다. (연속된 int)
		// 시작되는 주소번지가 kors라는 변수에 들어있다.
		// int[]가 하나의 자료형이다.

		// 배열의 방 개수 == 배열의 길이
		System.out.println(kors.length);

		// int = int
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		// kors[3] = 80;
		// ...
		// kors[299] = 100;

//		int total = kors[0] + kors[1] + kors[2];

		int total = 0;

		for (int i = 0; i < kors.length; i++) {
			total += kors[i];
		}

		double avg = (double) total / kors.length;

		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);

	}

	private static void m1() {
		// 요구사항] 학생 3명 > 국어 점수 > 총점, 평균(실수)
		// 추가사항] 학생 수 증가 > 300명

		// 배열이 없을 때
		int kor1;
		int kor2;
		int kor3;
		// +297개 변수 추가 생성 (추가사항)

		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		// +297개 초기값 입력 (추가사항)

		int total = kor1 + kor2 + kor3; // + kor4 + kor5 + ... + kor300 (추가사항)

		double avg = total / 3.0; // 실수라서 3 아니고 3.0 | total이 int라 하나는 실수여야 함.
		// 3.0 > 300.0 (추가사항)

		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
	}
}
