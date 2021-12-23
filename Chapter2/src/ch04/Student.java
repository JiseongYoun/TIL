package ch04;

public class Student {
	
	// 객체 속성을 선언함.
	public int studentID;
	public String studentName;
	public String address;
	
	// 메서드를 만듬.
	public void showStudentInfo() {
		System.out.println(studentID + "학번의 이름은" + studentName + " 이고, 주소는" + address + "입니다.");
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
