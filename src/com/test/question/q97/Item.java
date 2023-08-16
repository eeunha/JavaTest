package com.test.question.q97;

import java.util.Calendar;

class Item {
	private String name;
	private Calendar expiration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpiration() {
		// 날짜를 문자열로
		return String.format("%tF", this.expiration);
	}

	public void setExpiration(String expiration) {
		// 문자열을 날짜로
		String[] date = expiration.split("-");

		Calendar day = Calendar.getInstance();
		day.set(Calendar.YEAR, Integer.parseInt(date[0]));
		day.set(Calendar.MONTH, Integer.parseInt(date[1]) - 1);
		day.set(Calendar.DATE, Integer.parseInt(date[2]));

		this.expiration = day;
	}
}
