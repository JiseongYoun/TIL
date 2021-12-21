package ch19;
// 19. 반복문 - for 문
/* for (초기화식; 조건식; 증감식;){
 *       수행문;
 *       .....
 *      } 
 */

public class ForTest {

	public static void main(String[] args) {
		
		// 1. for문을 통해 1부터 10까지 더한 결과 출력하기.
		int count = 1;
		int sum = 0;
		
		for(int i=0; i<10; i++, count++) {
			sum += count;
			
		}
		System.out.println(sum);
		
		
		// 2. while문을 통해 1부터 10까지 더한 결과 출력하기.
		int num = 1;  //초기화를 바깥 변수에서 해줌.
		int total = 0;
		
		while(num<=10) {
			total+= num;
			num++;
		}
		System.out.println(total);
	}

}
