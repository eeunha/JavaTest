package com.test.question.file;

import java.io.File;

/*
  	23.08.08
  	
  	Q. 파일의 크기가 0byte인 파일만 삭제하시오.

리소스..
폴더 > 파일 제거
파일 다운로드

출력..
총 34개의 파일을 삭제했습니다.
 
 */
public class Q115 {
	public static void main(String[] args) {
		File dir = new File("C:\\class\\code\\java\\파일_디렉토리_문제\\파일 제거");
		File[] list = dir.listFiles();
		int count = 0;

		for (File f : list) {
			if (!f.isFile() || f.length() != 0)
				continue;

			f.delete();
			count++;
		}
		System.out.println("총 " + count + "개의 파일을 삭제했습니다.");
	}
}
