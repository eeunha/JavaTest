package com.test.question.q100;

public class Ruler {

	private int length;
	private String shape;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String info() {
		return "ruler length: " + this.length + ", shape: " + this.shape;
	}
}
