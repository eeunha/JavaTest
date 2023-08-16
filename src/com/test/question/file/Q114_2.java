package com.test.question.file;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

//23.08.08
public class Q114_2 {
	public static void main(String[] args) {
		File dir = new File("C:\\class\\code\\java\\파일_디렉토리_문제\\확장자별 카운트");
		HashMap<String, Integer> count = new HashMap<>();

		if (!dir.exists())
			return;

		File[] list = dir.listFiles();

		for (File f : list) {
			if (!f.isFile())
				continue;

			String[] ext = f.getName().split("\\.");

			count.put(ext[1], count.getOrDefault(ext[1], 0) + 1);
		}

		Set<String> set = count.keySet();
		for (String key : set) {
			System.out.println("*." + key + ": " + count.get(key) + "개");
		}
	}
}
