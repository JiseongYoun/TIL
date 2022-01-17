package ch09;
/*09. �߻� Ŭ����(abstract class) �����ϱ�
�߻� Ŭ������?
 - ���� �ڵ� ���� �޼����� ���� �ִ� �߻� �޼���(abstract method)�� ������ Ŭ����
 - �޼��� ����(declaration) : ��ȯŸ��, �޼��� �̸�, �Ű������� ����
 - �޼��� ����(definition) : �޼��� ����(implementation)�� ������ �ǹ� ������(body) �� ���� ({ })
 - abstract ���� ���
 - �߻� Ŭ������ new �� �� ���� ( �ν��Ͻ�ȭ �� �� ���� ) */

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�,");	
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}

}
