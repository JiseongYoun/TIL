package ch18;
/* 18. static 응용 - 싱글톤 패턴(singleton pattern)
/ 싱글톤 패턴이란?
 - 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
 - static 변수, 메서드를 활용하여 구현 할 수 있음
 
 회사 객체는 유일해야함. */

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	// 외부에서 사용할수 있게 static으로 선언.
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}

}
