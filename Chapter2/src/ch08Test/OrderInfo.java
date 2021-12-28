package ch08Test;

// 출력했을 때,줄바꿈(개행) 부분 \n으로 처리해놨으나 OS 에 맞게 처리해야하기 때문에,
// lineSeparator를 사용해야함. 추가 공부필요
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
		return "주문 접수 번호 : " + orderNumber + "\n주문 핸드폰 번호 :" + orderPhoneNumber + "\n주문 집 주소 :" + orderAddress + "\n주문 날짜 :"  + orderDate + "\n주문 시간 :" + orderTime + "\n주문 가격 :" + orderPrice + "\n메뉴 번호 :" + orderMenuNumber; 
		
	}

}
