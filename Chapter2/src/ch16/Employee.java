// 16. 여러 인스턴스에서 고통으로 사용하는 변수를 선언하자 - static 변수
/* 공통으로 사용하는 변수가 필요한 경우
 - 여러 인스턴스가 공유하는 기준 값이 필요한 경우
 - 학생마다 새로운 학번 생성
 - 카드회사에서 카드를 새로 발급할때마다 새로운 카드 번호를 부여
 - 회사에 사원이 입사할때 마다 새로운 사번이 필요한 경우 */
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
