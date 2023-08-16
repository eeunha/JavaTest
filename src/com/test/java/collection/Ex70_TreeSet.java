package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

//23.08.09
public class Ex70_TreeSet {
	public static void main(String[] args) {

		// Ex70_TreeSet.java

		// TreeSet
		// - Tree 구조 > 이진 트리 구조(이진 탐색 트리, Binary Search Tree)
		// - Set 사용법

		// Set
		// - 순서가 없다.
		// - 중복값을 가지지 않는다.

		int[] arr = { 5, 3, 7, 1, 2, 8, 9, 4, 6 };

		int[] tree = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			insert(arr[i], tree);
		}

		/*
		 * root = i; left = i*2+1 right = i*2+2
		 */

		// 현재 위치에 값이 없다면
		// 값 넣기

		// 현재 위치에 값이 있다면
		// 루트부터 넣을 값과 비교

		// 루트보다 작다면
		// 왼쪽으로 자리 이동

		// 루트보다 크다면
		// 오른쪽으로 자리 이동

		HashSet<Integer> set1 = new HashSet<>();
		TreeSet<Integer> set2 = new TreeSet<>();

		set1.add(10);
		set1.add(30);
		set1.add(40);
		set1.add(20);
		set1.add(50);

		set2.add(10);
		set2.add(30);
		set2.add(40);
		set2.add(20);
		set2.add(50);

		System.out.println(set1);
		System.out.println(set2); // 자동 정렬됨. 역순 정렬은 안된다.

		// 탐색 > for / iterator

		for (int n : set2) {
			System.out.println(n);
		}
		System.out.println();

		Iterator<Integer> iter = set2.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();

		// TreeSet 고유 기능
		System.out.println(set2.first()); // 시작
		System.out.println(set2.last()); // 끝

		System.out.println(set2.headSet(30)); // exclusive
		System.out.println(set2.tailSet(30)); // inclusive
		System.out.println(set2.subSet(20, 40)); // inclusive, exclusive
		System.out.println();

		HashSet<Integer> set3 = new HashSet<Integer>();
		set3.add(20);
		set3.add(50);
		set3.add(30);
		set3.add(10);
		set3.add(40);

		System.out.println(set3);

		ArrayList<Integer> list = new ArrayList<>(set3); // set을 arraylist로 만들 수 있다.
		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);

	}// main

	private static void insert(int i, int[] tree) {
		int index = 0;

	}
}
