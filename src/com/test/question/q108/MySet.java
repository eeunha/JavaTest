package com.test.question.q108;

public class MySet {
	private String[] set;
	private int index;

	private int nextIndex;

	public MySet() {
		this.set = new String[4];
		this.index = -1;
		this.nextIndex = -1;
	}

	public boolean add(String value) {
		// set이 가득 찼을 경우
		if (checkLength()) {
			doubleLength();
		}

		// 값 중복 여부 확인

		for (int i = 0; i <= this.index; i++) {
			if (this.set[i].equals(value))
				return false;
		}

		// 중복이 아닌 경우

		this.index++;
		this.set[this.index] = value;

		return true;
	}

	private void doubleLength() {
		String[] temp = new String[this.set.length * 2];
		for (int i = 0; i <= this.index; i++) {
			temp[i] = this.set[i];
		}

		this.set = temp;
	}

	private boolean checkLength() {
		if (this.index == this.set.length - 1)
			return true;
		return false;
	}

	public int size() {
		return this.index + 1;
	}

	public boolean remove(String value) {
		// set이 비었을 경우
		if (this.index == -1)
			throw new IndexOutOfBoundsException();

		// set이 비지 않았을 경우
		// 뺄 값이 존재하나 확인

		for (int i = 0; i <= this.index; i++) {
			if (this.set[i].equals(value)) {
				for (int j = i; j <= this.index; j++) {
					this.set[i] = this.set[i + 1];
				}
				this.index--;
				return true;
			}
		}

		return false;
	}

	public boolean hasNext() {
		//set이 비어있을 경우
		if (this.index == -1) {
			return false;
		}
		
		//set이 비지 않았을 경우
		//hasNext()가 있는지 확인하기
		if (this.nextIndex > this.index) {
			return false;
		}

		return true;
	}

	public String next() {
		this.nextIndex++;
		if (this.nextIndex > this.index) {
			return "";
		}
		return this.set[this.nextIndex];
	}

	public void clear() {
		this.index = -1;
	}

}
