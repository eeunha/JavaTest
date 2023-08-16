package com.test.question.file;

import java.io.File;

/*
	23.08.08
	
	Q. 음악 파일이 100개 있다. 파일명 앞에 일련 번호를 붙이시오.

조건..
'001'부터 3자리 형식으로 붙이시오.


리소스..
폴더 > 음악 파일
파일 다운로드


출력..
[001]1도 없어 - Apink (에이핑크).mp3 
[002]11 (Prod. 다이나믹듀오) - Wanna One (워너원) - 남바완.mp3 
[003]134340 - 방탄소년단.mp3
..
[100]花요일 (Blooming Day) - EXO-CBX (첸백시).mp3

*/
public class Q113 {
	public static void main(String[] args) {

		String path = "C:\\class\\code\\java\\파일_디렉토리_문제\\음악 파일\\Music";
		File dir = new File(path);
		int n = 1;

		if (!dir.exists())
			return;

		File[] list = dir.listFiles();

		for (File f : list) {
			if (!f.isFile() || !f.getName().endsWith(".mp3"))
				continue;
			
			File newFile = new File(path + "\\" + String.format("[%03d]", n) + f.getName());
			f.renameTo(newFile);
			n++;
		}
	}
}
