package ch14;

public class Student {
	
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		             // 매개변수넘어옴.   // bus 인스턴스에 대해서 take라는 함수가 불려옴.
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentName  + "님의 남은 돈은 " + money + "원 입니다.");
	}

}

// take, bus, subway 메서드를 만들어야함.