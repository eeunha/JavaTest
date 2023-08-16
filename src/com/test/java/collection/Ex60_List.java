package com.test.java.collection;

import java.util.ArrayList;

public class Ex60_List {
	
	public static void main(String[] args) {
		
		//Ex60_List.java
		
		/*	
		 
		 	컬렉션, Collection
		 	-JCF, Java Collection Framework
		 	- 배열
		 	- (향상된) 배열
		 	- 기존의 순수 배열
		 		- 사용법 개량
		 		- 용도에 따른 입출력 방식/효율성 개량
		 	- 클래스 + 내부 순수 배열을 가지고 있다.
		 	- 길이가 가변이다 > 방의 개수를 마음대로 늘리고 줄이는게 가능
		 	- 자료 구조
		 	
		 	
		 	컬렉션 종류
		 	
		 	1.List 계열
		 		- ArrayList(*****) > 연습 많이 해야함
		 		- LinkedList
		 		- Queue
		 		- Stack
		 		- Vector(legacy)> 언젠간 사라질 수도 ..? 많이 안써서
		 		
		 	2. Set 계열
		 		- HashSet
		 		- TreeSet
		 	
		 	3. Map 계열
		 		- HashMap(****)
		 		- TreeMap
		 		- Properties(legacy)언젠간 사라질 수도 ..? 많이 안써서
		 		- HashTable(legacy)언젠간 사라질 수도 ..? 많이 안써서
		 	
		 	//List,  Set,  Map >> 인터페이스
		 	
		 	
		 	Collection(Interface)
		 	- List
		 	- Set
		 	
		 	- Map
		 	
		 	>> List, Set은 비슷한데 Map 아예 다른 느낌
		 	
		 	
		 	ArrayList 클래스
		 	- ArrayList(C) -> List(I) -> Collection(I)
		 	- 순수 배열과 구조가 가장 유사함
		 	- 첨자(index)를 사용해서 요소(element)에 접근
		 	
		 	
		 */

		//m1();
		//m2();
		//m3();
		//m4();
		
		//m5();
		m6();
		
	}//main

	private static void m6() {
		
		//컬렉션 초기 용량 > 내부 배열의 초기 길이
		ArrayList<Integer> list = new ArrayList<Integer>(10); //()안에 넣은 숫자 만큼의 배열을 만들음(낭비 방지)
															// 길이가 얼마나 될 지 모르면 갯수 안적어도 됌
		
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.add(10); //이젠 더이상 추가 계획 없음(확신)
		list.trimToSize(); //데이터가 들어있는 만큼의 길이로 재조정
	}

	private static void m5() {
		
		//ArrayList(컬렉션) 특징
		//1. 내부에 배열을 가지고 있다.
		//2. ArrayList 클래스의 대부분의 기능이 내부 배열을 조작하는 기능으로 구성
		//3. ??? 길이가 가변 > 데이터를 계속 넣으면 .. 계속 공간이 늘어난다??
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		for(int i=0; i<1000000; i++) {
//			list.add(i);
//		}
//		System.out.println(list.size());
//		
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		System.out.println(list.size());
		
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.size());
		
		list.add(50);
		System.out.println(list.size());
		
	
	
	
	}

