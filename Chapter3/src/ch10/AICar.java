package ch10;
/* 10. �߻� Ŭ������ ���� - ���ø� �޼��� ���� 
 - �߻� �޼��峪 ���� �� �޼��带 Ȱ���Ͽ� �ڵ��� �帧(�ó�����)�� �����ϴ� �޼���
 - final�� �����Ͽ� ���� Ŭ�������� ������ �� �� ���� ��.
 - �����ӿ�ũ���� ���� ���Ǵ� ���� ���� */

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
		
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� �տ��� ������ ����ϴ�.");
		
	}

	@Override
	public void washCar() {
		System.out.println("�ڵ� ������ �մϴ�.");

	}


}
