package com.test.question;

import java.util.Scanner;

public class Q014 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("역의 개수: ");
		int station = scan.nextInt();

		System.out.print("환승역의 횟수: ");
		int change = scan.nextInt();

		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		int time = scan.nextInt();

		System.out.printf("총 소요 시간은 %d분입니다.", getTime(station, change, time));

		scan.close();
	}

	private static int getTime(int station, int change, int time) {
		int result = station * 2 + change * 4; // 역간 소요 시간에 환승 소요 시간의 중간값을 넣는다.
		if (time == 1) {	// 평상 시
			result -= change;	//환승 소요 시간을 뺸다.
		} else  if(time == 3){
			result += change;	//환승 소요 시간을 더한다.
		}
		return result;
	}
}
