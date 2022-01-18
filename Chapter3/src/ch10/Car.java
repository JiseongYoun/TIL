package ch10;

public abstract class Car {
	
	// 추상 메서드
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} // 구현부는 있으나 구현내용이 없음.

	
	// 변하면 안되는 시나리오들 이기 때문에 final로 선언
	final public void run() {
		startCar();  
		drive();
		stop();
		turnOff();
		washCar(); // 필요한 경우에 재정의.
	}

}
