package com.test.java;

public class Ex09_Output {
	public static void main(String[] args) {

		// Ex09_Output.java

		/*
		 * CLI > Command Line Interface > 텍스트 기반 명령 입출력 환경 GUI > Graphic User Interface
		 * > 화면 기반 입출력 환경
		 * 
		 * 콘솔 입출력, Console Input Output - 기본 입력 장치: 키보드 - 기본 출력 장치: 모니터
		 * 
		 * 콘솔 출력 - 클래스.필드.메소드(인자)
		 * 
		 * 1. System.out.println(값) - println 메소드 - print line - 값을 줄 단위로 출력한다. > 값을 출력한
		 * 뒤 엔터를 친다.
		 * 
		 * 2. System.out.print(값) - print 메소드 (기본형) - 값을 출력한다. > 아무것도 안한다.
		 * 
		 * 3. System.out.printf(값) - printf 메소드 - print format
		 * 
		 */

		System.out.println(10);
		System.out.println(3.0);
		System.out.println('A');
//		System.out.println("문자열");
//		System.out.println(true);

		System.out.print(10);
		System.out.print(3.14);
		System.out.print('A');

		System.out.println(); // 빈 줄
		System.out.println();
		System.out.println();

//		System.out.print(); // 얘는 안됨. 값이 없으면 아무것도 안함.

		// 성적표 출력하기
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;

		String name2 = "아무개";
		int kor2 = 85;
		int eng2 = 77;
		int math2 = 89;

		System.out.println("=============================");
		System.out.println("            성적표");
		System.out.println("=============================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1 + "\t");
		System.out.print(eng1 + "\t");
		System.out.print(math1 + "\r\n");
//		System.out.println();		

		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);

		System.out.println();

		// printf
		// - print format
		// - 형식 문자를 제공
		// - 편리, 가독성

		// 요구사항] "안녕하세요. 홍길동님" 문장을 출력하시오
		String name = "홍길동";
		System.out.println("안녕하세요. name님");
		System.out.println("안녕하세요. " + name + "님");
		System.out.printf("안녕하세요. %s님\n", name); // 전체 출력문을 확인할 수 있다.

		// 요구사항] "안녕하세요. 홍길동님. 안녕히 가세요. 홍길동님"
		System.out.println("안녕하세요. " + name + "님. 안녕히 가세요. " + name + "님");

		System.out.printf("안녕하세요. %s님. 안녕히 가세요. %s님\n", name, name);

		// 형식 문자
		// 1. %s > String
		// 2. %d > Decimal(모든 정수) > byte, short, int, long
		// 3. %f > Float(모든 실수) > float, double -> 소수 이하 6자리수 까지 출력됨.
		// 4. %c > Character
		// 5. %b > Boolean

		System.out.printf("저는 %s입니다. 나이는 %d살이구요. 키는 %fcm입니다. 혈액형은 %c형입니다. %b\n", "홍길동", 20, 175.3, 'O', true);

		// 형식 문자 > 확장 기능
		// 1. %숫자s, %숫자d, %숫자f, %숫자c, %숫자b
		// - 숫자가 출력할 너비를 지정한다.
		// - 탭문자와 유사한 역할
		// - (+): 우측 정렬
		// - (-): 좌측 정렬

		int num = 123;

		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n", num); // 숫자 앞에 공백이 7개 생겼다. -> 자릿수. 숫자포함 10칸 확보하고, 그 안에서 데이터를 출력해라.
		System.out.printf("[%-10d]\n", num); // 숫자 뒤로 7칸의 공백이 생김
		System.out.printf("[%3d]\n", 12345); // 그냥 자연스럽게 늘어남.

		// 2. %.숫자f
		// - 소수점 이하 자릿수 지정
		// - %f > 소수 이하 6자리 강제 출력

		double num2 = 3.15;
		System.out.printf("%f\n", num2);
		System.out.printf("%.2f\n", num2);
		System.out.printf("%.1f\n", num2); // 반올림 될 수 있다.
		System.out.printf("%.0f\n", num2);

		// 3. %,d, %,f
		// - 자릿수 표기(3자리)
		int price = 1234567;
		System.out.printf("금액: %d원\n", price);
		System.out.printf("금액: %,d원\n", price);
		
		//천단위 + 소수이하 2자리 + 전체너비(20자리 + 우측정렬)
		double num3 = 1234567.89012345;
		System.out.printf("[%,f]\n", num3);
		System.out.printf("[%,.2f]\n", num3); // ,가 맨 앞에
		System.out.printf("[%,20.2f]\n", num3); // ,가 맨 앞에, 너비, 소수점 순서. .과 ,도 포함해서 너비수 잰다.

		
		//카페 메뉴판 출력 > 열 정렬 > \t + 형식문자
		System.out.println("=======================");
		System.out.println("        음료 가격(단위:원)");
		System.out.println("=======================");
		
		//*** 숫자 출력 + 단위 표시
		System.out.printf("콜라:\t\t%,6d\n", 2500);
		System.out.printf("사이다:\t\t%,6d\n", 3500);
		System.out.printf("라떼:\t\t%,6d\n", 500);
		System.out.printf("아메리카노: \t%,d\n", 15000); // 가장 긴 숫자의 자리수에 맞춰 정렬한다.
		
		
		
	}
}
