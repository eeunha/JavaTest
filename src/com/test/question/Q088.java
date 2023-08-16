package com.test.question;

import java.util.Scanner;

/*
	23.07.30
	
	Q. 금지어를 마스킹 처리 하시오.
	
	조건
		- 금지어
			- 바보
			- 멍청이
	
	입력
		입력: 너랑 안놀아 바보야!!	
	출력
		너랑 안놀아 **야!!
		금지어를 1회 마스킹했습니다.
		
	풀이방법
	1. 금지어를 *로 바꾸기. 글자수에 맞게 * 출력
		replace를 쓴다면 여러개의 문자가 하나의 *로 변경됨 -> 문제 발생
		해당 금지어가 어디서 발생했는지 알기 -> 금지어 발생 인덱스 찾기
		해당 인덱스부터 금지어 단어의 길이만큼 * 넣기
		
	2. 금지어의 개수를 세기
		금지어 탐색 시 개수 세기
		
*/
public class Q088 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("입력: ");
		String input = scan.nextLine();

		String[] forbiddenWords = { "바보", "멍청이" };
		int count = countForbiddenWords(input, forbiddenWords);

		System.out.println("금지어를 " + count + "회 마스킹했습니다.");
		scan.close();
	}

	private static int countForbiddenWords(String input, String[] words) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(input);

		for (int i = 0; i < words.length; i++) { // 금지어 개수만큼 순회
			String curWord = words[i]; // 현재 찾을 금지어

			StringBuilder replaceWord = new StringBuilder(); // 대체할 단어 - ** 또는 ***
			for (int j = 0; j < curWord.length(); j++) { // 현재 금지어 길이만큼 * 붙이기
				replaceWord.append("*");
			}

			int index = -1;
			while (true) {
				index = input.indexOf(curWord, index);

				if (index == -1) { // 해당 금지어 없음
					break;
				}

				// 해당 금지어가 존재하는 경우 - *로 치환
				sb.replace(index, index + curWord.length(), replaceWord.toString());

				index += curWord.length();
				count++;
			}
		}

		System.out.println(sb); // 변경된 문자열 출력

		return count;
	}

}
