package com.test.java.dummy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//23.08.11
public class Ex76 {
	public static void main(String[] args) {

		// Ex76.java

		// OpenAPI, Open Application Programming Interface
		// - 공개된 프로그래밍 기능
		// - 공공 데이터 포털
		// - 구글, 아마존, 네이버, 다음 등... > 지도

		// OpenAPI > 데이터 확보 > 전부 진짜 데이터

		m1();

//		m2();

	}// main

	private static void m2() {

		/*
		 * { "name": "홍길동", "age": 20, "tel": ["010-1111-1111", "010-2222-2222",
		 * "010-3333-3333"] }
		 * 
		 */

		String json = "{\r\n" + "		 		\"name\": \"홍길동\",\r\n" + "		 		\"age\": 20,\r\n"
				+ "		 		\"tel\": [\"010-1111-1111\", \"010-2222-2222\", \"010-3333-3333\"]\r\n" + "		 	}";

		JSONParser parser = new JSONParser();

		try {

			JSONObject obj = (JSONObject) parser.parse(json); // down casting

//			System.out.println(obj);
			System.out.println(obj.get("name")); // property name = key
			System.out.println(obj.get("age")); // property name = key
//			System.out.println(obj.get("tel"));

			// array - JSONArray
			JSONArray arr = (JSONArray) obj.get("tel"); // down casting

			for (Object t : arr) {
				System.out.println(t);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static void m1() {

		Scanner scan = new Scanner(System.in);

		System.out.println("[지하철 정보 검색]");

		System.out.print("역 검색: ");

		String name = scan.nextLine();

		// 1. 요청 URL 만들기
		String url = "http://apis.data.go.kr/1613000/SubwayInfoService/getKwrdFndSubwaySttnList?"; // 요청주소
		url += "ServiceKey=CyGDxLq3m558%2BnuTh5ZIGVs1ZsV%2FJYNhvoIKPq4gnApUrtPtRi8tUaWziDwY%2BCrYVF%2BimSzN7lTocuLE0kVDzQ%3D%3D";

		url += "&_type=json"; // 돌려 받는 데이터 = XML or JSON

		url += "&numOfRows=10"; // 데이터를 10개씩 가져오기

		url += "&pageNo=1"; // 첫번째 10개 1~10번째 데이터. 만약 2명 11~20번째데이터임

		url += "&subwayStationName=" + URLEncoder.encode(name);

//		System.out.println(url);

		// QueryString - ? 뒤의 값
		// http:\\data.go.kr\SttnList?키=데이터&키=데이터&키=데이터

		// JSON
		// 객체 {}
		// 멤버 "name":"홍길동"
		// 배열 []

		// URL 객체 생성
		try {
			// URL 객체 생성
			URL obj_url = new URL(url);

			// URL과 연결하는 객체 생성 > 브라우저 대신 접속
			HttpURLConnection conn = (HttpURLConnection) obj_url.openConnection();

			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");

			BufferedReader reader = null;

			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}

			// reader > 검색 결과 읽기 가능
//			String line = null;
//
//			while ((line = reader.readLine()) != null) {
//				System.out.println(line);
//			}

			JSONParser parser = new JSONParser();
			JSONObject root = (JSONObject) parser.parse(reader); // 형변환 계속 하기
			JSONObject response = (JSONObject) root.get("response");
			JSONObject body = (JSONObject) response.get("body");
			JSONObject items = (JSONObject) body.get("items");

			ArrayList<String> temp = new ArrayList<>();

			// item이 객체일 수도, 배열일 수도 있다.
			if (items.get("item") instanceof JSONObject) {
				JSONObject item = (JSONObject) items.get("item");

				System.out.println("1.");
				System.out.println("호선: " + item.get("subwayRouteName"));
				System.out.println("역명: " + item.get("subwayStationName"));

				temp.add(item.get("subwayStationId").toString());
			} else {
				JSONArray arr = (JSONArray) items.get("item");
				int n = 1;
				for (Object obj : arr) {
					JSONObject item = (JSONObject) obj;
					System.out.println(n + ".");
					System.out.println("호선: " + item.get("subwayRouteName"));
					System.out.println("역명: " + item.get("subwayStationName"));
					System.out.println("----------------");
					n++;

					temp.add((String) item.get("subwayStationId").toString());

				}
			}

			reader.close();
			conn.disconnect();

			System.out.print("역 선택: ");
			String sel = scan.nextLine();
//			if (sel >= arr.size()) {
//				
//			}
			System.out.println(temp.get(Integer.parseInt(sel) - 1)); // 역 ID

			// 역 주변 정보 구하기
			// 1. 요청 URL 만들기
			url = "http://apis.data.go.kr/1613000/SubwayInfoService/getSubwaySttnExitAcctoCfrFcltyList?"; // 요청주소
			url += "serviceKey=CyGDxLq3m558%2BnuTh5ZIGVs1ZsV%2FJYNhvoIKPq4gnApUrtPtRi8tUaWziDwY%2BCrYVF%2BimSzN7lTocuLE0kVDzQ%3D%3D";

			url += "&_type=json"; // 돌려 받는 데이터 = XML or JSON

			url += "&numOfRows=10"; // 데이터를 10개씩 가져오기

			url += "&pageNo=1"; // 첫번째 10개 1~10번째 데이터. 만약 2명 11~20번째데이터임

			url += "&subwayStationId=" + URLEncoder.encode(temp.get(Integer.parseInt(sel) - 1));

			// URL 객체 생성
			obj_url = new URL(url);

			// URL과 연결하는 객체 생성 > 브라우저 대신 접속
			conn = (HttpURLConnection) obj_url.openConnection();

			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");

			reader = null;

			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}

			root = (JSONObject) parser.parse(reader);

			response = (JSONObject) root.get("response");
			body = (JSONObject) response.get("body");
			items = (JSONObject) body.get("items");

			// item이 객체일 수도, 배열일 수도 있다.
			if (items.get("item") instanceof JSONObject) {

				JSONObject item = (JSONObject) items.get("item");

				System.out.println("출구: " + item.get("exitNo"));
				System.out.println("주변시설: " + item.get("dirDesc"));
			} else {
				JSONArray arr = (JSONArray) items.get("item");

				for (Object obj : arr) {
					JSONObject item = (JSONObject) obj;

					System.out.println("출구: " + item.get("exitNo"));
					System.out.println("주변시설: " + item.get("dirDesc"));

				}
			}

			reader.close();
			conn.disconnect();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
