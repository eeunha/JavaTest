package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

/*

2023.07.27

Q. 성적을 입력받아 아래와 같이 출력하시오.

조건
- String[][] score = new String[10][3];

입력
국어 점수: 80 
영어 점수: 50 
수학 점수: 70 

출력
 	 	 
 	 	 
■		
■		■
■		■
■	■	■
■	■	■
■	■	■
■	■	■
■	■	■
-----------
국어	영어	수학

*/
public class Q076 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] score = new String[10][3];	// 그래프가 들어갈 배열
		int[] scoresArr = new int[3]; // 입력받을 성적이 들어갈 배열

		System.out.print("국어 점수: ");
		scoresArr[0] = scan.nextInt();

		System.out.print("영어 점수: ");
		scoresArr[1] = scan.nextInt();

		System.out.print("수학 점수: ");
		scoresArr[2] = scan.nextInt();

		for (int i = 0; i < score[0].length; i++) { // 과목 개수 = 열 수 만큼 반복
			int curMaxRow = scoresArr[i] / 10; // 넣을 도형 개수 -> 10점 당 1개
			for (int j = 0; j < curMaxRow; j++) { // 0 ~ 도형 개수-1 만큼 넣기 
				score[j][i] = "■";
			}
			for(int j = curMaxRow; j < score.length; j++) {	// 빈 공간에는 공백문자 넣기
				score[j][i] = " ";
			}
		}

		for (int i = score.length - 1; i >= 0; i--) {	// 행을 아래에서 위로, 거꾸로 출력하기.
			for (int j = 0; j < score[0].length; j++) { // 열은 그대로 출력
				System.out.print(score[i][j]+"    ");
			}
			System.out.println();
		}

		System.out.println("------------");
		System.out.println("국어  영어  수학");
	}

}
