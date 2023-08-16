package com.test.question;

import java.util.Calendar;

public class Q020 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.DATE, 100);	//현재 날짜에서 100일을 더한다.
		System.out.printf("백일: %tF\n", now);
		
		now = Calendar.getInstance();
		now.add(Calendar.YEAR, 1);	//현재 날짜에서 1년을 더한다.
		System.out.printf("첫돌: %tF\n", now);
	}
}
