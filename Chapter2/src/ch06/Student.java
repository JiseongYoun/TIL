package ch06;

public class Student {
	
	// 멤버변수
	public int studentNumber;
	public String studentName;
	public int grade;
	
	// null학생의 학번은0이고, 0학년입니다 -> 초기화됨
	// 초기화된 값을 매개변수로 다시 초기화함.
    public Student() {} //default 생성자
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber; 
    // this를 써야 멤버변수로 지정이됨.   // 매개변수
		this.studentName = studentName;
		this.grade = grade;
	} 
	
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은" + studentNumber + "이고, " + grade + "학년 입니다.";
	}

}
