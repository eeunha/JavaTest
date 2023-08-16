package com.test.question.q92;

class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	// getter, setter

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.length() > 50) {
			return;
		}

		for (int i = 0; i < title.length(); i++) {
			char c = title.charAt(i);

			if ((c < '가' || c > '힣') && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
				return;
			}
		}

		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 0 && price <= 1000000) {
			this.price = price;
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPubYear() {
		return pubYear;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page >= 1) {
			this.page = page;
		} 
	}

	// dump
	public String info() {
		String result = "";

		result += "제목: " + this.title + "\n";
		result += "가격: " + String.format("%,d원", this.price) + "\n";
		result += "저자: " + this.author + "\n";
		result += "출판사: " + this.publisher + "\n";
		result += "발행년도: " + this.pubYear + "년\n";
		result += "ISBN: " + this.isbn + "\n";
		result += "페이지: " + String.format("%,d장", this.page) + "\n";

		return result;
	}
}
