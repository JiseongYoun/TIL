package ch16.scheduler;
/* 고객센터에 전화 상담을 하는 상담원들이 있습니다. 일단 고객에게서 전화가 오면 대기열에 저장되고 각 상담원에게 배분이 됩니다.
  - 배분이 되는 정책은 크게 세가지가 있습니다.
   1. 모든 상담원이 동일한 상담 건수를 처리하도록 상담원 순서대로 배분합니다.
   2. 쉬고있거나 상담원에게 할당된 통화 수가 가장 적은 상담원에게 배분합니다.
   3. 고객의 등급에 따라 등급이 높은 고객은 업무능력이 우수한 상담원에게 배분합니다. */

import java.io.IOException;

public class ShedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담원 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례대로 상담합니다.");
		System.out.println("L : 대기가 적은 상담원 우선으로 상답합니다.");
		System.out.println("P : 우선순위가 높은 고객우선 숙련도 높은 상담원이 상담합니다.");
		
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
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
