package com.test.question.file;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

/*
	23.08.08
	
	요구사항
이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.

조건..
새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
'mouse.bmp' 추가를 하면.. 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오.

리소스..
폴더 > 확장자별 카운트
파일 다운로드

출력..
*.gif: 10개 
*.jpg: 5개 
*.png: 3개 

*/
public class Q114 {
	public static void main(String[] args) {
		// 목록
		File dir = new File("C:\\class\\code\\java\\파일_디렉토리_문제\\확장자별 카운트");

		File[] list = dir.listFiles();

		// 키 > 확장자
		// 값 > 카운트
		HashMap<String, Integer> count = new HashMap<>();

		for (File f : list) {
			String ext = getExtension(f.getName());
			count.put(ext, count.getOrDefault(count, 0) + 1);
		}

		Set<String> set = count.keySet();

		for (String key : set) {
			System.out.println("*." + key + " : " + count.get(key));
		}

// 선생님 코드
//		for (File f : list) {
//			String ext = getExtension(f.getName());
//			if (!count.containsKey(ext)) {
//				count.put(ext, 1);
//			} else {
//				count.put(ext, count.get(ext) + 1);
//			}
//		}
	}

	private static String getExtension(String name) {

		// test.png
		// test.test.png
//		System.out.println(name);
		String[] temp = name.split("\\.");
//		System.out.println(temp.length);
		String ext = temp[temp.length - 1].toLowerCase();

//		System.out.println(Arrays.toString(temp));
//		System.out.println(ext);

		return ext;

//		return name.split("\\.")[temp.length-1].toLowerCase();
	}
}
