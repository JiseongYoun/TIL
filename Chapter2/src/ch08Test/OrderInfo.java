package ch08Test;

// ������� ��,�ٹٲ�(����) �κ� \n���� ó���س����� OS �� �°� ó���ؾ��ϱ� ������,
// lineSeparator�� ����ؾ���. �߰� �����ʿ�
public class OrderInfo {
	
	public String orderNumber;
	public String orderPhoneNumber;
	public String orderAddress;
	public String orderDate;
	public String orderTime;
	public String orderPrice;
	public String orderMenuNumber;
	
	public OrderInfo() {}
	
	public OrderInfo(String orderNumber, String orderPhoneNumber, String orderAddress, String orderDate, String orderTime, String orderPrice, String orderMenuNumber) {
		this.orderNumber = orderNumber;
		this.orderPhoneNumber = orderPhoneNumber;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.orderMenuNumber = orderMenuNumber;
	}
	
	public String showOrderInfo() {
		return "�ֹ� ���� ��ȣ : " + orderNumber + "\n�ֹ� �ڵ��� ��ȣ :" + orderPhoneNumber + "\n�ֹ� �� �ּ� :" + orderAddress + "\n�ֹ� ��¥ :"  + orderDate + "\n�ֹ� �ð� :" + orderTime + "\n�ֹ� ���� :" + orderPrice + "\n�޴� ��ȣ :" + orderMenuNumber; 
		
	}

}
