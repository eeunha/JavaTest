package com.test.question.file;

import java.io.File;

//23.08.08
public class Q119_2 {
	public static void main(String[] args) {
		String path = "C:\\class\\code\\java\\파일_디렉토리_문제\\직원";
		File dir = new File(path);

		if (!dir.exists())
			return;

		File[] list = dir.listFiles();

		// 해당 폴더 읽기
		for (File f : list) {
			String[] temp = f.getName().split("_{1,2}"); // _가 1개 또는 2개

			// 직원 이름 폴더 생성
			File newDir = new File(path + "\\" + temp[0]);
			newDir.mkdir();

			// 년도 폴더 생성
			newDir = new File(newDir.getAbsoluteFile() + "\\" + temp[1]);
			newDir.mkdir();

			// 파일 이동
			newDir = new File(newDir.getAbsoluteFile() + "\\" + temp[2]);
			f.renameTo(newDir);
		}
		System.out.println("분류가 완료되었습니다.");
	}
}
