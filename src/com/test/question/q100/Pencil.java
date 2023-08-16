package com.test.question.q100;

public class Pencil {
	private String hardness;

	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		this.hardness = hardness;
	}

	public String info() {
		return "pencil hardness: " + this.hardness;
	}
}
