package com.test.question.q101;

public class Barista {
	public Espresso makeEspresso(int bean) {
		Espresso e = new Espresso(bean);

		Coffee.countCoffee(e);

		return e;
	}

	public Espresso[] makeEspressoes(int bean, int count) {
		Espresso[] eArr = new Espresso[count];

		// add
		for (int i = 0; i < count; i++) {
			Espresso e = new Espresso(bean);
			eArr[i] = e;
			Coffee.countCoffee(e);
		}

		return eArr;
	}

	public Latte makeLatte(int bean, int milk) {
		Latte l = new Latte(bean, milk);

		Coffee.countCoffee(l);

		return l;
	}

	public Latte[] makeLattes(int bean, int milk, int count) {
		Latte[] lArr = new Latte[count];

		// add
		for (int i = 0; i < count; i++) {
			Latte l = new Latte(bean, milk);
			lArr[i] = l;
			Coffee.countCoffee(l);
		}

		return lArr;
	}

	public Americano makeAmericano(int bean, int water, int ice) {
		Americano a = new Americano(bean, water, ice);

		Coffee.countCoffee(a);

		return a;
	}

	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		Americano[] aArr = new Americano[count];
		// add
		for (int i = 0; i < count; i++) {
			Americano a = new Americano(bean, water, ice);
			aArr[i] = a;
			Coffee.countCoffee(a);
		}
		return aArr;
	}

	public void result() {
		// 판매 결과 출력
		System.out.println("\n=================================");
		System.out.println("판매 결과");
		System.out.println("=================================");
		System.out.println("\n---------------------------------");
		System.out.println("음료 판매량");
		System.out.println("---------------------------------");
		System.out.println("에스프레소 : " + Coffee.getEspresso() + "잔");
		System.out.println("아메리카노 : " + Coffee.getAmericano() + "잔");
		System.out.println("라테 : " + Coffee.getLatte() + "잔");

		System.out.println("\n---------------------------------");
		System.out.println("원자재 소비량");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,dg\n", Coffee.getBean());
		System.out.printf("물 : %,dml\n", Coffee.getWater());
		System.out.printf("얼음 : %,d개\n", Coffee.getIce());
		System.out.printf("우유 : %,dml\n", Coffee.getMilk());

		System.out.println("\n---------------------------------");
		System.out.println("매출액");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,d원\n", Coffee.getBeanTotalPrice());
		System.out.printf("물 : %,.0f원\n", Coffee.getWaterTotalPrice());
		System.out.printf("얼음 : %,d원\n", Coffee.getIceTotalPrice());
		System.out.printf("우유 : %,d원\n", Coffee.getMilkTotalPrice());

	}
}
