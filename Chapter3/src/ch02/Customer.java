package ch02;
/* ����� �ó����� 
- ȸ�翡�� �� ������ Ȱ���� ���� ���񽺸� �ϱ� ���� �Ϲݰ�(Customer)�� 
�̺��� �漺���� ���� �����(VIPCustomer)�� ���� ���񽺸� �����ϰ��� ��.

1. ��ǰ�� ���� �Ҷ� ����Ǵ� �������� �����Ǵ� ���ʽ� ����Ʈ�� ������ �ٸ� .
2. ���� ����ʿ� ���� ���� �پ��� ���񽺸� ������ �� ����.
3. ����ʿ� ���� ������ Ŭ���� ����� Ȱ���Ͽ� �����غ���. */

public class Customer {
	
	protected int customerID; // �� ID ����Ŭ���������� �����Ҽ��ִ� protected Ű���� ���.(�ܺ�Ŭ������ ������.)
	protected String customerName; // �� �̸�
	protected String customerGrade; // �����
	int bonusPoint; // ���ʽ�������Ʈ
	double bonusRatio; // ���ʽ� ����Ʈ ���� ����
	
	public Customer() {
		
		customerGrade = "SILVER"; //�����ڸ� �������.
		bonusRatio = 0.01;
		
	}
	
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio; // ���ʽ�����Ʈ ��������.
		return price;
		
	}
	/* private �� ��� ���̾Ƹ�� ǥ�ö� source -> getter setter*/
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
		
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�."; 
	}

}
