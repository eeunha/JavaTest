package com.test.java;

public class Ex07_Variable {
	public static void main(String[] args) {
		//Ex01_Varialble.java
		
		//숫자형 데이터 > 저장할 변수가 필요한 경우
		//- 수치로서의 데이터 > 산술 연산의 대상(O) > 더하기 빼기
		//- 수치가 아닌 데이터 > 산술 연산의 대상(X) > String
		
		//1. 몸무게 > O
		int weight;
		weight = 70;
		
		//2. 주민등록번호 앞자리(990718) > X
		int jumin;
		jumin = 990718;
		System.out.println("주민등록번호: " + jumin);
		
		jumin = 000717; //000718이면 오류 발생 -> 0으로 시작해서 8진수이기 때문
		System.out.println("주민등록번호: " + jumin);
		
		String jumin2;
		jumin2 = "000717";
		System.out.println(jumin2);
		
		//생긴건 숫자 > 실제로 숫자 취급X
		//- 주민등록번호
		//- 학번
		//- 전화번호
		
		
		//자바 기수 표시법
		//- 숫자 데이터 표기 > 3개의 기수법 지원
		//1. 10진수 > 10   > 
		//2.  8진수 > 010  > 8
		//3. 16진수 > 0x10 > 16
		//4.  2진수 > 지원 안함
		
		//기수 표현에 상관 없이 출력 > 10진수로 출력
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);
		
		
		
	}
}
