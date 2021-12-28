package ch08Test;

public class OrderInfoTest {
	
	public static void main(String[] args) {
		
		OrderInfo updateOrder = new OrderInfo();
		
		updateOrder.orderNumber = "20211227";
		updateOrder.orderPhoneNumber = "01012345678";
		updateOrder.orderAddress = "서울시 강남구 역삼동 11-1";
		updateOrder.orderDate = "20211227";
		updateOrder.orderTime = "1900";
		updateOrder.orderPrice = "25000";
		updateOrder.orderMenuNumber = "001";
		
		System.out.println(updateOrder.showOrderInfo());
		
	}

}
