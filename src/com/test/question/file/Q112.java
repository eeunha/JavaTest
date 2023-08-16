package com.test.question.file;

import java.io.File;
import java.util.Scanner;

/*
	23.08.08
	
	Q. 지정한 파일을 다른 폴더로 이동하고, 이동한 파일과 동일한 파일명의 파일이 존재하는 경우 중복 처리하시오.

조건..
C:\class\java\file\AAA\test.txt → C:\class\java\file\BBB\test.txt 로 이동하는 것이 목적
BBB 폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.


입력..
파일 이동을 실행합니다.

같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) y 

출력..
y. 파일을 덮어썼습니다.


입력..
파일 이동을 실행합니다.

같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) n 

출력..
n. 작업을 취소합니다.
*/
public class Q112 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String originPath = "C:\\class\\code\\java\\file\\AAA\\test.txt";
		String newPath = "C:\\class\\code\\java\\file\\BBB\\test.txt";

		File orgFile = new File(originPath);

		if (!orgFile.exists())
			return;

		File newFile = new File(newPath);

		System.out.println("파일 이동을 실행합니다.");

		if (newFile.exists()) {
			System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) ");
			String answer = scan.nextLine();

			if (answer.equals("y")) {
				File deletedFile = new File(newPath);
				deletedFile.delete();
				orgFile.renameTo(newFile);
				System.out.println("y. 파일을 덮어썼습니다.");
			} else if (answer.equals("n")) {
				System.out.println("n. 작업을 취소합니다.");
			}
		} else {
			orgFile.renameTo(newFile);
		}

	}
}
