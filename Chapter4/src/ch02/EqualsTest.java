package ch02;

public class EqualsTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		
		System.out.println(std1 == std2); //�ּҴ� �ٸ�����
		System.out.println(std1.equals(std2)); // �������δ� ���⶧���� true�� ���щ�.
		
		System.out.println(std1.hashCode()); // 10���� �ּҰ� ��ȯ��.
		System.out.println(std2.hashCode());
		
		System.out.println(System.identityHashCode(std1)); // ���� hashcode �ּҰ��� �����.
		System.out.println(System.identityHashCode(std2));
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone(); //clone�޼��� ���. ����Ŭ������ �����ؼ� ����� �� ����.
		System.out.println(copyStudent);

	}

}