	private static void m4() {
		
		//성적표
		//학생(이름,국어,영어, 수학, 총점, 평균)
		
		//선택?
		//- 길이로 판단  >  학생이 몇명?
		//- 배열(고정) vs ArrayList(불확실)
		
		//Student[]	 list;
		ArrayList<Student> list = new ArrayList<Student>();
		
		for(int i=0; i<10; i++) {
			
			int kor = (int)(Math.random() * 41) + 60; //60~100점
			int eng = (int)(Math.random() * 41) + 60; //60~100점
			int math = (int)(Math.random() * 41) + 60; //60~100점

			Student s = new Student("학생" + i, kor, eng, math);
			
			list.add(s); //배열에 학생이 추가!!
			
		}
		
		System.out.println(list);
		
		System.out.println("=============================================");
		System.out.println("                  성적표");
		System.out.println("=============================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for(Student s :list) {
			
			int total = s.getKor() + s.getEng() + s.getMath();
			double avg = total /3.0;
			
			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
								,s.getName()
								,s.getKor()
								,s.getEng()
								,s.getMath()
								,total
								,avg);
		}
		
	}

	private static void m3() {
		
		
		//차원
		int[] ns1 = new int[3];
		int[][] ns2 = new int[3][3];
		int[][][] ns3 = new int[3][3][3];
		
		ArrayList<Integer> ms1 = new ArrayList<Integer>();//1차원 
		
		ArrayList<ArrayList<Integer>> ms2
			= new ArrayList<ArrayList<Integer>>();//2차원
		
		ArrayList<ArrayList<ArrayList<Integer>>> ms3
			= new ArrayList <ArrayList<ArrayList<Integer>>>();//3차원
		
		
		
		
		
		
	}

	private static void m2() {
	
		//ArrayList 용법
		ArrayList<String> list = new ArrayList<String>();
		
		//CRUD
		//- Create(쓰기) // add
		//- Read(읽기) 	// get
		//- Update(수정)	// set
		//- Delete(삭제)
		
		//1. 요소 추가하기
		// - boolean add(T value)
		//- 배열의 맨 마지막에 추가하기 > Append
		list.add("바나나");
		list.add("딸기");
		list.add("사과");
		list.add("귤");
		list.add("파인애플");
		
		//2.  요소의 개수
		//- int size()
		System.out.println(list.size()); //5
		
		//3. 요소 접근(읽기)
		// - T get(int index)
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		System.out.println(list.get(list.size()-1));
		
		
		//java.lang.IndexOutOfBoundsException
		//Index 5 out of bounds for length 5
		//System.out.println(list.get(5));//없는 방번호
		
		//4. 요소 수정
		//- list[0] = 10; 대입 or 수정
		//- String set(int index, T newValue)
		String temp = list.set(2, "포도");
		System.out.println(list.get(2));
		System.out.println(temp);
		System.out.println();
		
		//5.요소 삭제
		//- 순수 배열의 요소(방)을 삭제 할 수 있니 ? > 불가능
		//- 컬렉션은 요소 삭제 가능하니 ? > 가능
		//- T remove(int index) > 방번호를 찾아서 삭제
		//- boolean remove(T value) > 값을 찾아서 삭제
		//- *** 시프트가 발생한다!! > 삭제된 방 이후의 모든 요소는 모두 방번호 -1씩 감소 (방번호를 비워둘 수 없으니까)
		
		
		System.out.println(list.get(1));//딸기
		System.out.println(list.get(2));//포도
		System.out.println(list.get(3));//귤
		System.out.println();

		//list.remove(2); > //포도가 어디 있는 방번호로 삭제 가능
		//list.remove("포도"); > 가능하지만 실제로는 잘 안씀 
							// 만약 포도가 2개 이상이면 무조건 그 중에 첫번째 만나는 포도를 지움 (두번째를 지우고 싶어도 첫번째 포도를 지우고 가능)
		System.out.println(list.get(1));//딸기
		System.out.println(list.get(2));//귤
		System.out.println(list.get(3));//파인애플
		System.out.println();
		
		//6. 탐색
		//- 루프
		
		for(int i=0; i<list.size(); i++) {
			System.out.printf("list.get(%d) = %s\n"
											, i, list.get(i));
		}
		System.out.println();
		
		//향상된 for문(foreach문)
		
	//	for(변수 : 배열/컬렉션) {//가끔 콜론 대신 in 이라고 적음
	//		}
		
		for(String item :list) { //무조건 처음에 집합 list로 가서 첫번째 요소를 item에 넣고 사용, 다음은 딸기...남아있지 않을 때까지 돌림
			System.out.println(item);
		}// 갱장히 많이 사용
		System.out.println();
		
		//7. 덤프
				//- Arrays.toString(배열)
				
		System.out.println(list.toString());
		System.out.println(list);
		
		
		//8. 요소 추가(새치기, 중간에 끼워 놓기)
		//- 배열의 원하는 위치에 요소를 추가 > Insert(새치기)
		//- void add(index index, T value)
		//- *** 시프트가 발생한다(하나씩 뒤로 밀려남).  > 삽입된 방 이후의 모든 요소의 방번호 + 1
		
		list.add(2,"망고");
		
		System.out.println(list);
		System.out.println();
		
		//9. 기타 등등
		System.out.println(list.indexOf("사과")); //indexOf 방번호를 알려주는 메소드 못찾으면 -1 돌려줌
		System.out.println(list.indexOf("귤"));
		System.out.println(list.lastIndexOf("파인애플"));
		System.out.println(list.contains("망고"));// list에 망고가 있니?
		System.out.println();
		System.out.println();
		//10. 
	
		System.out.println(list.isEmpty());
		list.clear(); //모든 요소 삭제 > 초기화
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);
	
	
	}

	private static void m1() {
	
		//순수 배열 선언
		//- 타입 명시(int)
		//- 길이 명시(3)
		int[]num1 = new int[3];
		
		//요소 접근 > 첨자(index) 사용 > Indexer
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);
		
		System.out.println(num1.length);// 순수배열
		
		
		//컬렉션
		//- 타입 명시(Integer) > 제네릭
		//- 길이 명시(???) > 가변
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		
		//요소 추가 > 첨자? > add() == append > 차례대로 마지막 방에 넣어라
		num2.add(10);	 //0번째 방
		num2.add(20);	//1번째 방
		num2.add(30);	//2번째 방
		
		System.out.println(num2.get(0));//num1[0]/ 배열에 인덱스 넣는 것 처럼 방번호로 요소를 출력
		System.out.println(num2.get(1));
		System.out.println(num2.get(2));
		
		System.out.println(num2.size());//3
		//배열은 길이를 볼 때 length를 사용 하지만 컬렉션은 size 사용
		
		num2.add(40);
		num2.add(50);
		
		System.out.println(num2.size());
		
		
		
	}
}//class




















