package com.test.question;

import java.util.Scanner;

/*
 * 수정본. 완성본.
 * */
public class Q047_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int money = 0;
		int n = 0;
		int changes = 0;
		boolean isAvailable = false;

		while (true) {
			printMenu();
			money = scan.nextInt();

			System.out.println("--------------------");
			System.out.print("음료 선택(번호) : ");
			n = scan.nextInt();
			scan.skip("\r\n");

			// 번호 별 선택지

			if (n == 1) {// 콜라
				isAvailable = checkMoney(money, 700); // 금액 확인
				if (isAvailable) { // 금액이 같거나 클 경우
					changes = money - 700;
					printAvailable(scan, "콜라", changes);
				} else {// 금액이 부족할 경우
					printLessMoney(scan, money);
				}
			} else if (n == 2) {// 사이다
				isAvailable = checkMoney(money, 600); // 금액 확인
				if (isAvailable) { // 금액이 같거나 클 경우
					changes = money - 600;
					printAvailable(scan, "사이다", changes);
				} else {// 금액이 부족할 경우
					printLessMoney(scan, money);
				}
			} else if (n == 3) {// 비타
				isAvailable = checkMoney(money, 500); // 금액 확인
				if (isAvailable) { // 금액이 같거나 클 경우
					changes = money - 500;
					printAvailable(scan, "비타500", changes);
				} else {// 금액이 부족할 경우
					printLessMoney(scan, money);
				}
			} else {// 그 외
				System.out.println("잘못된 번호를 입력했습니다.");
				System.out.printf("잔돈 %d원을 반환하고 종료합니다.", money);
				break;
			}
			money = 0;
			changes = 0;
		}
	}

	private static void printAvailable(Scanner scan, String menu, int changes) {
		System.out.printf("+%s을(를) 제공합니다.\n", menu);
		System.out.printf("+잔돈 %d원을 제공합니다.\n\n", changes);
		System.out.println("계속 하시려면 엔터를 입력하세요.\n");
		scan.nextLine();
	}

	private static void printLessMoney(Scanner scan, int money) {
		System.out.println("금액이 부족합니다.");
		System.out.printf("+잔돈 %d원을 제공합니다.\n\n", money);
		System.out.println("계속 하시려면 엔터를 입력하세요.\n");
		scan.nextLine();
	}

	private static boolean checkMoney(int money, int price) {
		if (money >= price)
			return true;
		return false;
	}

	private static void printMenu() {
		System.out.println("====================");
		System.out.println("        자판기");
		System.out.println("====================");
		System.out.println("1. 콜라 : 700원");
		System.out.println("2. 사이다 : 600원");
		System.out.println("3. 비타500 : 500원");
		System.out.println("--------------------");
		System.out.print("금액 투입(원) : ");
	}
}
