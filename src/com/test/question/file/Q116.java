package com.test.question.file;

import java.io.File;
import java.util.HashSet;

/*
  	23.08.08
  
 	Q. MusicA 폴더와 MusicB 폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.

조건..
중복 파일을 찾아내시오.


리소스..
폴더 > 동일 파일
파일 다운로드


출력..
BAAM - 모모랜드 (MOMOLAND).mp3 
Dejavu - 볼빨간사춘기.mp3 
SoulMate (Feat. 아이유) - 지코 (ZICO).mp3 
..

 */
public class Q116 {
	public static void main(String[] args) {
		File dirA = new File("C:\\class\\code\\java\\파일_디렉토리_문제\\동일 파일\\MusicA");
		File[] listA = dirA.listFiles();

		HashSet<String> set = new HashSet<>();

		for (File f : listA) {
			if (!f.isFile())
				continue;
			set.add(f.getName());
		}

		File dirB = new File("C:\\class\\code\\java\\파일_디렉토리_문제\\동일 파일\\MusicB");
		File[] listB = dirB.listFiles();
		for (File f : listB) {
			if (!f.isFile())
				continue;

			if (set.contains(f.getName())) {
				System.out.println(f.getName());
			}
		}
	}
}
