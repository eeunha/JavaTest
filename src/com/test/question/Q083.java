package com.test.question;

import java.util.Scanner;

/*

	2023.07.28	
	
	Q. 파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.
	
	조건
		확장자는 다음으로 제한한다.
		mp3
		jpg
		java
		hwp
		doc
		
	입력
		파일명: 인기가요.mp3 
		파일명: cat.jpg 
		파일명: Ex01.java 
		파일명: icon.jpg 
		파일명: 수업_정리.doc 
		파일명: Scanner.java 
		파일명: food.jpg 
		파일명: 공지사항.hwp 
		파일명: 이력서.hwp 
		파일명: 출금내역.doc 
	
	출력
		mp3 : 1개
		jpg : 3개
		java : 2개
		hwp : 2개
		doc : 2개
	
*/
public class Q083 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] extentions = { "mp3", "jpg", "java", "hwp", "doc" };
		int[] counts = new int[extentions.length];

		for (int i = 0; i < 10; i++) {
			System.out.print("파일명: ");
			String curFileName = scan.nextLine();

			// 파일명과 확장자 분리하기
			int curExtentionStartIndex = curFileName.lastIndexOf(".") + 1;
			String curExtention = curFileName.substring(curExtentionStartIndex);

			// 확장자 확인하기
			for (int j = 0; j < extentions.length; j++) {
				if (curExtention.equals(extentions[j])) { // 확장자가 일치하면
					counts[j] += 1;
				} else { // 확장자가 다르다면
					continue;
				}
			}
		}

		// 출력하기
		printExtentions(extentions, counts);

		scan.close();
	}

	private static void printExtentions(String[] extentions, int[] counts) {
		// 출력부
		for (int i = 0; i < extentions.length; i++) {
			System.out.println(extentions[i] + " : " + counts[i] + "개");
		}
	}
}
