package com.test.question.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
	23.08.08
	
	Q. 특정 이름을 찾아 다른 이름으로 변환 후 파일을 다른 이름으로 저장하시오.

조건..
'유재석' → '메뚜기'
저장할 파일명: 이름수정_변환.dat


리소스..
파일 > 이름수정.dat
파일 다운로드


출력..
변환 후 다른 이름으로 저장하였습니다.

*/
public class Q120 {
	public static void main(String[] args) {
		// 한줄씩 읽기
		// 해당 줄에 유재석을 메뚜기로 변경하기 -> replace
		// 파일명 변경하기 - 이름수정_변환.dat

		try {
			String path = "C:\\class\\code\\java\\파일_입출력_문제";
			BufferedReader reader = new BufferedReader(new FileReader(path + "\\이름수정.dat"));
			BufferedWriter writer = new BufferedWriter(new FileWriter(path + "\\이름수정_변환.dat"));

			String line = null;

			while ((line = reader.readLine()) != null) {
				if (line.contains("유재석")) {
					line = line.replace("유재석", "메뚜기");
				}
				writer.write(line);
				writer.newLine();
			}
			
			reader.close();
			writer.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
		} catch (Exception e) {
			System.out.println("at Q120.main");
			e.printStackTrace();
		}

	}
}
