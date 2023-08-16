package com.test.java.obj.cast;

public class Ex56_Casting {
	public static void main(String[] args) {

		// Ex56_Casting.java

		// 프린터 기기 만들기
		// - LG500
		// - HP600

//		LG500 lg = new LG500();
//		HP600 hp = new HP600();

		// 용도는 같으나 사용법이 다름
//		lg.on();
//		hp.powerOn();
//
//		lg.print();
//		hp.printing();
//
//		lg.off();
//		hp.powerOff();

		LG500 lg = new LG500();
		HP600 hp = new HP600();

		lg.powerOn();
		hp.powerOn();

		lg.print();
		hp.print();

		lg.powerOff();
		hp.powerOff();

//		((HP600)p2).clean();

		// 상황] 프린터 판매 대리점 운영
		// - 재고
		////// - LG500 x 5대
		////// - HP600 x 3대
		// - 매일 업무
		////// - 프린터가 제대로 동작 > 기능 확인

//		m1();

		// 추가상황] LG500 x 500대, HP600 x 300대 (=> 배열 이용)
		m2();

		// 추가상황] BenQ700, Epson800 > 추가 브랜드(제품) (=> 형변환 이용)
		m3();
	}

	private static void m3() {

		// 업캐스팅 이용

		Printer[] ps = new Printer[8]; // 인터페이스 배열

		// *** 서로 다른 클래스의 객체를 하나의 배열에 넣기!!!
//		ps[0] = new LG500();
//		ps[1] = new HP600();

		for (int i = 0; i < ps.length; i++) {

			if (i < 5) {
				ps[i] = new LG500();
			} else {
				ps[i] = new HP600();
			}
		}

		// 업무
		for (int i = 0; i < ps.length; i++) {
			ps[i].print(); // => 다른 객체여도 인터페이스가 같아서 공통적인 메소드를 호출할 수 있다.

			// 추가 업무
			// - LG500 > selfTest()
			// - HP600 > clean()
			// => 부모 클래스 타입이라 자식 클래스에 선언된 두 메소드는 못부르는데?
			// => 다시 다운 캐스팅한다.

			// ps[i].?
			// 1.
////			(LG500)ps[i].selfTest(); // => 형변환보다 .이 먼저 실행됨. () 사용하기.
//			((LG500)ps[i]).selfTest(); // => hp를 lg로 변환할 수 없어서 그 때 오류가 발생한다.

			// 2.
//			if (i < 5) {
//				((LG500) ps[i]).selfTest();
//			} else {
//				((HP600) ps[i]).clean();
//			}

			// 3.
//			System.out.println(ps[i] instanceof LG500); // => 변수 instanceof 클래스

			if (ps[i] instanceof LG500) {
				((LG500) ps[i]).selfTest();
			} else if (ps[i] instanceof HP600) {
				((HP600) ps[i]).clean();
			}
		}
	}

	private static void m2() {

		LG500[] lg = new LG500[500];

		for (int i = 0; i < lg.length; i++) {
			lg[i] = new LG500();
		}

		HP600[] hp = new HP600[300];
		for (int i = 0; i < hp.length; i++) {
			hp[i] = new HP600();
		}

		// 업무
		for (int i = 0; i < lg.length; i++) {
			lg[i].print();
		}

		for (int i = 0; i < hp.length; i++) {
			hp[i].print();
		}
	}

	private static void m1() {
		System.out.println();
		// 가장 단순한 방법, 비효울적인 방법
		LG500 lg1 = new LG500();
		LG500 lg2 = new LG500();
		LG500 lg3 = new LG500();
		LG500 lg4 = new LG500();
		LG500 lg5 = new LG500();

		HP600 hp1 = new HP600();
		HP600 hp2 = new HP600();
		HP600 hp3 = new HP600();

		// 업무 > 개수가 늘어나면 이걸 반복해야함
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();

		hp1.print();
		hp2.print();
		hp3.print();

	}
}

interface Printer {
	void print();

	void powerOn();

	void powerOff();
}

class LG500 implements Printer {
	private String type;
	private int price;

	public void print() {
		System.out.printf("%s 방식으로 출력합니다.\n", this.type);
	}

//	public void on() {
//		System.out.println("프린터 전원을 켭니다.");
//	}
//
//	public void off() {
//		System.out.println("프린터 전원을 끕니다.");
//	}

	public void selfTest() {
		System.out.println("자가 점검을 합니다.");
	}

	@Override
	public void powerOn() {
		System.out.println("프린터 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("프린터 전원을 끕니다.");
	}
}

class HP600 implements Printer {
	private String color;
	private int price;

//	public void printing() {
//		System.out.println("출력합니다.");
//	}

	public void powerOn() {
		System.out.println("전원 켜짐");
	}

	public void powerOff() {
		System.out.println("전원 꺼짐");
	}

	public void clean() {
		System.out.println("헤더를 청소합니다.");
	}

	@Override
	public void print() {
		System.out.println("출력합니다.");
	}
}