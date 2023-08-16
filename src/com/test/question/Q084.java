package com.test.question;

/*

	2023.07.28
	
	Q. 특정 단어가 문장내에 몇회 있어있는지 수를 세시오.
	
	조건
		- 대상 문자열: String content = "안녕~ 길동아~ 잘가~ 길동아~";
		- 검색 문자열: String word = "길동";
	
	출력
		'길동'을 총 2회 발견했습니다.
	
	
	오늘 배운 문자열 메소드
	
	int indexOf()
	int lastIndexOf()
	String toUpperCase()
	String toLowerCase()
	boolean startsWith(String)
	boolean endsWith(String)
	String substring(int beginIndex, int endIndex)
	boolean contains(String)
	String replace(String old, String new)
	String[] split(String delimiter)
	
	StringBuilder
	
*/
public class Q084 {
	public static void main(String[] args) {
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";

		int count = 0;
		int index = 0;

		// indexOf() 사용하여 횟수 확인하기.
		while (true) { // 수업시간에 배운 메소드
			index = content.indexOf(word, index);

			if (index == -1) {
				break;
			}

			count++;

			index += word.length();
		}

		System.out.printf("'%s'을 총 %d회 발견했습니다.", word, count);
	}
}
