package com.test.question.q94;

import java.util.Calendar;

class Bugles {
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;

	public int getPrice() {
		return price;
	}

	public void setSize(int size) {
		if (size != 300 && size != 500 && size != 850) {
			return;
		}

		if (size == 300) {
			this.price = 850;
			this.expiration = 7;
		} else if (size == 500) {
			this.price = 1200;
			this.expiration = 10;
		} else {
			this.price = 1950;
			this.expiration = 15;
		}

		this.weight = size;
	}

	public void setCreationTime(String creationTime) {
		Calendar day = Calendar.getInstance();

		day.set(Integer.parseInt(creationTime.substring(0, 4)), Integer.parseInt(creationTime.substring(5, 7)) - 1,
				Integer.parseInt(creationTime.substring(8)));

//		System.out.printf("%tF\n", day);
		
		this.creationTime = day;
	}

	public int getExpiration() {
		Calendar now = Calendar.getInstance();

		return this.expiration
				- (int) ((now.getTimeInMillis() - this.creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24);
	}

	public void eat() {
		if (getExpiration() >= 0) {
			System.out.println("과자를 맛있게 먹습니다.\n");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.\n");
		}
	}

	// getter, setter 구현

//	public void eat() {
//		if (this.expiration >= 0) {
//			System.out.println("과자를 맛있게 먹습니다.");
//		} else {
//			System.out.println("유통기한이 지나 먹을 수 없습니다.");
//		}
//		System.out.println();
//	}
//
//	public void setSize(int size) {
//		setWeight(size);
//
//		// 가격 & 무게 별 생상된 제품의 유통기한 기준 설정 (추후 남은 유통기한으로 바뀜)
//		if (size == 300) {
//			this.price = 850;
//			this.expiration = 7;
//		} else if (size == 500) {
//			this.price = 1200;
//			this.expiration = 10;
//		} else if (size == 850) {
//			this.price = 1950;
//			this.expiration = 15;
//		} else {
//			System.out.println("올바르지 않은 용량");
//		}
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setWeight(int weight) {
//		if (weight == 300 || weight == 500 || weight == 850) {
//			this.weight = weight;
//		} else {
//			System.out.println("올바르지 않은 무게");
//		}
//	}
//
//	public void setCreationTime(String creationTime) {
//		String[] times = creationTime.split("-");
//
//		// 날짜 설정
//		Calendar date = Calendar.getInstance();
//		date.set(Calendar.YEAR, Integer.parseInt(times[0]));
//		date.set(Calendar.MONTH, Integer.parseInt(times[1]) - 1);
//		date.set(Calendar.DATE, Integer.parseInt(times[2]));
////		System.out.printf("creationTime: %tF\n", date);
//
//		this.creationTime = date;
//
//		// 남은 유통기한 설정하기
//		// 남은 유통기한 = 제조일자 + 유통기한 - 오늘날짜 -> 일수로 변환 -> this.expiration = 남은 유통기한
//
//		// 유통기한(expiration) 계산
//		// 다 날짜 객체로 생성
//		Calendar exp = this.creationTime;
//		exp.add(Calendar.DATE, expiration);
//		System.out.printf("exp: %tF\n", exp);
//
//		Calendar now = Calendar.getInstance();
//		now.set(Calendar.YEAR, now.get(Calendar.YEAR));
//		now.set(Calendar.MONTH, now.get(Calendar.MONTH));
//		now.set(Calendar.DATE, now.get(Calendar.DATE));
//		System.out.printf("now: %tF\n", now);
//
//		// mills로 차이 구하기
//		// 차이를 일로 변경하기
//		// diffDays = expiration - now - creationTime
//		// long diffDays = (exp.getTimeInMillis() - now.getTimeInMillis() -
//		// creationTime.getTimeInMillis()) / 1000;
//		long diffDays = (exp.getTimeInMillis() - now.getTimeInMillis()) / 1000;
//		diffDays /= (24 * 60 * 60);
////		System.out.println("diffDays: " + diffDays);
//		this.expiration = (int) diffDays;
//	}
//
//	public int getExpiration() {
//		return expiration;
//	}
}
