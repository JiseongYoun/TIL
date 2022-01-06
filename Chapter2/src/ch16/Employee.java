// 16. ���� �ν��Ͻ����� �������� ����ϴ� ������ �������� - static ����
/* �������� ����ϴ� ������ �ʿ��� ���
 - ���� �ν��Ͻ��� �����ϴ� ���� ���� �ʿ��� ���
 - �л����� ���ο� �й� ����
 - ī��ȸ�翡�� ī�带 ���� �߱��Ҷ����� ���ο� ī�� ��ȣ�� �ο�
 - ȸ�翡 ����� �Ի��Ҷ� ���� ���ο� ����� �ʿ��� ��� */
package ch16;

public class Employee {
	
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
