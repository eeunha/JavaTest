package com.test.question.q101;

public class Espresso {
	private int bean;

	public Espresso(int bean) {
		this.bean = bean;
	}

	void drink() {
		System.out.println("원두 " + this.bean + "g으로 만들어진 에스프레소를 마십니다.");
	}

	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}
}
