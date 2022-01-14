package ch06;

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
