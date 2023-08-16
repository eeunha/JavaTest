//주석, Comment
// - 컴파일 작업 때 제외하는 영역

//단일 라인 주석. 엔터까지 주석 영역

/*
	다중 라인 주석
	2
	3
	4
*/

/*
 * 길어질 것을 대비해 앞에 별이 나오게 만들었다.
 * 첫 줄에서 엔터치면 별이 붙는다.
 * */

//단축키 사용
// -단일 라인: Ctrl + / (주로 사용)
// -다중 라인: Ctrl + Shift + /, Ctrl + Shift + \

//패키지선언
//- 현재 자바 파일이 어떤 패키지 내에 위치하는지 표현
package com.test.java;

//클래스, Class
//- 코드의 집합(에 이름을 붙인 것)
//- public class Ex01 : 클래스 선언부(Header)
//- {} : 클래스 몸통(Body), 구현부

//"Ex01이라는 클래스입니다."
public class Ex01 {

	// 메소드, Method
	// - 코드의 집합
	public static void main(String[] args) {
		// 명령어 > 문장 단위 구성
		// 자바의 문장 종결자: ';'

		// - System: 클래스
		// - . : 멤버 접근 연산자(Member Access Operator) 부모.자식
		// - out: 필드(field)
		// - println(): 메소드 호출
		// - "Hi": 문자열 리터럴
		System.out.println("Hi");

		// 클릭한 뒤 나타나는 깜박이는 막대 = caret
		/*
		 * 특수문자(영문 표현) 
		 * - ~(Tilde), !, @(at), #, $, %, ^(caret, xor), &, *, -, _, =, + 
		 * -;, :, ', ", ?, /(slash), \(back slash) 
		 * - `(역따옴표, back quote, back tick) 
		 * -|(pipe, vertical bar, or) 
		 * - (): 소괄호 
		 * - {}: 중괄호, 브래이스 
		 * - []: 대괄호, 브래킷 
		 * - <>: 화살표 괄호
		 * 
		 * 폰트 > 프로그래밍 폰트 추천 
		 * - 1, l, I, |, i - 0, o, O, D - ", ''
		 * 
		 * 이클립스 > 코드 자동 완성 > Ctrl + Space 
		 * - 현재 상태에서 사용 가능한 문법만 보여준다.(****)
		 */

		// 100 입력하고 tab 누르면 맨 끝으로 커서가 이동한다.
		// 녹색 바의 위치를 잘 보자. 탭을 누르면 녹색 바로 위치가 이동한다.
		System.out.println(100);

		// Ctrl + Alt + 방향키(위/아래) -> 행 복사(블럭단위도 가능)
		// Alt + 방향키(위/아래) -> 행 이동(블럭단위도 가능)
		System.out.println(100);
		System.out.println(200);
		System.out.println(300);

		// Shift + 방향키(위, 아래, 좌, 우, Home, End)
		// Shift + Ctrl + 방향키

		// Ctrl + D -> 행 삭제

		// Ctrl + Shift + L -> 전체 단축키 목록
		
		// Ctrl + F6 -> 다른 탭으로 전환 > Ctrl + Tab(단축키 설정 변경)
	}
}
