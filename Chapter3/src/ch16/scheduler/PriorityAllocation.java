package ch16.scheduler;
// PriorityAllocation : �켱������ ���� ���켱 ���õ� ���� ����

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� call�� ���� �����ɤ���.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���õ��� ���� �������� ���� ����մϴ�.");
	}

}
