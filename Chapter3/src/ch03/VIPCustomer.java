package ch03;

public class VIPCustomer extends Customer {
	
	double salesRatio; // ��ǰ�춧 10���� ����
	String agentID; // ��� ���� ���� ����
	
//	public VIPCustomer() {
//		
//		super(0, "no-name"); // superŰ���� : ����Ŭ������ ����Ŭ������ �ν��Ͻ��� �������� �����Ե�.
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
		
		customerGrade = "VIP";  // ���� �ٲ���.
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	public String getAgentID() {
		
		return agentID;
	}

}
