package com.test.question.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
	23.08.08
	
	Q. 성적을 확인 후 합격자/불합격자 명단을 출력하시오.

조건..
합격 조건: 3과목 평균 60점 이상
과락 조건: 1과목 40점 미만


리소스..
파일 > 성적.dat
파일 다운로드


데이터..
//이름,국어,영어,수학
홍길동,50,60,70
아무개,100,80,50
하하하,98,48,56


출력..
[합격자] 
홍길동 
하하하 
아무개 

[불합격자] 
호호호 
후후후 

*/
public class Q122 {
	public static void main(String[] args) {
		try {
			// 명단 출력하기 -> reader만 사용

			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\파일_입출력_문제\\성적.dat"));

			String line = null;

			ArrayList<String> passer = new ArrayList<>();
			ArrayList<String> unqualified = new ArrayList<>();

			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");

				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);

				double avg = (double) (kor + eng + math) / 3;

				if (avg < 60 || kor < 40 || eng < 40 || math < 40) {
					unqualified.add(temp[0]);
					continue;
				}

				passer.add(temp[0]);
			}

			reader.close();

			System.out.println("[합격자]");
			for (String pass : passer) {
				System.out.println(pass);
			}
//			for (int i = 0; i < passer.size(); i++) {
//				System.out.println(passer.get(i));
//			}
			System.out.println();

			System.out.println("[불합격자]");
			for (String unqual : unqualified) {
				System.out.println(unqual);
			}
//			for (int i = 0; i < unqualified.size(); i++) {
//				System.out.println(unqualified.get(i));
//			}

		} catch (Exception e) {
			System.out.println("at Q122.main");
			e.printStackTrace();
		}
	}
}
