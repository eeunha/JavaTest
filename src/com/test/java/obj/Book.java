package com.test.java.obj;

public class Book {

	// 접근 지정자 > 가이드 라인
	// 1. 멤버 변수는 무조건 private을 사용한다.
	// 2. Getter/Setter를 구현한다.

//	public String title;
//	public String author;
//	public String publisher;
//	public int price;
//	public int page;

	private String title;
	private String author;
	private String publisher;
	private int price;

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	private int page;

	public void aaa(String a) {
		title = a;
	}

	public void bbb(int b) {
		if (b >= 0 && b <= 100000) { // 유효성 검사
			price = b;
		} else {
			System.out.println("올바른 책 가격이 아닙니다.");
		}
	}

	public int ccc() {
		return price;
	}

	// Setter/Getter > 객체 내외부를 연결하는 통로
	// > 인터페이스 역할
	// > 프로퍼티(Property)

	// 책 제목
	// Setter
	// 1. set멤버변수명
	// 2. return void
	public void setTitle(String title) {

		// 멤버변수 = 매개변수
		// title = title;

		// title? > 무조건 누군가를 가리킨다.(이미 정해져있음 -> 매개변수)

		// ***** 영역이 큰 요소와 영역이 작은 요소가 충돌하면, 반드시 작은 영역의 요소를 우선한다.
		// > 대부분의 프로그래밍 환경에서 적용

		// 멤버 변수 > 클래스 전역 > title
		// 지역 변수 > 메소드 전역 > title -> 우선

		// 대한민국 > 홍길동
		// 역삼동 > 홍길동

		// this 연산자
		// - 객체 접근 연산자
		// - '나'> 객체 자기 자신을 가리키는 표현(예약어)

		this.title = title; // this -> 객체
	}

	//
	// Getter
	// 1. get멤버변수명
	// 2. return 값
	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
