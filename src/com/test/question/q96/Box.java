package com.test.question.q96;

class Box {
	private Macaron[] list = new Macaron[10];

	public void cook() {
		// 무작위로 마카롱 만들어서 list 배열에 넣기

		// 랜덤으로 크기 결정(5~15), 실제 판매가능은 8~14
		// 색상도 난수로 생성하기. 근데 검은색은 판매 불가
		// 샌드두께도 난수로 생성하기.(1~20) 3~18

		String[] colors = { "red", "blue", "yellow", "white", "pink", "purple", "green", "black" };

		for (int i = 0; i < this.list.length; i++) {
			// 크기 - 랜덤
			int size = (int) (Math.random() * 11) + 5;

			// 색상 - 랜덤
			int colorIdx = (int) (Math.random() * colors.length);

			// 두께 - 랜덤
			int thick = (int) (Math.random() * 20) + 1;

			Macaron m = new Macaron();
			m.setSize(size);
			m.setColor(colors[colorIdx]);
			m.setThickness(thick);

			this.list[i] = m;
		}

		System.out.println("마카롱을 " + this.list.length + "개 만들었습니다.\n");
	}

	public void check() {
		int count = 0;

		System.out.println("[박스 체크 결과]");

		// list에서 마카롱을 하나씩 꺼내 규격에 맞는지 검사한다.
		// 규격에 맞는 마카롱 개수 출력
		// 규격에 맞지 않는 마카롱 개수 출력

		for (int i = 0; i < list.length; i++) {
			Macaron m = list[i];

			if (m.getSize() < 8 || m.getSize() > 14 || m.getColor().equals("black") || m.getThickness() < 3
					|| m.getThickness() > 18) {
				m.setOx("불합격");
				continue;
			}

			m.setOx("합격");
			count++;
		}

		System.out.printf("QC 합격 개수 : %d개\n", count);
		System.out.printf("QC 불합격 개수 : %d개\n\n", this.list.length - count);

	}

	public void list() {
		System.out.println("[마카롱 목록]");
		for (int i = 0; i < list.length; i++) {
			Macaron m = list[i];
			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : %s\n", i + 1, m.getSize(), m.getColor(), m.getThickness(),
					m.getOx());
		}
	}
}