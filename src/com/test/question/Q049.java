package com.test.question;

import java.util.Scanner;

/*
 	행: 5
 	별 개수 : 5 - 4 - 3 - 2 - 1
 	공백 개수 : 0 - 1 - 2 - 3 - 4 
 
 
 */
public class Q049 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("행: ");
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {	//행
			for (int j = 0; j < i; j++) { //열 - 공백
				System.out.print(" ");
			}
			for (int j = num - i; j > 0; j--) {	//열 - *
				System.out.print("*");
			}
			System.out.println();	//한 줄 띄우기
		}
		
		scan.close();
	}
}
