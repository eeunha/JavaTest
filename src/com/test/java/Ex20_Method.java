package com.test.java;

public class Ex20_Method {

	public static void main(String[] args) {
		
		//Ex20_Method.java
		
		//메소드 인자 리스트
		//- 파라미터(Parameter)
		//- 인자(Arguments)
		//- 매개변수
		
		//요구사항] '홍길동'에게 인사를 하는 메소드를 구현하시오.
		//추가사항] '아무개'에게 인사를 하는 메소드를 구현하시오.
		//추가사항] '하하하'에게 인사를 하는 메소드를 구현하시오.
		//추가사항] 우리 강의실의 모든 사람마다 각각 메소드 x 25개
		//추가사항] 대한민국 모든 사람 x 5174만
		
		hello();
		hello2();
		hello3();
		
		//The method helloEveryOne(String)  is not applicable for the arguments ()
		
		helloEveryOne("홍길동");
		helloEveryOne("아무개");
		helloEveryOne("하하하");
		
		
		checkAge(25);
		checkAge(15);
		
		int age = 25;
		String result = age >= 19 ? "성인" : "미성년자";		
		System.out.printf("%d살은 %s입니다.\n", age, result);
		
		age = 15;
		result = age >= 19 ? "성인" : "미성년자";		
		System.out.printf("%d살은 %s입니다.\n", age, result);
		
		
		checkScore("홍길동", 100, 90, 80);
		checkScore("아무개", 50, 60, 70); //실인자
		//checkScore("하하", 50, 60);
		//checkScore("하하", 50, 60, 70, 80);
		
		
	}//main
	
	
	//가인자
	public static void checkScore(String name, int kor, int eng, int math) {
		
		//총점 > 250점 이상 합격
		int total = 0;
		
		total = kor + eng + math;
		
		String result = total >= 250 ? "합격" : "불합격";
		
		System.out.printf("%s 학생: %d점 = %s\n", name, total, result);
		
	}
	
	
	public static void checkAge(int age) {
		
		String result = age >= 19 ? "성인" : "미성년자";
		
		System.out.printf("%d살은 %s입니다.\n", age, result);		
	}
	
	
	public static void hello() {
		System.out.println("홍길동님 안녕하세요.");
	}
	
	public static void hello2() {
		System.out.println("아무개님 안녕하세요.");
	}
	
	public static void hello3() {
		System.out.println("하하하님 안녕하세요.");
	}
	
	public static void helloEveryOne(String name) {
		
		//String name = "홍길동";
		
		System.out.println(name + "님 안녕하세요.");
	}
	
}















