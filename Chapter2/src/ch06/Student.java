package ch06;

public class Student {
	
	// �������
	public int studentNumber;
	public String studentName;
	public int grade;
	
	// null�л��� �й���0�̰�, 0�г��Դϴ� -> �ʱ�ȭ��
	// �ʱ�ȭ�� ���� �Ű������� �ٽ� �ʱ�ȭ��.
    public Student() {} //default ������
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber; 
    // this�� ��� ��������� �����̵�.   // �Ű�����
		this.studentName = studentName;
		this.grade = grade;
	} 
	
	public String showStudentInfo() {
		
		return studentName + "�л��� �й���" + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
	}

}
