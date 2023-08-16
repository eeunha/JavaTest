package com.test.question.q105;

public class MyQueue {
	private String[] queue;
	private int index;

	public MyQueue() {
		this.queue = new String[4];
		this.index = -1;
	}

	public boolean add(String value) {
		// 큐가 꽉 찼을 경우
		if (checkLength()) {
			doubleQueue();
		}

		this.index++;
		this.queue[index] = value;

		return true;
	}

	private void doubleQueue() {
		String[] temp = new String[this.queue.length * 2];
		for (int i = 0; i <= this.index; i++) {
			temp[i] = this.queue[i];
		}
		this.queue = temp;
	}

	private boolean checkLength() {
		if (this.index == this.queue.length - 1) {
			return true;
		}
		return false;
	}

	public String poll() {
		// 큐가 비었을 경우
		if (this.index == -1) {
			throw new IndexOutOfBoundsException();
		}

		String value = this.queue[0];

		// Left Shift
		for (int i = 0; i <= this.index; i++) {
			this.queue[i] = this.queue[i + 1];
		}

		this.index--;

		return value;
	}

	public int size() {
		return this.index + 1;
	}

	public String peek() {
		// 큐가 비었을 경우
		if (this.index == -1) {
			throw new IndexOutOfBoundsException();
		}

		return this.queue[0];
	}

	public void clear() {
		this.index = -1;
	}

	public void trimToSize() {
		String[] temp = new String[this.index + 1];
		for (int i = 0; i <= this.index; i++) {
			temp[i] = this.queue[i];
		}
		this.queue = temp;
	}
}
