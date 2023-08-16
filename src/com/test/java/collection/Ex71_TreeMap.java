package com.test.java.collection;

import java.util.TreeMap;
import java.util.Vector;

public class Ex71_TreeMap {
	public static void main(String[] args) {
		// Ex72_TreeMap.java

		// TreeMap
		// - Tree > 이진 탐색 트리 > 자동 정렬
		// - Map > 키 + 값 > 연관 배열

		TreeMap<String, String> map = new TreeMap<>();

		map.put("white", "흰색");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		map.put("orange", "주황");
		map.put("green", "초록");

		System.out.println(map.size());

		System.out.println(map); // key 정렬

		System.out.println(map.get("green"));

		map.put("green", "녹색");

		System.out.println(map);

		System.out.println(map.firstKey());
		System.out.println(map.lastKey());

		System.out.println(map.headMap("m"));
		System.out.println(map.tailMap("m"));
		System.out.println(map.subMap("r", "y"));

		// 거의 ArrayList랑 비슷함.
		Vector<Integer> list = new Vector<Integer>();

		list.add(10);
		System.out.println(list.get(0));

		// List
		// - ArrayList > 배열이 필요할 때 / 삽입, 삭제(X) *****
		// - LinkedList > ArrayList 대체제 / 삽입, 삭제(O)
		// - Stack > 스택 구조 필요
		// - Queue > 큐 구조 필요
		// - Vector => ArrayList와 거의 비슷하나 잘 안씀. Thread 부분에서 조금 다르다.

		// Set (근데 정렬 거의 안씀)
		// - HashSet > 중복값 배제, 유일한 집합 *****
		// - TreeSet > HashSet + 정렬

		// Map (근데 정렬 거의 안씀)
		// - HashMap > 키/값 연관 배열이 필요할 때 *****
		// - TreeMap > HashMap + 정렬
		// - HashTable => HashMap과 거의 비슷하나 잘 안씀. Thread 부분에서 조금 다르다.

		// - Properties > JSON, XML => 잘 안씀.

	}// main
}
