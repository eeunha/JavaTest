package com.test.java.auth;

import java.util.Scanner;

import com.test.java.auth.admin.Admin;
import com.test.java.auth.auth.Auth;
import com.test.java.auth.data.Data;
import com.test.java.auth.member.Member;

//23.08.14
public class Main {
	public static void main(String[] args) {

		// 콘솔 > 인증 처리 > 로그인/로그아웃

		// 패키지: "com.text.java.auth"
		// 파일
		// - "Main.java"
		// - "com.test.java.auth.data" > "Member.java" // 정보(상자)
		// - "com.test.java.auth.auth" > "Auth.java"
		// - "com.test.java.auth.data" > "Data.java"

		// - "com.test.java.auth.member" > "Member.java" // 회원정보, 회원 전용
		// - "com.test.java.auth.admin" > "Admin.java" // 관리자 전용

		// 데이터 파일
		// - JavaTest > data > "member.txt" 재사용

		// 아이디,비번,이름,등급(1-일반,2-관리자)
		// hong,1111,홍길동,1

		Data.load();

		boolean loop = true;
		Scanner scan = new Scanner(System.in);

		while (loop) {
			// 얘도 메소드로 분리하기
			System.out.println("=======================");
			System.out.println("        회원 관리");
			System.out.println("=======================");

			if (Auth.auth == null) {
				System.out.println("1. 로그인");
			} else {
				System.out.println("2. 로그아웃");
				System.out.println("3. 회원정보");
				System.out.println("4. 회원전용");

				if (Auth.auth.getLv().equals("2")) {
					System.out.println("5. 관리자전용");
				}
			}

			System.out.println("6. 종료");
			System.out.print("선택: ");

			String sel = scan.nextLine();

			if (sel.equals("1")) {
				Auth.login();
			} else if (sel.equals("2")) {
				Auth.logout();
			} else if (sel.equals("3")) {
				Member.info();
			} else if (sel.equals("4")) {
				Member.something();
			} else if (sel.equals("5")) {
				Admin.something();
			} else {
				loop = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
