package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "no name"); // vipcustomer로 생성을 했지만, customer타입으로 형 변환일어남.(customer의 변수만 쓸수있음.)
		
		vc.bonusPoint = 1000; // .뒤에는 customer 의 멤버변수와 메서드만 사용가능함.

	}

}
