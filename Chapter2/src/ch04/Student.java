package ch04;

public class Student {
	
	// ��ü �Ӽ��� ������.
	public int studentID;
	public String studentName;
	public String address;
	
	// �޼��带 ����.
	public void showStudentInfo() {
		System.out.println(studentID + "�й��� �̸���" + studentName + " �̰�, �ּҴ�" + address + "�Դϴ�.");
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
