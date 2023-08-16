package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q. 학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
 * 
 * 조건..
 * - 이름을 오름차순 정렬하시오.
 * */
public class Q062 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("학생 수: ");
		int n = scan.nextInt();
		scan.skip("\r\n");	// 다음 입력은 문자임으로 개행문자를 지워야 함.

		String[] names = new String[n]; // 학생명을 담은 배열 선언. 배열 크기는 입력받은 수 n이다.

		for (int i = 0; i < n; i++) {
			System.out.print("학생명: ");
			names[i] = scan.nextLine();
		}

		Arrays.sort(names);	// 오름차순 정렬

		System.out.println("입력한 학생은 총 " + n + "명입니다.");
		for (int i = 0; i < names.length; i++) {	//정렬된 배열 탐색
			System.out.printf("%d. %s\n", i + 1, names[i]);	// 맨 앞의 숫자는 i+1이다.
		}
		
		scan.close();
	}
}
