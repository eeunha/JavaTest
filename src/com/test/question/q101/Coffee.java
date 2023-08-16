package com.test.question.q101;

/*
	static -> 인스턴스를 생성하지 않고 변수와 메소드를 바로 사용하기 위하여 쓴다.
	여기서 멤버 변수에 private을 붙인 이유는, 
	인스턴스 생성 없이 바로 접근하면 좋지만, 밖에서 마음대로 값을 조작할 수 있기 때문에 위험하다.
	그래서 private을 설정하고 getter와 setter를 설정하여 값을 가져오고 설정하게 만들었다.
	
	멤버 변수를 생성한 뒤 값을 설정하려면
	처음부터 값을 넣지 않고 생성자를 통하여 초기값을 설정해주자.
*/
public class Coffee {
	private static int bean;
	private static int water;
	private static int ice;
	private static int milk;
	private static int beanUnitPrice;
	private static double waterUnitPrice;
	private static int iceUnitPrice;
	private static int milkUnitPrice;
	private static int beanTotalPrice;
	private static double waterTotalPrice;
	private static int iceTotalPrice;
	private static int milkTotalPrice;
	private static int espresso;
	private static int latte;
	private static int americano;

	static { // Coffee(){ 가 아니다.
		Coffee.bean = 0;
		Coffee.water = 0;
		Coffee.ice = 0;
		Coffee.milk = 0;

		Coffee.beanUnitPrice = 1;
		Coffee.waterUnitPrice = 0.2;
		Coffee.iceUnitPrice = 3;
		Coffee.milkUnitPrice = 4;

		Coffee.beanTotalPrice = 0;
		Coffee.waterTotalPrice = 0;
		Coffee.iceTotalPrice = 0;
		Coffee.milkTotalPrice = 0;

		Coffee.americano = 0;
		Coffee.latte = 0;
		Coffee.espresso = 0;
	}

	public static int getBean() {
		return bean;
	}

	public static int getWater() {
		return water;
	}

	public static int getIce() {
		return ice;
	}

	public static int getMilk() {
		return milk;
	}

	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}

	public static double getWaterUnitPrice() {
		return waterUnitPrice;
	}

	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}

	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}

	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}

	public static double getWaterTotalPrice() {
		return waterTotalPrice;
	}

	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}

	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}

	public static int getAmericano() {
		return americano;
	}

	public static int getLatte() {
		return latte;
	}

	public static int getEspresso() {
		return espresso;
	}

	public static void countCoffee(Espresso espresso) {
		Coffee.espresso++; // 에스프레소 주문수 증가
		Coffee.bean += espresso.getBean(); // 빈 총량 증가
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * espresso.getBean(); // 빈 총 가격 증가
	}

	public static void countCoffee(Latte latte) {
		Coffee.latte++; // 라떼 개수 증가

		Coffee.bean += latte.getBean(); // 빈 총량 증가
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * latte.getBean(); // 총 가격 증가

		Coffee.milk += latte.getMilk(); // 우유 총량 증가
		Coffee.milkTotalPrice += Coffee.milkUnitPrice * latte.getMilk(); // 우유 총 가격 증가
	}

	public static void countCoffee(Americano americano) {
		Coffee.americano++; // 아메리카노 개수 증가

		Coffee.bean += americano.getBean(); // 빈 총량 증가
		Coffee.water += americano.getWater(); // 물 총량 증가
		Coffee.ice += americano.getIce(); // 얼음 총량 증가

		Coffee.beanTotalPrice += Coffee.beanUnitPrice * americano.getBean(); // 빈 총 가격 증가
//		System.out.println("Coffee.beanTotalPrice: " + Coffee.beanTotalPrice);
		Coffee.waterTotalPrice += Coffee.waterUnitPrice * americano.getWater(); // 물 총 가격 증가
		Coffee.iceTotalPrice += Coffee.iceUnitPrice * americano.getIce(); // 얼음 총 가격 증가

	}
}
