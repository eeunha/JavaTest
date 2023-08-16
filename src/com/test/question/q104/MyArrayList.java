package com.test.question.q104;

import java.util.Arrays;

public class MyArrayList {
	private String[] list;

	// 1. 현재 요소를 대입할 방번호
	// 2. 현재까지 대입된 요소의 개수
	private int index;

	public MyArrayList() {
		this.list = new String[4];
		this.index = -1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("length: %d\n", this.list.length));
		sb.append(String.format("index: %d\n", this.index));
		sb.append(Arrays.toString(this.list) + "\n");

		return sb.toString();
	}

	// 개발할 때(클래스 설계 시) 유용하게 사용 > toString()
	public boolean add(String value) {

		if (checkLength()) {
			doubleList();
		}

		this.index++;
		this.list[this.index] = value;

		return true;
	}

	private void doubleList() {
		String[] temp = new String[this.list.length * 2];

		// deep copy
		for (int i = 0; i < this.list.length; i++) { // 루프 > 짧은 배열 길이
			temp[i] = this.list[i];
		}

		this.list = temp; // 배열 교체
	}

	private boolean checkLength() {
		if (this.list.length == this.index + 1) {
			return true;
		}
		return false;
	}

	public String get(int index) {
		if (this.index < index || index < 0) {
			// 없는 방번호를 요청 > IndexOutOfBoundException 발생
			throw new IndexOutOfBoundsException();
		}

		return this.list[index];
	}

	public int size() {
		return this.index + 1;
	}

	public String set(int index, String value) {
		if (this.index < index || index < 0) {
			// 없는 방번호를 요청 > IndexOutOfBoundException 발생
			throw new IndexOutOfBoundsException();
		}

		String before = this.list[index];

		this.list[index] = value;

		return before;
	}

	public String remove(int index) {
		if (this.index < index || index < 0) {
			// 없는 방번호를 요청 > IndexOutOfBoundException 발생
			throw new IndexOutOfBoundsException();
		}

		String removedValue = this.list[index];

		// 요소 삭제 > 우측의 모든 요소 > 왼쪽으로 1칸 이동 > Left Shift
		for (int i = index; i <= this.index; i++) {
			this.list[i] = this.list[i + 1];
		}

		this.index--;

		return removedValue;
	}

	public boolean add(int index, String value) {
		if (this.index < index || index < 0) {
			// 없는 방번호를 요청 > IndexOutOfBoundException 발생
			throw new IndexOutOfBoundsException();
		}

		if (checkLength()) {
			doubleList();
		}

		this.index++;

		// 요소 삽입 > 우측의 모든 요소 > 오른쪽으로 1칸 이동 > Right Shift
		for (int i = this.index; i > index; i--) {
			this.list[i] = this.list[i - 1];
		}
		this.list[index] = value;

		return true;
	}

	public int indexOf(String value) {
		for (int i = 0; i <= this.index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}

		// 없으면 -1
		return -1;
	}

	public int indexOf(String value, int beginIndex) {
		for (int i = beginIndex; i <= this.index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}

		// 없으면 -1
		return -1;
	}

	public int lastIndexOf(String value) {
		for (int i = this.index; i >= 0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}

		// 없으면 -1
		return -1;
	}

	public int lastIndexOf(String value, int beginIndex) {
		for (int i = beginIndex; i >= 0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}

		// 없으면 -1
		return -1;
	}

	public void clear() {
//		for (int i = 0; i <= this.index; i++) {
//			this.list[i] = null;
//		}
//		this.index = -1;

//		this.list = new String[4]; // 새로운 배열 교체
//		this.index = -1;

		this.index = -1; // 제일 효율적이다.
	}

	public void trimToSize() {
		String[] temp = new String[this.index + 1];

		for (int i = 0; i <= this.index; i++) {
			temp[i] = this.list[i];
		}

		this.list = temp;
	}

	public boolean contains(String string) {
		for (int i = 0; i <= this.index; i++) {
			if (this.list[i].equals(string)) {
				return true;
			}
		}
		return false;
	}
}
