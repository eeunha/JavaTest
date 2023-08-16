package com.test.question.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

/*
	23.08.08
	
	Q. 이름을 입력받아 회원 정보를 검색 후 출력하시오.

리소스..
파일 > 단일검색.dat
파일 다운로드

입력..
이름: 홍길동 

출력..
[홍길동] 
번호: 33 
주소: 서울시 강남구 역삼동 
전화: 010-2345-6789 

*/
public class Q123 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);

			System.out.print("이름: ");
			String name = scan.nextLine();

			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\파일_입출력_문제\\단일검색.dat"));

			String line = null;

			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");

				// 이름이 같은지 검사하기
				if (!temp[1].equals(name)) {
					continue;
				}

				System.out.printf("[%s]\n", name);
				System.out.println("번호: " + temp[0]);
				System.out.println("주소: " + temp[2]);
				System.out.println("전화:" + temp[3]);
				break;
			}

			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Q123.main");
			e.printStackTrace();
		}

	}
}
