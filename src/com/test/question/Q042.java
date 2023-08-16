package com.test.question;

public class Q042 {
	public static void main(String[] args) {
		int year = 2023;
		int month = 7;
		int date = 25;

		int dayCount = 0;
		String dayOfWeek = "";

		// 윤년인지 확인
		// 윤년이라면 366일
		// 평년이라면 365일

		// 서기 1년 1월 1일 ~ year-1년 12월 31일 까지의 일수 더하기
		// dayCount = 365 * (year-1)
		dayCount = 365 * (year - 1);

		// dayCount += 작년까지의 년 중에서 윤년의 개수
		dayCount += countLeapYear(year);

		// 올해 지난달까지 일수 구하기
		dayCount += countMonthDays(year, month);

		// 올해 이번달 일수 더하기
		dayCount += date;

		// 요일 구하기
		// 현재까지 일수 % 7 -> 1 = 월요일 ... 7 = 일요일
		switch (dayCount % 7) {
		case 1:
			dayOfWeek = "월";
			break;
		case 2:
			dayOfWeek = "화";
			break;
		case 3:
			dayOfWeek = "수";
			break;
		case 4:
			dayOfWeek = "목";
			break;
		case 5:
			dayOfWeek = "금";
			break;
		case 6:
			dayOfWeek = "토";
			break;
		case 7:
			dayOfWeek = "일";
			break;
		}

		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s요일입니다.", year, month, date, dayCount, dayOfWeek);
	}

	private static int countMonthDays(int year, int month) {	// 달마다의 일 수 계산 후 반환
		int count = 0;

		for (int i = 1; i < month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				count += 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				count += 30;
				break;
			case 2:
				count += 28;
				if (countLeapYear(year) == 1) {// 윤년일 경우
					count++;
				}
			}
		}
		return count;
	}

	public static int countLeapYear(int year) { //윤년 개수 반환
		int count = 0;
		for (int i = 1; i < year; i++) {
			if (i % 4 == 0) {
				if (i % 100 == 0) {
					if (i % 400 == 0) {
						count++;
					}
				} else {
					count++;
				}
			}
		}
		return count;
	}
}
