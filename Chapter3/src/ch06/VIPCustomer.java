package ch06;

public class VIPCustomer extends Customer {
	
	double salesRatio; // 제품살때 10프로 할인
	String agentID; // 담당 전문 상담원 배정
	
//	public VIPCustomer() {
//		
//		super(0, "no-name"); // super키워드 : 하위클래스가 상위클래스의 인스턴스의 참조값을 가지게됨.
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		customerGrade = "VIP";
//		
//		System.out.println("VIPCustomer() call");
//		
//	}
//	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";  // 값들 바꿔줌.
		bonusRatio = 0.05;
		salesRatio = 0.1;

	}
	
	// in Eclipse : Source -> Override select.
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}



	public String getAgentID() {
		
		return agentID;
	}

}
