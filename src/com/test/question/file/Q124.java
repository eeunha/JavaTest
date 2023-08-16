package com.test.question.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

/*
	23.08.08
	Q. 이름을 입력받아 회원 주문 정보를 검색 후 출력하시오.

리소스..
파일 > 검색_회원.dat
파일 > 검색_주문.dat
파일 다운로드

입력..
이름: 홍길동 

출력..
==== 구매내역 ==== 
[번호]    [이름]    [상품명]    [개수]    [배송지]
      3    홍길동     마우스          3    서울시 강동구 천호동

*/
public class Q124 {
	public static void main(String[] args) {
		try {
			BufferedReader userReader = new BufferedReader(
					new FileReader("C:\\class\\code\\java\\파일_입출력_문제\\검색_회원.dat"));
			BufferedReader orderReader = new BufferedReader(
					new FileReader("C:\\class\\code\\java\\파일_입출력_문제\\검색_주문.dat"));

			Scanner scan = new Scanner(System.in);

			System.out.print("이름: ");
			String userName = scan.nextLine();

			String userNumber = "-1";
			String userAddr = "";
			boolean isValid = false;
			String line = null;

			// 유저 정보
			while ((line = userReader.readLine()) != null) {
				String[] temp = line.split(",");
//				System.out.println(Arrays.toString(temp));

				if (temp[1].equals(userName)) {
					userNumber = temp[0];
					userAddr = temp[2];
					isValid = true;
					break;
				}
			}

//			System.out.println(userNumber + ", " + userName + ", " + userAddr);

			if (!isValid) {
				return;
			}

			System.out.println("==== 구매내역 ====");
			System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");

			line = null;
			while ((line = orderReader.readLine()) != null) {
				String[] temp = line.split(",");
//				System.out.println(Arrays.toString(temp));
				if (temp[3].equals(userNumber)) {
					System.out.printf("%s\t%s\t%s\t%s\t%s\t\n", temp[0], userName, temp[1], temp[2], userAddr);
				}
			}

			userReader.close();
			orderReader.close();

		} catch (Exception e) {
			System.out.println("at Q124.main");
			e.printStackTrace();
		}
	}
}
