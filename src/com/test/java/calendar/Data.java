package com.test.java.calendar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

//item.txt > 조작 클래스(*****)
public class Data {
	public static ArrayList<Item> list; // 전체 일정

	// 정적 생성자 > static 멤버 전용 초기화 (우리가 아는 것은 객체 생성자다.)
	static {
		Data.list = new ArrayList<>();
	}

	public static void load() {

		// item.txt > ArrayList<Item>

		try {
			BufferedReader reader = new BufferedReader(new FileReader("data\\item.txt"));

			String line = null;

			while ((line = reader.readLine()) != null) {
//				System.out.println(line);
				// 1,2023-08-02,회의
				
				String[] temp = line.split(",");

				Item item = new Item(temp[0], temp[1], temp[2]);
				Data.list.add(item);
				
//				System.out.println(Data.list);
			}

			reader.close();

		} catch (Exception e) {
			System.out.println("at Data.load");
			e.printStackTrace();
		}

	}

}
