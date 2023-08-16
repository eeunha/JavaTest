package com.test.question.file;

import java.io.File;
import java.util.Scanner;

/*
	23.08.08
	
	Q. 지정한 폴더의 특정 파일(확장자)만을 출력하시오.
	
	조건..
확장자 대소문자 구분없이 검색 가능


입력..
폴더: C:\class\eclipse 

확장자: exe 

출력..
eclipse.exe 
eclipsec.exe


입력..
폴더: C:\class\eclipse 

확장자: xml 

출력..
artifacts.xml
구글.XML

*/
public class Q111 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("폴더 : ");
		String path = scan.nextLine();

		System.out.print("확장자 : ");
		String ext = scan.nextLine();

		File dir = new File(path);

		if (dir.exists()) {
			File[] list = dir.listFiles();

			for (File f : list) {
				if (f.isFile()) {
					String fName = f.getName();
					if (fName.endsWith(ext)) {
						System.out.println(fName);
					}
				}
			}
		}

	}
}
