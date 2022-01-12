package ch03;
/*03. 상속에서 클래스 생성 과정과 형 변환
하위 클래스가 생성 되는 과정
 - 하위 클래스를 생성하면 상위 클래스가 먼저 생성 됨.
 - new VIPCustomer()를 호출하면 Customer()가 먼저 호출 됨.
 - 클래스가 상속 받은 경우 하위 클래스의 생성자에서는 반드시 상위 클래스의 생성자를 호출 함. */

public class Customer {
	
	protected int customerID; // 고객 ID 하위클래스에서는 접근할수있는 protected 키워드 사용.(외부클래스는 사용못함.)
	protected String customerName; // 고객 이름
	protected String customerGrade; // 고객등급
	int bonusPoint; // 보너스포토인트
	double bonusRatio; // 보너스 포인트 적립 비율
	
//	public Customer() { // default constructor -> super
//		
//		customerGrade = "SILVER"; //생성자를 만들어줌.
//		bonusRatio = 0.01;
//		
//		System.out.println("Customer() call");    
//		
//	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) call");
	}
	
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio; // 보너스포인트 적립해줌.
		return price;
		
	}
	/* private 은 노란 다이아몬드 표시뜸 source -> getter setter*/
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다."; 
	}

}
