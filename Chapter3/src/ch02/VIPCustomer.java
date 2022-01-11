package ch02;

public class VIPCustomer extends Customer {
	
	double salesRatio; // 제품살때 10프로 할인
	String agentID; // 담당 전문 상담원 배정
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
	}
	
	public String getAgentID() {
		return agentID;
	}

}
