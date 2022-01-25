package ch16.scheduler;
/* �����Ϳ� ��ȭ ����� �ϴ� �������� �ֽ��ϴ�. �ϴ� �����Լ� ��ȭ�� ���� ��⿭�� ����ǰ� �� �������� ����� �˴ϴ�.
  - ����� �Ǵ� ��å�� ũ�� �������� �ֽ��ϴ�.
   1. ��� ������ ������ ��� �Ǽ��� ó���ϵ��� ���� ������� ����մϴ�.
   2. �����ְų� �������� �Ҵ�� ��ȭ ���� ���� ���� �������� ����մϴ�.
   3. ���� ��޿� ���� ����� ���� ���� �����ɷ��� ����� �������� ����մϴ�. */

import java.io.IOException;

public class ShedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʴ�� ����մϴ�.");
		System.out.println("L : ��Ⱑ ���� ���� �켱���� ����մϴ�.");
		System.out.println("P : �켱������ ���� ���켱 ���õ� ���� ������ ����մϴ�.");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == '1') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
