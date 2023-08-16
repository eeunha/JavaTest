package com.test.question;

import java.util.Scanner;

public class Q047 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int money = 0;
		int changes = 0;
		int n = 0;

		while (true) {
			System.out.println("====================");
			System.out.println("        자판기");
			System.out.println("====================");
			System.out.println("1. 콜라 : 700원");
			System.out.println("2. 사이다 : 600원");
			System.out.println("3. 비타500 : 500원");
			System.out.println("--------------------");
			System.out.print("금액 투입(원) : ");
			money = scan.nextInt();

			System.out.println("--------------------");
			System.out.print("음료 선택(번호) : ");
			n = scan.nextInt();
			scan.skip("\r\n");

			if (n == 1) {	//콜라를 입력한 경우
				changes = money - 700;

				System.out.println("+콜라를 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.\n\n", changes);
				System.out.println("계속 하시려면 엔터를 입력하세요.\n");
				scan.nextLine();

				money = changes;
				changes = 0;
			} else if (n == 2) {	//사이다를 입력한 경우
				changes = money - 600;

				System.out.println("+사이다를 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.\n\n", changes);
				System.out.println("계속 하시려면 엔터를 입력하세요.\n");
				scan.nextLine();

				money = changes;
			} else if (n == 3) {	//비타500을 입력한 경우
				changes = money - 500;

				System.out.println("+비타500을 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.\n\n", changes);
				System.out.println("계속 하시려면 엔터를 입력하세요.\n");
				scan.nextLine();

				money = changes;
			} else {
				break;
			}
		}
		
		scan.close();
	}
}
