package com.test.question;

/*
 * Q. int 배열을 매개변수로 받아 내용을 문자열로 반환하는 dump 메소드를 구현하시오.
 * 
 * 조건
 * - String dump(int[] list)
 * 
 * */
public class Q063 {
	public static void main(String[] args) {
		int[] list = new int[4];

		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;

		String result = dump(list);
		System.out.printf("nums = %s\n", result);
	}

	private static String dump(int[] list) {	// 입력된 배열을 출력하는 dump 메소드 만들기
		String result = "[ ";

		for (int i = 0; i < list.length; i++) {
//			result += list[i] + "";	// 공백 안더해도 됨. 어차피 문자열에 더하는거니까 문자열이 된다.
			result += list[i];
			if (i != list.length - 1) {	//마지막이 아닐 때만 ,를 붙인다.
				result += ", ";
			}
		}

		return result + " ]";
	}
}
