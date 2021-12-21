package ch20;
// 20. 반복문이 여러 번 포개진 중첩 반복문
/* 중첩 반복문이란?
 - 반복문 내부에 또 다른 반복문이 있음
 - 여러 겹으로 반복문을 겹쳐서 구현 가능 (단 수행시간에 문제가 발생할 수 있음)
 - 외부 반복문과 내부 반복문 간의 변수 값 변화에 유의 하며 구현하여야 함. */

public class NestedLoopTest {

	public static void main(String[] args) {
		
		// 1. for문을 통해 구구단 구현하기.
		int dan = 2;
		int count = 1;
		
//		for(; dan <= 9; dan++) {
//			
//			for(count=1; count<=9; count++) {
//				
//				System.out.println(dan + "X" + count + "=" + dan*count);
//			}
//			
//			System.out.println();
//		}
		
		// 2. while문을 통해 구구단 구현하기. 
		//    - while 로 2중 반복문을 쓸 때는 초기화를 한번 더 해줘야할지 체크할 것.
		dan = 2;
		count = 1;
		
		while(dan <= 9) {
			
			count = 1; //초기화를 안해주면 2단만 뜸.
			while(count <= 9) {
				System.out.println(dan + "X" + count + "=" + dan*count);
				count++;
			}
			dan++;
		}
	}
}
