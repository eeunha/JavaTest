package com.test.java.obj;

//23.08.01
public class Ex41_Class {
	public static void main(String[] args) {

		// Ex41_Class.java

		// Pencil, PencilCase

		PencilCase pcase = new PencilCase();
		pcase.setColor("파란색");

//		for (int i = 0; i < 5; i++) {
//			Pencil p1 = new Pencil();
//			p1.setHardness("HB");
//			p1.setColor("검은색");
//
//			// [index] : 인덱서(Indexer) - 표기법
//			pcase.getPencil()[i] = p1; // 커서 올리고 f3 -> 해당 요소가 선언된 곳으로 커서 이동
//		}
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println(pcase.getPencil()[i].info());
//		}

		for (int i = 0; i < 5; i++) {
			Pencil p = new Pencil();
			p.setHardness("B");
			p.setColor("파란색");

			pcase.add(p);
		}

		Pencil p2 = pcase.get(2);

		System.out.println(pcase.info());

		
		//문자를 난수화
		String[] color = { "red", "blue", "yellow", "white", "pink", "purple", "green", "black" };

		// 색상 > 난수화 (X)
		// 방번호 > 난수 가능

		System.out.println(color[(int) (Math.random() * color.length)]);

	}
}
