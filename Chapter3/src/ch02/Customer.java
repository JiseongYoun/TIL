package ch02;
/* 멤버십 시나리오 
- 회사에서 고객 정보를 활용한 맞춤 서비스를 하기 위해 일반고객(Customer)과 
이보다 충성도가 높은 우수고객(VIPCustomer)에 따른 서비스를 제공하고자 함.

1. 물품을 구매 할때 적용되는 할인율과 적립되는 보너스 포인트의 비율이 다름 .
2. 여러 멤버십에 대한 각각 다양한 서비스를 제공할 수 있음.
3. 멤버십에 대한 구현을 클래스 상속을 활용하여 구현해보기. */

public class Customer {
	
	protected int customerID; // 고객 ID 하위클래스에서는 접근할수있는 protected 키워드 사용.(외부클래스는 사용못함.)
	protected String customerName; // 고객 이름
	protected String customerGrade; // 고객등급
	int bonusPoint; // 보너스포토인트
	double bonusRatio; // 보너스 포인트 적립 비율
	
	public Customer() {
		
		customerGrade = "SILVER"; //생성자를 만들어줌.
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
