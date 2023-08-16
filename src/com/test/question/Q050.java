package com.test.question;

import java.util.Scanner;

public class Q050 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("행: ");
		int num = scan.nextInt();

//		for (int i = 1; i <= num; i++) {	// 행 수만큼 반복. i = 행의 수이자, 행에 넣을 *의 개수
//			for (int j = i; j < num; j++) { // 현재 행 번호 ~ (전체 행-1) 만큼 공백 출력
//				System.out.print(" ");
//			}
//			for (int j = num - i; j < num; j++) {	//(전체 행 - 현재 행) ~ (전체 행-1) 만큼 * 출력
//				System.out.print("*");
//			}
//			System.out.println();	//다음 줄로 이동
//		}
		
		for (int i = 0; i < num; i++) {	// 행 수만큼 반복. i = 행의 수이자, 행에 넣을 *의 개수
			for (int j = i; j < num - 1; j++) { // 현재 행 번호 ~ (전체 행-1) 만큼 공백 출력
				System.out.print(" ");
			}
			for (int j = num - i - 1; j < num; j++) {	//(전체 행 - 현재 행) ~ (전체 행-1) 만큼 * 출력
				System.out.print("*");
			}
			System.out.println();	//다음 줄로 이동
		}
		
		scan.close();
	}
}
