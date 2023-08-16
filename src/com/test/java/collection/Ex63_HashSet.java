package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//23.08.07
public class Ex63_HashSet {
	public static void main(String[] args) {

		// Ex63_HashSet.java

		// 1. List
		// - 순서가 있는 데이터 집합
		// - 첨자(방번호)
		// - 데이터 중복을 허용

		// 2. Set
		// - 순서가 없는 데이터 집합
		// - 요소를 구분하는 식별자가 없다.
		// - 데이터 중복을 허용하지 않음

		// 3. Map
		// - 순서가 없는 데이터 집합
		// - 키 + 값

//		m1();
//		m2(); // Ctrl + 1로 메소드 만들기
		m3();
	}// main

	private static void m3() {

		HashSet<String> name = new HashSet<>();
		name.add("홍길동");
		name.add("홍길동");
		System.out.println(name);

		HashSet<Person> set = new HashSet<Person>();

		set.add(new Person("홍길동", 20));
		set.add(new Person("아무개", 25));
		set.add(new Person("이순신", 23));

		set.add(new Person("홍길동", 20)); // set > 중복값 배제 > 동명이인으로 본다.

		System.out.println(set);
		System.out.println();

		// p1과 p2를 같은 사람이라고 인식 > 수정 > 가끔식 구현
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);

		System.out.println(p1.equals(p2)); // 주소값 비교

		System.out.println("p1: " + p1.hashCode());
		System.out.println("p2: " + p2.hashCode());

		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 += "길동";

		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

	private static void m2() {

		// 중복값 제거 > 로또 번호 > 중복되지 않는 난수 생성

		// Case 1. ArrayList
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			int n = (int) (Math.random() * 45) + 1;
			boolean flag = false;

			for (int j = 0; j < i; j++) {
				if (lotto.get(j) == n) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				lotto.add(n);
			} else {
				i--;
			}
		}
		System.out.println(lotto);

		// Case 2. Set
		HashSet<Integer> lotto2 = new HashSet<Integer>();

		while (lotto2.size() < 6) {
			int n = (int) (Math.random() * 45) + 1;
			lotto2.add(n);
		}

		System.out.println(lotto2);

		// Set의 탐색
		for (int num : lotto2) {
			System.out.println(num);
		}

		System.out.println();

		// *** List, Set > Iterator 지원 > 탐색 도구
		Iterator<Integer> iter = lotto2.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
			int n = iter.next();
		}

// 		System.out.println(iter.hasNext()); // 요소 존재 유무
//		System.out.println(iter.next()); // 요소를 가져오기
//
//		System.out.println(iter.hasNext()); // 요소 존재 유무
//		System.out.println(iter.next()); // 요소를 가져오기
//		
//		System.out.println(iter.hasNext()); // 요소 존재 유무
//		System.out.println(iter.next()); // 요소를 가져오기
//		
//		System.out.println(iter.hasNext()); // 요소 존재 유무
//		System.out.println(iter.next()); // 요소를 가져오기
//		
//		System.out.println(iter.hasNext()); // 요소 존재 유무
//		System.out.println(iter.next()); // 요소를 가져오기
//		
//		System.out.println(iter.hasNext()); // 요소 존재 유무
//		System.out.println(iter.next()); // 요소를 가져오기

	}

	private static void m1() {
		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();

		list.add("강아지"); // 순서 존재.
		list.add("고양이");
		list.add("거북이");

		set.add("강아지"); // 순서 미존재. 뒤죽박죽
		set.add("고양이");
		set.add("거북이");

		System.out.println(list.size());
		System.out.println(set.size());

		// 모든 컬렉션은 toString()이 재정의 되어있어서 바로 이렇게 출력할 수 있다.
		System.out.println(list);
		System.out.println(set); // 둘이 출력 순서가 다르다.

		list.add("고양이"); // 중복 -> 순서가 있어서 구분할 수 있다.
		System.out.println(list);

		set.add("고양이"); // 중복값을 가질 수 없다.
		System.out.println(set);

		list.remove(1);
		list.remove("거북이");
		System.out.println(list);

		set.remove("거북이"); // 값으로만 제거 가능
		System.out.println(set);

		System.out.println(set.contains("고양이"));
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	// 값이 동일하면 객체가 동일하게 처리 (아래 두개 같이 하면 된다. 공식같음)
	// 1. hashCode() 오버라이드
	// 2. equals() 오버라이드

	@Override
	public int hashCode() { // 클래스 생성 시 사용되는 해시코드를 만드는 방법을 수정해 중복을 없앴다.

		// 원래 > 자신의 메모리 주소값 반환

		// p1 > "홍길동", 20 > "홍길동20" > 100번지
		// p2 > "아무개", 25 > "아무개25" > 200번지
		// p3 > "홍길동", 20 > "홍길동20" > 100번지

		return (this.name + this.age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		// p1.equals(p2)

		return this.hashCode() == obj.hashCode();
	}
}