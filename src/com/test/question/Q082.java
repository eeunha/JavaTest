package com.test.question;

import java.util.Scanner;

/*

 	2023.07.28
 	
 	Q. 숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
 	
 	입력
 		숫자: 314
 		
 	출력
 		결과: 3 + 1 + 4 = 8
 
 
 	문자열 입력받기
 	입력받은 문자열을 한 자리씩 보기 -> substring으로 한 자리 문자열로 자르기 -> 계산하려고 int로 바꾸기
 	각 자리를 더해가기
 	결과 출력하기
 */
public class Q082 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자: ");
		String num = scan.nextLine();

		int sum = 0;

		System.out.print("결과: ");

		for (int i = 0; i < num.length(); i++) {
			int curN = Integer.parseInt(num.substring(i, i + 1));
			sum += curN;
			System.out.print(curN + " ");
			
			if (i == num.length() - 1) {	// 마지막에만 + 아닌 "= 합" 출력
				System.out.print("= " + sum);
				break;
			}
			
			System.out.print("+ ");
		}

		scan.close();
	}
}
