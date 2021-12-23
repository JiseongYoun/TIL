package ch04;

// 클래스 생성
public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		        //참조변수      //생성자
		
		//인스턴스 생성
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		             // 메서드      // 매개변수
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim); // 힙 메모리의 가상주소가 출력됌.
		System.out.println(studentKim);

	}

}
