package com.test.question.q107;

public class MyHashMap {
	private String[] keys;
	private String[] values;
	private int index = -1;

	public MyHashMap() {
		this.keys = new String[4];
		this.values = new String[4];
		this.index = -1;
	}

	public String put(String key, String value) {
		// 키와 값을 추가한다.
		// 키에 맞는 값을 변경한다 -> 키의 유무 확인

		if (checkLength()) {
			doubleLength();
		}

		// 지금 넣을 키가 존재하는가?
		int foundIndex = findSameKey(key);

		if (foundIndex != -1) { // 있다면
			String beforeValue = this.values[foundIndex];
			this.values[foundIndex] = value;
			return beforeValue;
		}

		// 같은 키가 없다면? -> 바로 삽입
		this.index++;
		this.keys[this.index] = key;
		this.values[this.index] = value;

		return null;
	}

	private void doubleLength() {
		String[] tempK = new String[this.keys.length * 2];
		String[] tempV = new String[this.values.length * 2];

		for (int i = 0; i < this.keys.length; i++) {
			tempK[i] = this.keys[i];
			tempV[i] = this.values[i];
		}

		this.keys = tempK;
		this.values = tempV;
	}

	private boolean checkLength() {
		if (this.index == this.keys.length - 1) {
			return true;
		}
		return false;
	}

	public String get(String key) {
		// map이 빈 경우
		if (this.index == -1)
			throw new IndexOutOfBoundsException();

		// map에 값이 있는 경우

		int foundIndex = findSameKey(key);

		// 해당 값이 있는가?
		if (foundIndex != -1) { // 있다면
			return this.values[foundIndex];
		}

		// 값이 없다면?
		return null;
	}

	public int size() {
		return this.index + 1;
	}

	public String remove(String key) {
		// map이 비어있을 경우
		if (this.index == -1)
			throw new IndexOutOfBoundsException();

		String deletedValue = "";

		// map이 비지 않았을 경우

		int foundIndex = findSameKey(key);

		// 해당 값이 있는가?
		if (foundIndex == -1) { // 없다면
			return null;
		}

		// 있다면 > Left Shift
		deletedValue = this.values[foundIndex];

		for (int i = foundIndex; i <= this.index; i++) {
			this.keys[i] = this.keys[i + 1];
			this.values[i] = this.values[i + 1];
		}

		this.index--;

		return deletedValue;
	}

	public int findSameKey(String key) {
		for (int i = 0; i <= this.index; i++) {
			if (this.keys[i].equals(key))
				return i;
		}
		return -1;
	}

	public boolean containsKey(String key) {
		for (int i = 0; i <= this.index; i++) {
			if (this.keys[i].equals(key))
				return true;
		}

		return false;
	}

	public boolean containsValue(String value) {
		for (int i = 0; i <= this.index; i++) {
			if (this.values[i].equals(value))
				return true;
		}
		return false;
	}

	public void clear() {
		this.index = -1;
	}

}
