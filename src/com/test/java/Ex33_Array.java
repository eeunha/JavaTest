package com.test.java;

public class Ex33_Array {
	public static void main(String[] args) {

		// Ex33_Array.java

		// 다차원 배열

//		m1();
//		m2();
//		m3();
//		m4();
		m5();

	}// main

	private static void m5() {

		// 문제 설명
		// - 5x5 2차원 배열

//		int[] n1;
//		int n2[];	// 앞에 붙이는 버릇을 들이자. 안되는 경우도 있다.

		int[][] nums = new int[5][5];

		// 데이터 입력 > 문제
		int n = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				nums[i][j] = n;
				n++;
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

	private static void m4() {

		String[] member = { "홍길동", "임꺽정", "성춘향", "강호동", "정형돈", "김국진", "노홍철", "하하", "유재석", "박명수" };

		String name = "강호동";

		// 1. 배열 > 원하는 데이터 존재하는지 검색 > 있다 or 없다
		if (contains(member, name)) { // 이 함수명 잘 쓴다.
			System.out.println(name + " 발견!");
		} else {
			System.out.println(name + " 없음!");
		}

		// 2. 배열 > 원하는 데이터 존재하는지 검색 > 몇번째 방에 있는지? > 방번호
		int index = indexOf(member, name); // 이 함수명 잘 쓴다.
		System.out.println(index);
	}

	private static int indexOf(String[] member, String name) {
		for (int i = 0; i < member.length; i++) {
			if (member[i].equals(name))
				return i;
		}
		return -1;
	}

	private static boolean contains(String[] member, String name) {
		for (int i = 0; i < member.length; i++) {
			if (member[i].equals(name))
				return true;
		}

		return false;
	}

	private static void m3() {

		int[] nums1 = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		System.out.println();

		int[][] nums2 = { { 10, 20, 30, 35 }, { 40, 50, 60, 35 } };

		System.out.println(nums2.length); // 2?? -> nums2 안에 들어있는 일차원 배열의 개수다.

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(nums2[i][j]);
			}
		}
		System.out.println();

	}

	private static void m2() {

		// 다차원 초기화 리스트
		int[] nums1 = new int[] { 10, 20, 30 }; // 잘 안씀
//		int[] nums1;
//		nums1 = new int[] { 10, 20, 30 };

		int[] nums2 = { 10, 20, 30 };
//		int[] nums2;
//		nums2 = { 10, 20, 30 }; // 불가능

		int[][] nums3 = new int[2][3];
		int[][] nums4 = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };
		int[][] nums5 = { { 10, 20, 30 }, { 40, 50, 60 } };

		int[][][] nums6 = new int[2][2][3];
		int[][][] nums7 = new int[][][] { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 10, 20, 30 }, { 40, 50, 60 } } };
		int[][][] nums8 = { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 10, 20, 30 }, { 40, 50, 60 } } };

		// 블럭 단위로 엔터 쳐서 가독성 있게 보기
		int[][][] nums9 = { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 10, 20, 30 }, { 40, 50, 60 } } };

	}

	private static void m1() {

		// 1차원 배열
		int[] nums1 = new int[3];

		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;

		for (int i = 0; i < 3; i++) {
			System.out.printf("nums1[%d] = %d\n", i, nums1[i]);
		}
		System.out.println();
		System.out.println();

		// 2차원 배열
		int[][] nums2 = new int[2][3]; // 2(2차원, 행), 3(1차원, 열)

		nums2[0][0] = 100;
		nums2[0][1] = 200;
		nums2[0][2] = 300;
		nums2[1][0] = 400;
		nums2[1][1] = 500;
		nums2[1][2] = 600;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("nums2[%d][%d] = %d\n", i, j, nums2[i][j]);
			}
		}
		System.out.println();
		System.out.println();

		// 3차원 배열
		int[][][] nums3 = new int[2][2][3]; // 2(3차원, 동, 면), 2(2차원, 층, 행), 3(1차원, 호, 열)

		nums3[0][0][0] = 100;
		nums3[0][0][1] = 200;
		nums3[0][0][2] = 300;

		nums3[0][1][0] = 400;
		nums3[0][1][1] = 500;
		nums3[0][1][2] = 600;

		nums3[1][0][0] = 700;
		nums3[1][0][1] = 800;
		nums3[1][0][2] = 900;

		nums3[1][1][0] = 1000;
		nums3[1][1][1] = 1100;
		nums3[1][1][2] = 1200;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.printf("nums3[%d][%d][%d] = %d\n", i, j, k, nums3[i][j][k]);
				}
			}
		}

	}
}
