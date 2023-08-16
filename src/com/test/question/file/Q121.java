package com.test.question.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
	23.08.08
	
	Q. 숫자를 한글로 바꾼 뒤 파일을 다른 이름으로 저장하시오.

조건..
0 → 영, 1 → 일 ... 9 → 구
저장할 파일명: 숫자_변환.dat


리소스..
파일 > 숫자.dat
파일 다운로드


출력..
변환 후 다른 이름으로 저장하였습니다.

*/
public class Q121 {
	public static void main(String[] args) {
		try {
			// 파일을 한 글자씩 읽기
			// 해당 글자가 숫자면 한글로 바꾸기
			// 다른 이름의 파일로 저장하기

			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\파일_입출력_문제\\숫자.dat"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\파일_입출력_문제\\숫자_변환.dat"));

			int code = -1;

			// 한 문자씩 읽기
			while ((code = reader.read()) != -1) {
				if (code - '0' >= 0 && code - '9' <= 0) {
					if ((char) code == '0') {
						code = '영';
					} else if ((char) code == '1') {
						code = '일';
					} else if ((char) code == '2') {
						code = '이';
					} else if ((char) code == '3') {
						code = '삼';
					} else if ((char) code == '4') {
						code = '사';
					} else if ((char) code == '5') {
						code = '오';
					} else if ((char) code == '6') {
						code = '육';
					} else if ((char) code == '7') {
						code = '칠';
					} else if ((char) code == '8') {
						code = '팔';
					} else if ((char) code == '9') {
						code = '구';
					}
				}
				writer.write((char) code);
			}

			// 한 문장으로 읽기
//			String line = null;
//
//			while ((line = reader.readLine()) != null) {
//				line = line.replace("0", "영").replace("1", "일").replace("2", "이").replace("3", "삼").replace("4", "사")
//						.replace("5", "오").replace("6", "육").replace("7", "칠").replace("8", "팔").replace("9", "구");
//				writer.write(line);
//			}

			reader.close();
			writer.close();

			System.out.println("변환 후 다른 이름으로 저장하였습니다.");

		} catch (Exception e) {
			System.out.println("at Q121.main");
			e.printStackTrace();
		}
	}
}
