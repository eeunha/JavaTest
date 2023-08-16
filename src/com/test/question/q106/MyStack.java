package com.test.question.q106;

public class MyStack {
	private String[] stack;
	private int index;

	public MyStack() {
		this.stack = new String[4];
		this.index = -1;
	}
	
	@Override
	public String toString() {
		return String.format("this.index: %d\n", this.index);
	}

	public boolean push(String value) {
		if (this.index == this.stack.length - 1) {
			doubleSizing();
		}
		
		this.index++;

		this.stack[this.index] = value;

		return true;
	}

	private void doubleSizing() {
		String[] temp = new String[this.stack.length * 2];
		for (int i = 0; i < this.stack.length; i++) {
			temp[i] = this.stack[i];
		}
		this.stack = temp;
	}

	public String pop() {
		if (this.index == -1)
			throw new IndexOutOfBoundsException();

		String value = this.stack[this.index];
		this.index--;

		return value;
	}

	public int size() {
		return this.index + 1;
	}

	public String peek() {
		if (this.index == -1)
			throw new IndexOutOfBoundsException();

		return this.stack[this.index];
	}

	public void clear() {
		this.index = -1;
	}

	public void trimToSize() {
		String[] temp = new String[this.index + 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = this.stack[i];
		}
		this.stack = temp;
	}

}
