package com.test.question.q93;

/*
	23.08.01
	
	Q093 Note.class 답
	
	잘못된 상황이 있을 경우 누군가에게 물어봐.
	확인받을 수 없다면? 냅두기
*/
class NoteAnswer {
	private String size;
	private String color;
	private int page;
	private String owner; // null
	private int price = 500;

	private String thickness;

	// setter, getter 구현
	public void setSize(String size) {
		if (size.equals("A3") || size.equals("A4") || size.equals("A5") || size.equals("B3") || size.equals("B4")
				|| size.equals("B5")) {

			this.size = size;

			if (size.equals("A3")) {
				this.price += 400;
			} else if (size.equals("A4")) {
				this.price += 200;
			} else if (size.equals("B3")) {
				this.price += 500;
			} else if (size.equals("B4")) {
				this.price += 300;
			} else if (size.equals("B5")) {
				this.price += 100;
			}
		}
	}

	public void setColor(String color) {
		if (color.equals("검정색") || size.equals("흰색") || size.equals("노란색") || size.equals("파란색")) {
			this.color = color;

			if (color.equals("검정색")) {
				this.price += 100;
			} else if (color.equals("노란색") || color.equals("파란색")) {
				this.price += 200;
			}
		}
	}

	public void setPage(int page) {
		if (page < 10 || page > 200)
			return;

		if (page >= 10 && page <= 50) {
			this.thickness = "얇은";
		} else if (page >= 51 && page <= 100) {
			this.thickness = "보통";
		} else {
			this.thickness = "두꺼운";
		}

		this.page = page;

		this.price += (page - 10) * 10;
	}

	public void setOwner(String owner) {
		// 유효성 검사
		// - 검사할 기준 1개 > 무관
		// - 검사할 기준 n개 > 잘못된 것을 찾기

//		// 글자수 검사
//		if (owner.length() >= 2 && owner.length() <= 5) {
//
//			// 한글 2자~5자 이내
//			boolean result = false;
//			for (int i = 0; i < owner.length(); i++) {
//				char c = owner.charAt(i);
//
//				if (c >= '가' && c <= '힣') {
//					result = true;
//				} else {
//					result = false;
//					break;
//				}
//			}
//
//			if (result) {
//				this.owner = owner;
//			}
//		}

		// 잘못된 것 찾는 검사 -> 가독성 좋음
		// 글자 수 검사
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

	public String info() {
		String temp = "";

		// 문자열(null)
		// if (owner != null) > 연산자 사용 -> 주소값 비교

		// 문자열("")
		// if (owner.equals("") > 메소드 사용 -> 값 비교

		temp += "■■■■■■ 노트 정보 ■■■■■■\n";

		if (this.owner != null) {
			temp += "소유자 : " + this.owner + "\n";
			temp += String.format("특성 : %s %s %s노트\n", this.color, this.thickness, this.size);
			temp += "가격 : " + this.price + "원\n";
		} else {
			temp += "주인 없는 노트\n";
		}

		temp += "■■■■■■ 노트 정보 ■■■■■■";

		return temp;
	}

}
