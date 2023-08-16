package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

//23.08.09
public class Ex69_LinkedList {
	public static void main(String[] args) {

		// Ex69_LinkedList.java

		// 물리 구조 + 인터페이스(사용법)
		// - Array + List
		// - Linked + List
		// - Hash + Map
		// - Tree + Map
		// - Hash + Set
		// - Tree + Set

		// ArrayList
		// - 모든 컬렉션 중에서 요소에 접근하는 속도가 가장 빠르다.
		// - 요소 삽입/삭제에 대한 비용이 많이 든다. > shift O

		// LinkedList
		// - 요소에 접근 속도가 상대적으로 느리다.
		// - 요소 삽입/삭제에 대한 비용이 거의 없다. > shift X

		// 면접 질문 - collection
		// list, map, set 특징
		// 내부구조 다른 클래스의 차이 말해봐라~

//		m1();
		m2();

	}// main

	private static void m2() {
		// 효율적으로 쓸 수 있는 것 골라 사용하기.
		// 보통은 배열을 사용한다.

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		long begin = 0, end = 0;

		// 순차적으로 데이터 추가하기, Append
		System.out.println("[순차적으로 데이터 추가하기, Append]");

		begin = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			list1.add(i); // 배열 끝에 추가하기
		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);

//
		begin = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			list2.add(i); // 배열 끝에 추가하기
		}

		end = System.currentTimeMillis();

		System.out.printf("LinkedList 작업 시간: %,dms\n\n", end - begin);

		//
		// 중간에 데이터 추가하기, 삽입(Insert)
		System.out.println("[중간에 데이터 추가하기, 삽입(Insert)]");
		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list1.add(0, i); // 삽입하기
		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin); // 중간에 끼워 넣는 건 비효율적이다.

		//
		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list2.add(0, i); // 삽입하기
		}

		end = System.currentTimeMillis();

		System.out.printf("LinkedList 작업 시간: %,dms\n\n", end - begin);

		//
		// 중간의 데이터 삭제하기 > Shift 발생
		System.out.println("[중간의 데이터 삭제하기 > Shift 발생]");
		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list1.remove(0);
		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);

		//
		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list2.remove(0);
		}

		end = System.currentTimeMillis();

		System.out.printf("LinkedList 작업 시간: %,dms\n\n", end - begin);

		//
		// 순차적으로 데이터 삭제하기
		System.out.println("[순차적으로 데이터 삭제하기]");
		begin = System.currentTimeMillis();

		for (int i = list1.size() - 1; i >= 0; i--) {
			list1.remove(i); // 끝 > 시작
		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);

		//
		begin = System.currentTimeMillis();

		for (int i = list2.size() - 1; i >= 0; i--) {
			list2.remove(i);
		}

		end = System.currentTimeMillis();

		System.out.printf("LinkedList 작업 시간: %,dms\n\n", end - begin);
	}

	private static void m1() {
		// Collection(I) > List(I) > ArrayList(C), LinkedList(C)

		// ArrayList vs LinkedList
		// - List > 구현 > 사용법이 아주 유사 > 개발자 경험
		// - 내부 구조가 다르다. > 사용 용도가 다르다.

		// LinkedList 종류
		// 1. LinkedList: 일방 통행
		// 2. Double LinkedList: 양방향 통행
		// 3. Double Circle LinkedList: 양방향 + 처음~끝 연결 > 자바의 LinkedList

		// => 배열의 접근 -> 시간 복잡도 : O(1) -> 배열의 시작 주소값과 인덱스를 이용한 단순 계산으로 한번에 주소를 찾아간다.

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		list1.add(10);
		list1.add(20);
		list1.add(30);

		list2.add(10);
		list2.add(20);
		list2.add(30);

		System.out.println(list1.size());
		System.out.println(list2.size());

		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));

		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));

//		list2.

	}// m1
}
