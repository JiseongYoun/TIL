package ch02;

public class EqualsTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		
		System.out.println(std1 == std2); //주소는 다르지만
		System.out.println(std1.equals(std2)); // 논리적으로는 같기때문에 true가 반한됌.
		
		System.out.println(std1.hashCode()); // 10진수 주소값 반환됌.
		System.out.println(std2.hashCode());
		
		System.out.println(System.identityHashCode(std1)); // 실제 hashcode 주소값을 출력함.
		System.out.println(System.identityHashCode(std2));
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone(); //clone메서드 사용. 하위클래스도 복제해서 사용할 수 있음.
		System.out.println(copyStudent);

	}

}
