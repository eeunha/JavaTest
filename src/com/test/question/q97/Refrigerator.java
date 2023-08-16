package com.test.question.q97;

class Refrigerator {
	private Item[] items = new Item[100];
	private int idx = 0;

	public void add(Item item) {
		if (this.idx < items.length) {
			items[this.idx] = item;
			this.idx++;
		}
		System.out.printf("'%s'를 냉장고에 넣었습니다.\n", item.getName());
	}

	public Item get(String name) {
		// 배열 순회 - 이름이 같은 아이템 찾기 - left shift - 인덱스 줄이기

		System.out.println();

		Item item = null;

		for (int i = 0; i < this.idx; i++) {
			item = items[i];

			if (item.getName().equals(name)) {
//				for (int j = i; j < this.idx - 1; j++) {
//					items[j] = items[j + 1];
//				}
//				items[items.length - 1] = null;
				for (int j = i; j < this.idx; j++) {
					items[j] = items[j + 1];
				}
				this.idx--;
				break;
			}
		}
//		System.out.println(this.idx);
		return item;
	}

	public int count() {
		return this.idx;
	}

	public void listItem() {
		System.out.println("\n[냉장고 아이템 목록]");
		for (int i = 0; i < idx; i++) {
			Item item = items[i];
			System.out.printf("%s(%s)\n",item.getName(), item.getExpiration());
		}
	}
}
