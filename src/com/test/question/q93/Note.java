package com.test.question.q93;

class Note {
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;

	// setter, getter 구현 -> Alt + Shift + S

	public String info() {
		String result = "■■■■■■ 노트 정보 ■■■■■■\n";

		if (this.owner == null) { // 예외
			return result + "주인 없는 노트\n■■■■■■■■■■■■■■■■■■■■■■\n";
		}

		// 소유자
		result += "소유자 : " + this.owner + "\n";

		// 특성
		result += "특성 : " + this.color + " ";

		// 두께 확인
		result += checkThickness() + " ";

		result += this.size + "노트\n";

		// 가격
		result += "가격 : " + String.format("%,d원", calcPrice()) + "\n";

		result += "■■■■■■■■■■■■■■■■■■■■■■\n";
		return result;
	}

	private int calcPrice() {
		int price = 500;

		// 크기 변경
		if (this.size.equals("A3")) {
			price += 400;
		} else if (this.size.equals("A4")) {
			price += 200;
		} else if (this.size.equals("B3")) {
			price += 500;
		} else if (this.size.equals("B4")) {
			price += 300;
		} else if (this.size.equals("B5")) {
			price += 100;
		}

		// 색상 변경
		if (this.color.equals("검정색")) {
			price += 100;
		} else if (this.color.equals("노란색") || this.color.equals("파란색")) {
			price += 200;
		}

		// 페이지수 변경
		if (this.page > 10) {
			int additionalPage = this.page - 10;
			price += additionalPage * 10;
		}

		this.price = price;
		return this.price;
	}

	private String checkThickness() {
		if (this.page >= 10 && this.page <= 50) {
			return "얇은";
		} else if (this.page >= 51 && this.page <= 100) {
			return "보통의";
		} else {
			return "두꺼운";
		}
	}

	public void setSize(String size) {
		String[] sizes = { "A3", "A4", "A5", "B3", "B4", "B5" };

		for (int i = 0; i < sizes.length; i++) {
			if (size.equals(sizes[i])) {
				this.size = size;
				return;
			}
		}
		System.out.println("올바르지 않은 크기");
	}

	public void setColor(String color) {
		String[] colors = { "검정색", "흰색", "노란색", "파란색" };
		for (int i = 0; i < colors.length; i++) {
			if (color.equals(colors[i])) {
				this.color = color;
				return;
			}
		}
		System.out.println("올바르지 않은 색상");
	}

	public void setPage(int page) {
		if (page >= 10 && page <= 200) {
			this.page = page;
		} else {
			System.out.println("올바르지 않은 페이지수");
		}
	}

	public void setOwner(String owner) {
		// 한글인지도 검사하기

		if (owner.length() < 2 || owner.length() > 5) {
			return;
		}

		// 한글 검사
		for (int i = 0; i < owner.length(); i++) {

			char c = owner.charAt(i);

			if (c < '가' || c > '힣') {
				return;
			}
		}

		this.owner = owner;
	}
}
