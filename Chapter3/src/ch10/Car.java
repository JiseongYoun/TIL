package ch10;

public abstract class Car {
	
	// �߻� �޼���
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {} // �����δ� ������ ���������� ����.

	
	// ���ϸ� �ȵǴ� �ó������� �̱� ������ final�� ����
	final public void run() {
		startCar();  
		drive();
		stop();
		turnOff();
		washCar(); // �ʿ��� ��쿡 ������.
	}

}
