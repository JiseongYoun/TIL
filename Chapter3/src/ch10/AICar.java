package ch10;
/* 10. 추상 클래스의 응용 - 템플릿 메서드 패턴 
 - 추상 메서드나 구현 된 메서드를 활용하여 코드의 흐름(시나리오)를 정의하는 메서드
 - final로 선언하여 하위 클래스에서 재정의 할 수 없게 함.
 - 프레임워크에서 많이 사용되는 설계 패턴 */

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 스스로 멈춥니다.");
		
	}

	@Override
	public void washCar() {
		System.out.println("자동 세차를 합니다.");

	}


}
