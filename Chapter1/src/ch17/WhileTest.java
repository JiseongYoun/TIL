package ch17;
// 17. 반복문 - while문

public class WhileTest {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0; //지역변수는 초기화 되지 않는다. 0이라고 초기화해줌.
		
		while( num <= 10 ) {
			sum += num;   //수행문
			num++;
		}
		System.out.println(sum); // 1~10 더하면 55출력.
		System.out.println(num); // 빠져나오면 11이 출력.

	}

}
