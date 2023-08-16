package com.test.java.obj.inheritance;

public class Ex53_interface {
	public static void main(String[] args) {

		// Ex53_interface.java

		MxKeys keyboard = new MxKeys();
		keyboard.powerOn();
		keyboard.keyDown('A');
		System.out.println(keyboard.checkBattery());
		keyboard.powerOff();

	}
}

//*** Keyboard는 객체를 생성할 수 없다. > 실체화할 수 없다.
interface Keyboard {

	// 키보드로서 갖추어야 할 행동들을 정의한다.(선언부만 작성, 구현부는 X) > 사용법
	// 반드시 public이어야 한다. 생략되어도 public이다.
	void keyDown(char c);

	void powerOn();

	void powerOff();

	int checkBattery();
//	static void aaa(); //static 불가.
}

class MxKeys implements Keyboard {

	@Override
	public void keyDown(char c) {
		// 구현? > 자기 맘대로~
		System.out.println(c + " 눌렀음");
	}

	@Override
	public void powerOn() {
		System.out.println("전원 켜짐");
	}

	@Override
	public void powerOff() {
		System.out.println("전원 꺼짐");
	}

	@Override
	public int checkBattery() {
		return 80;
	}

}
