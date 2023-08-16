package com.test.java.dummy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

//23.08.11
public class Ex75 {
	public static void main(String[] args) throws IOException {

		// Ex75.java

		// 프로그램 제작 > 데이터
		// 1. 테스트용 데이터 > 10%
		// - 진짜 데이터
		// - 사람이 직접 기입

		// 2. 더미 데이터 > 90%
		// - 양만 채우는 용도
		// - 프로그램으로 작성

		// 게시판
		// - "게시판입니다." x 200개

		// 회원 가입 + 목록
		// a. "JavaTest > data > "member.txt"
		// b. 1,홍길동,20, 010-1234-5678,서울시 강남구 역삼동 > 규칙
		// c. 데이터 생성

		Random rnd = new Random();
		String[] name1 = { "김", "이", "박", "최", "정", "황", "신", "현", "길", "조" };
		String[] name2 = { "은", "하", "수", "정", "주", "원", "진", "민", "인", "지", "석", "섭" };

		String[] addr1 = { "서울시", "인천시", "부산시", "수원시", "대전시", "광주시", "제주시" };
		String[] addr2 = { "중구", "강북구", "강남구", "강서구", "강동구" };
		String[] addr3 = { "역삼동", "대치동", "압구정동", "천호동", "방배동" };

		BufferedWriter writer = new BufferedWriter(new FileWriter(".\\data\\member.txt"));

		for (int i = 0; i < 100; i++) {
			// 회원 번호
			int no = i + 1;

			// 회원명
			String name = name1[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name2.length)]
					+ name2[rnd.nextInt(name2.length)];

			// 나이(20~60)
			int age = rnd.nextInt(41) + 20;

			// 연락처
			String tel = "010-" + (rnd.nextInt(9000) + 1000) + "-" + (rnd.nextInt(9000) + 1000);

			// 주소
			String address = addr1[rnd.nextInt(addr1.length)] + " " + addr2[rnd.nextInt(addr2.length)] + " "
					+ addr3[rnd.nextInt(addr3.length)] + " " + (rnd.nextInt(100) + 20) + "번지";
//			System.out.println(address);

			// b. 1,홍길동,20, 010-1234-5678,서울시 강남구 역삼동 > 규칙
			writer.write(String.format("%d,%s,%d,%s,%s\r\n", no, name, age, tel, address));
		}
		
		writer.close();

		System.out.println("더미 데이터 생성 완료");


	}// main
}
