package com.test.question.q100;

public class Packer {
	private static int pencilCount = 0;
	private static int eraserCount = 0;
	private static int ballPointPenCount = 0;
	private static int rulerCount = 0;

	void packing(Pencil pencil) {
		System.out.println("포장 전 검수 : " + pencil.getHardness() + " 진하기 연필입니다.");

		if (pencil.getHardness().equals("4B") || pencil.getHardness().equals("3B") || pencil.getHardness().equals("2B")
				|| pencil.getHardness().equals("B") || pencil.getHardness().equals("HB")
				|| pencil.getHardness().equals("H") || pencil.getHardness().equals("2HB")
				|| pencil.getHardness().equals("3H") || pencil.getHardness().equals("4H")) {

			System.out.println("포장을 완료했습니다.");
			Packer.pencilCount++;
		}
	}

	void packing(Eraser eraser) {
		System.out.println("포장 전 검수 : " + eraser.getSize() + " 사이즈 지우개입니다.");

		if (eraser.getSize().equals("Large") || eraser.getSize().equals("Medium") || eraser.getSize().equals("Small")) {
			System.out.println("포장을 완료했습니다.");
			Packer.eraserCount++;
		}
	}

	void packing(BallPointPen ballPointPen) {
		System.out.printf("포장 전 검수 : %s 색상 %.1fmm 볼펜입니다.\n", ballPointPen.getColor(), ballPointPen.getThickness());

		if (!ballPointPen.getColor().equals("red") && !ballPointPen.getColor().equals("blue")
				&& !ballPointPen.getColor().equals("green") && !ballPointPen.getColor().equals("black")) {
			return;
		}

		if (ballPointPen.getThickness() != 0.3 && ballPointPen.getThickness() != 0.5
				&& ballPointPen.getThickness() != 0.7 && ballPointPen.getThickness() != 1
				&& ballPointPen.getThickness() != 1.5) {
			return;
		}

		System.out.println("포장을 완료했습니다.");
		Packer.ballPointPenCount++;
	}

	void packing(Ruler ruler) {
		System.out.printf("포장 전 검수 : %dcm 줄자입니다.\n", ruler.getLength());

		if (ruler.getLength() != 30 && ruler.getLength() != 50 && ruler.getLength() != 100) {
			return;
		}

		if (!ruler.getShape().equals("줄자") && !ruler.getShape().equals("운형자") && !ruler.getShape().equals("삼각자")) {
			return;
		}

		System.out.println("포장을 완료했습니다.");
		Packer.rulerCount++;
	}

	void countPacking(int type) {
		if (type < 0 || type > 4) {
			return;
		}

		System.out.println("\n=====================");
		System.out.println("포장 결과");
		System.out.println("=====================");

		if (type == 0) { // 모든 내용물
			System.out.println("연필 " + Packer.pencilCount + "회");
			System.out.println("지우개 " + Packer.eraserCount + "회");
			System.out.println("볼펜 " + Packer.ballPointPenCount + "회");
			System.out.println("자 " + Packer.rulerCount + "회");

		} else if (type == 1) { // 연필
			System.out.println("연필 " + Packer.pencilCount + "회");
		} else if (type == 2) { // 지우개
			System.out.println("지우개 " + Packer.eraserCount + "회");
		} else if (type == 3) { // 볼펜
			System.out.println("볼펜 " + Packer.ballPointPenCount + "회");
		} else { // 자
			System.out.println("자 " + Packer.rulerCount + "회");
		}

	}
}
