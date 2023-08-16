package com.test.question;

import java.util.Calendar;

public class Q019 {
	public static void main(String[] args) {
		nowTime();
	}

	public static void nowTime() {
		Calendar now = Calendar.getInstance();

		int curHour12 = now.get(Calendar.HOUR);
		int curHour = now.get(Calendar.HOUR_OF_DAY);
		int curMin = now.get(Calendar.MINUTE);
		int curSec = now.get(Calendar.SECOND);
		int isAfternoon = now.get(Calendar.AM_PM);

		System.out.println("현재 시간 : " + curHour + "시 " + curMin + "분 " + curSec + "초"); //24시간 출력
		
		System.out.printf("현재 시간 : %s %d시 %d분 %d초\n", isAfternoon == 0 ? "오전" : "오후",
				curHour12, curMin, curSec);
	}
}
