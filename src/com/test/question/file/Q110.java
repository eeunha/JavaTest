package com.test.question.file;

import java.io.File;
import java.util.Scanner;

/*
	23.08.07
	
	Q. 파일의 경로를 입력받아 파일 정보를 출력하시오
	
	조건..
파일 크기 단위 변환 출력(소수이하 1자리까지) : B, KB, MB, GB, TB


입력..
파일 경로 : D:\class\java\file\test.txt 

출력..
파일명 : test.txt 
종류 : txt 파일 
파일 크기 : 45B 


입력..
파일 경로 : C:\movie\SpriderMan.mp4 

출력..
파일명 : SpriderMan.mp4
종류 : mp4 파일 
파일 크기 : 2.54TB 

C:\class\code\java\file\데이터.txt
C:\class\dev\eclipse\eclipse.exe
*/
public class Q110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("파일 경로 : ");
		String path = scan.nextLine();

		File file = new File(path);

		if (!file.exists())
			return;

		int lastFileNameIndex = path.lastIndexOf("\\");
		int lastExtentionIndex = path.lastIndexOf(".");

		double fileLength = file.length();
		int fileChangeCount = 0;
		String[] units = { "B", "KB", "MB", "GB", "TB" };

		while (fileLength >= 1024) {
			fileChangeCount++;
			fileLength /= 1024;
		}

		System.out.println("파일명 : " + path.substring(lastFileNameIndex + 1));
		System.out.println("종류 : " + path.substring(lastExtentionIndex + 1) + " 파일");
		System.out.printf("파일 크기 : %.1f%s\n", fileLength, units[fileChangeCount]);
	}
}
