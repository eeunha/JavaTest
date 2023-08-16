package com.test.question;

import java.util.Scanner;

public class Q027 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = "";

		System.out.print("문자: ");
		String s = scan.nextLine();

		if (s.equals("f") || s.equals("F")) {
			word = "Father";
		} else if (s.equals("m") || s.equals("M")) {
			word = "Mother";
		} else if (s.equals("s") || s.equals("S")) {
			word = "Sister";
		} else if (s.equals("b") || s.equals("B")) {
			word = "Brother";
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
			scan.close();
			return;
		}
		System.out.println(word);

		scan.close();
	}
}
