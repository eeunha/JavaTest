package com.test.question.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

/*
	23.08.08
	
	Q. 모든 괄호가 서로 짝이 맞는지 검사하시오.

조건..
대상 괄호: (), {}
Stack 사용

리소스..
파일 > 괄호.dat
파일 다운로드

출력..
올바른 소스입니다.

출력..
올바르지 않은 소스입니다.

*/
public class Q125 {
	public static void main(String[] args) {
		try {
//			BufferedReader reader = new BufferedReader(
//					new FileReader("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\Ex32_Array.java"));
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\파일_입출력_문제\\괄호.java"));

			int c = -1;
			Stack<Character> stack = new Stack<>();

			while ((c = reader.read()) != -1) {
				if ((char) c == '(' || (char) c == '{') {
					stack.push((char) c);
				} else if ((char) c == ')' || (char) c == '}') {
					if (isPair(stack, (char) c)) {
						stack.pop();
					} else {
						System.out.println("올바르지 않은 소스입니다.");
						reader.close();
						return;
					}
				}
			}

			reader.close();

			if (!stack.isEmpty()) {
				System.out.println("올바르지 않은 소스입니다.");
				return;
			}

			System.out.println("올바른 소스입니다.");

		} catch (Exception e) {
			System.out.println("at Q125.main");
			e.printStackTrace();
		}
	}

	private static boolean isPair(Stack<Character> stack, char c) {
		if (stack.isEmpty()) {
			return false;
		}

		char peek = stack.peek();

		if ((c == ')' && peek == '(') || (c == '}' && peek == '{')) {
			return true;
		}

		return false;
	}
}
