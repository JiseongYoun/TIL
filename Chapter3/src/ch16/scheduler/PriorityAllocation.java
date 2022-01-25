package ch16.scheduler;
// PriorityAllocation : 우선순위가 높은 고객우선 숙련도 높은 상담원

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 call을 먼저 가져옵ㄴ디ㅏ.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 숙련도가 높은 상담원에게 먼저 배분합니다.");
	}

}
