package ch02;

public class VIPCustomer extends Customer {
	
	double salesRatio; // ��ǰ�춧 10���� ����
	String agentID; // ��� ���� ���� ����
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
	}
	
	public String getAgentID() {
		return agentID;
	}

}
