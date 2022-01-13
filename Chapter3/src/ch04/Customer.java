package ch04;
/*04. 메서드 재정의하기(overring)
하위 클래스에서 메서드 재정의 하기
- 오버라이딩(overriding) : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우
하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음.
- VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않음.
- 재정의 하여 구현해야 함 */

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
