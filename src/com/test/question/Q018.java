package com.test.question;

public class Q018 {
	public static void main(String[] args) {
		int count = 0;

		count = positive(10);
		System.out.println("양수: " + count);

		count = positive(10, 20);
		System.out.println("양수: " + count);

		count = positive(10, 20, -30);
		System.out.println("양수: " + count);

		count = positive(10, 20, -30, 40);
		System.out.println("양수: " + count);

		count = positive(10, 20, -30, 40, 50);
		System.out.println("양수: " + count);
	}

	public static int positive(int n1) {
		int count = 0;
		if (n1 > 0)
			count++;
		return count;
	}

	public static int positive(int n1, int n2) {
		int count = 0;
		if (n1 > 0)
			count++;
		if (n2 > 0)
			count++;
		return count;
	}

	public static int positive(int n1, int n2, int n3) {
		int count = 0;
		if (n1 > 0)
			count++;
		if (n2 > 0)
			count++;
		if (n3 > 0)
			count++;
		return count;
	}

	public static int positive(int n1, int n2, int n3, int n4) {
		int count = 0;
		if (n1 > 0)
			count++;
		if (n2 > 0)
			count++;
		if (n3 > 0)
			count++;
		if (n4 > 0)
			count++;
		return count;
	}

	public static int positive(int n1, int n2, int n3, int n4, int n5) {
		int count = 0;
		if (n1 > 0)
			count++;
		if (n2 > 0)
			count++;
		if (n3 > 0)
			count++;
		if (n4 > 0)
			count++;
		if (n5 > 0)
			count++;
		return count;
	}
}
