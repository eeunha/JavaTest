package com.test.question.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Set;

/*
	23.08.08
	
	Q. 직원들의 지각과 조퇴를 카운트하시오.

조건..
출근 : 오전 9시
퇴근 : 오후 6시


리소스..
파일 > 출결.dat
파일 다운로드


출력..
[이름]    [지각]    [조퇴] 
홍길동      4회       0회 
아무개      0회       0회 
하하하      2회       3회 

*/
public class Q126 {
	public static void main(String[] args) {
		try {
			// 직원마다 지각이랑 조퇴 횟수 카운팅
			// 직원 이름을 해시맵의 키로 넣기
			// 지각과 조퇴 횟수는 배열로 값에 넣기

			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\파일_입출력_문제\\출결.dat"));

			HashMap<String, Integer[]> map = new HashMap<>();

			String line = null;

			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");

				int in = Integer.parseInt(temp[2].substring(0, temp[2].indexOf(":"))); // 출근 시간
				int out = Integer.parseInt(temp[3].substring(0, temp[3].indexOf(":"))); // 퇴근 시간

				boolean late = false; // 지각 여부
				boolean leaveEarly = false; // 조퇴 여부

				if (in >= 9) { // 지각이면
					late = true;
				}

				if (out < 18) { // 조퇴이면
					leaveEarly = true;
				}

				if (map.containsKey(temp[1])) {
					Integer[] valueArr = map.get(temp[1]);
					if (late) {
						valueArr[0] += 1;
					}
					if (leaveEarly) {
						valueArr[1] += 1;
					}
					map.replace(temp[1], valueArr);
				} else {
					map.put(temp[1], new Integer[] { (late ? 1 : 0), (leaveEarly ? 1 : 0) });
				}
			}

			printMap(map);

			reader.close();

		} catch (Exception e) {
			System.out.println("at Q126.main");
			e.printStackTrace();
		}

	}

	private static void printMap(HashMap<String, Integer[]> map) {
		System.out.println("[이름]\t[지각]\t[조퇴]");

		Set<String> set = map.keySet();

		for (String key : set) {
			Integer[] temp = map.get(key);
			int inCount = temp[0];
			int outCount = temp[01];
			System.out.println(key + "\t" + inCount + "회\t" + outCount + "회\t");
		}
	}
}
