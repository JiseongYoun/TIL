package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer; // 업캐스팅. buy타입으로 customer 매핑시킴.
		buyer.buy();
		buyer.order(); // 재정의된 메서드가 호출됌.
		
		Sell seller = customer;
		seller.sell();
		seller.order();

	}

}
