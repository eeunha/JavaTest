package com.test.java;

public class Ex15_Operator {

	public static void main(String[] args) {
		
		//Ex15_Operator.java
		
		/*
		 	연산자, Operator
		 	- 수학 연산자 > (대부분) > 프로그래밍 연산자
		 	- 피연산자를 대상으로 미리 정해진 행동(연산)을 한 후에 행동(연산)의 결과를 반환하는 요소.
		 	- 주로 기호를 많이 사용 + 단어도 많이 사용
		 	
		 	1. 문장, Statement
		 	2. 표현식, Expression
		 	3. 연산자, Operator
		 	4. 피연산자, Operand
		 	5. 연산자 우선 순위
		 	6. 연산자 연산 방향
		 	
		 	문장, Statement
		 	- 1개 이상의 표현식이 모여서 문장을 만든다.
		 	- int sum = 10 + 20;
		 	
		 	표현식, Expression
		 	- 문장을 구성하는 최소 단위 > 하나의 완성된 문장을 만들 수 있는 최소 표현.
		 	- int sum -> ; 찍으면 하나의 문장이 된다.
		 	- 10 + 20
		 	- sum = 30
		 	
		 	연산자, Operator
		 	- +
		 	- =
		 	
		 	피연산자, Operand
		 	- +: 10, 20
		 	- =: sum, 30
		 	
		 	연산자 우선 순위
		 	- 하나의 문장에 속해 있는 연산자들 중 누가 먼저 실행하는지에 대한 규칙
		 	- 1 + 2 * 3
		 	
		 	연산자 연산 방향
		 	- 하나의 문장에 속해 있는 연산자들 중 우선 순위가 동일하면 누가 먼저 실행하는지에 대한 규칙
		 	- 대부분: 왼쪽 > 오른쪽
		 	- 1 + 2 + 3
		 	
		 	
		 	연산자 종류
		 	1. 행동(목적)
		 		a. 산술 연산자
		 		b. 비교 연산자
		 		c. 논리 연산자
		 		d. 대입 연산자
		 		e. 증감 연산자
		 		f. 조건 연산자
		 		g. 비트 연산자
		 	
		 	2. 용법(피연산자 개수)
		 		a. 1항 연산자
		 		b. 2항 연산자
		 		c. 3항 연산자
		 	
		 	산술 연산자
		 	- +, -, *, /, %(mod, 나머지연산)
		 	- 2항 연산자 - 피연산자가 2개
		 	- 피연산자를 숫자형으로 가진다.(정수, 실수)
		 	
		 	
		 */
		
		int a = 10;
		int b = 3;
		
		System.out.printf("%d + %d = %d\n", a, b, a + b); //10 + 3 = 13
		System.out.printf("%d - %d = %d\n", a, b, a - b); //10 - 3 = 7
		System.out.printf("%d * %d = %d\n", a, b, a * b); // 10 * 3 = 30
		System.out.printf("%d / %d = %d\n", a, b, a / b); //10 / 3 = 3(몫)
//		System.out.printf("%d % %d = %d\n", a, b, a % b); //연산에는 문제가 없으나 오류 발생. %때문. -> %% 이렇게 사용.
		System.out.printf("%d %% %d = %d\n", a, b, a % b); //10 % 3 = 1
		
		double c = 10;
		double d = 3;
		System.out.printf("%f / %f = %f\n", c, d, c / d);
		
		System.out.println(10 / 3); //정수/정수 - int        = 정수 3
		System.out.println(10.0 / 3.0); //실수/실수 - double = 실수 3.333333333333333
		System.out.println(10.0 / 3); //실수/정수            = 실수 3.333333333333333
		System.out.println(10 / 3.0); //정수/실수            = 실수 3.333333333333333
		System.out.println();
		
		
//		System.out.println(100 / 0); //오류 발생 - / by zero
		System.out.println(100 / 0.0); //제수나 피제수를 실수로 만들면 오류 안난다. -> Infinity
		System.out.println(100.0 / 0);
		System.out.println(-100 / 0.0); //-Infinity
		System.out.println((100 / 0.0) + 10); //-> Infinity
		System.out.println((100 / 0.0) / 10); //-> Infinity
		
	}
}
