package com.test.java.obj.inheritance;

public class Ex47_Overriding {
	public static void main(String[] args) {

		// Ex46_Overriding.java

		// 두개 비교하는거 질문함 (면접질문) -> 근데 이런거 물어보는데 가지마
		// 메소드 오버로딩, Method Overloading
		// - 메소드 이름 동일 x N개 생성 > 인자 리스트 변화

		// 메소드 오버라이딩, Method Overriding
		// - 클래스 상속 시 발생
		// - 메소드 재정의 > 상속받은 메소드를 수정하는(덮어쓰는) 기술

		OverrideParent hong = new OverrideParent();
		hong.name = "홍길동";
		hong.hello();
		
		OverrideChild jhong = new OverrideChild();
		jhong.name = "홍철수";
		jhong.hello();
//		jhong.hi();
	}
}

class OverrideParent {
	public String name;

	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다.\n", this.name);
	}
}

class OverrideChild extends OverrideParent {
	//시간이 흘러... > 홍철수 중2
	//아빠 인사 방식 불만 > 내맘대로 인사할래
	//부모 클래스가 물려준 hello()를 사용하기 싫다
	//*** 클래스 상속은 부모가 물려준 멤버를 자식이 거부할 방법이 없다. 100%
	
//	public void hi() {
//		System.out.printf("하이~ 난 %s야~\n", this.name);
//	}
	
	//동일한 hello()를 2개 가지고 있다 > 에러 발생 (X)
	//> 무조건 자식이 우선한다. > 자식의 hello()가 호출
	
	//메소드 재정의(오버라이드) > 사실은 새로 만든 것. 근데 왜 수정했다고 하지? 내가 그렇게 보이니까.
	//@Override > 재정의되고 있다고 확실히 알려준다.
	public void hello() {
		System.out.printf("하이~ 난 %s야~\n", this.name);
	}
}