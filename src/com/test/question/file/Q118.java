package com.test.question.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/*
 	23.08.08
 
  	Q. 폴더 내의 모든 파일들을 찾아 크기를 비교하고, 크기가 큰 순으로 정렬하시오.

조건..
자식 폴더내의 파일도 모두 검색하시오.
부모 자식 폴더에 상관없이 파일을 한번에 비교하시오.


리소스..
폴더 > 크기 정렬
파일 다운로드


출력..
[파일명]      [크기]     [파일이 들어있는 폴더]
aaa.exe    57KB    AAA 
bbb.exe    50KB    BBB 
ccc.dat     41KB    AAA 
ddd.txt     20KB    CCC 
..

I: x
O: String, 정렬된 채로 파일마다 각 정보들 출력
C: 자식 폴더 내의 파일도 모두 검색하기. -> 재귀
	부모 자식 폴더에 상관 없이 파일을 한번에 비교 -> 각 파일에 도착했을 때 정보 수집 -> 파일명, 크기, 부모 폴더(-> 절대경로 -> 뒤에서 두번째 \\ 찾기)
	
E: 해당 폴더가 없는 경우 -> return

HashMap<String, Integer> -> <절대경로, 파일크기>
파일 크기(value)로 정렬하기
출력 시 절대경로에서 해당 파일명만 출력되게 조작하기

 */
public class Q118 {
	public static void main(String[] args) {
		File dir = new File("C:\\class\\code\\java\\파일_디렉토리_문제\\크기 정렬");

//		HashMap<String, Long> map = new HashMap<>();

		ArrayList<File> fList = new ArrayList<File>();

		if (!dir.exists())
			return;

		addFile(dir, fList);

		// 정렬
		for (int i = 0; i < fList.size() - 1; i++) {
			for (int j = 0; j < fList.size() - i - 1; j++) {
				if (fList.get(j).length() < fList.get(j + 1).length()) {
					File temp = fList.get(j);
					fList.set(j, fList.get(j + 1));
					fList.set(j + 1, temp);
				}
			}
		}

		System.out.printf("%-33s%s\t%10s\n", "[파일명]", "[크기]", "[파일이 들어있는 폴더]");

		for (File f : fList) {
			System.out.printf("%-30s\t%10s\t%s\n", f.getName(), getSize(f.length()), f.getParentFile().getName());
		}

	}

	private static Object getSize(long length) {
		if (length < 1024) {
			return length + "B";
		} else if (length < 1024 * 1024) {
			return String.format("%.1f", length / 1024.0) + "KB";
		} else if (length < 1024 * 1024 * 1024) {
			return String.format("%.1f", length / 1024.0 / 1024.0) + "MB";
		} else if (length < 1024 * 1024 * 1024 * 1024) {
			return String.format("%.1f", length / 1024.0 / 1024.0 / 1024.0) + "GB";
		} else {
			return String.format("%.1f", length / 1024.0 / 1024.0 / 1024.0 / 1024.0) + "TB";
		}
	}

	private static void addFile(File dir, ArrayList<File> fList) {
		File[] list = dir.listFiles();

		for (File f : list) {
			if (f.isFile()) {
				fList.add(f);
			}

			if (f.isDirectory()) {
				addFile(f, fList);
			}
		}
	}

}
