package ch12;
/*12. 자바의 연산자들
/ 논리 연산에서 모든 항이 실행되지 않는 경우 - 단락 회로 평가 (short circuit evaluation)
/ 논리 곱(&&)은 두 항의 결과가 모두 true일 때만 결과가 true
-- 앞의 항의 결과가 false이면 뒤 항의 결과를 평가하지 않음


논리 합(||)은 두 항의 결과가 모두 false일 때만 결과가 false
-- 앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음*/

public class LogicalTest {
	
	public static void main(String[] args) {
		
//		int num1 = 10;
//		int i = 2;
//		
//		boolean value = ( (num1 = num1 + 10) < 10) && ( (i = i + 2) < 10 );
//		
//		System.out.println(value); //false
//		System.out.println(num1); //20
//		System.out.println(i);// 앞의 항이 이미 false이기 때문에 뒤의 항은 수행되지 않는다. 2 가 출력됨.
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10) < 10) || ( (i = i + 2) < 10 );
		
		System.out.println(value); //true
		System.out.println(num1); //20
		System.out.println(i);// 앞의 항이 이미 true 이기 때문에 뒤의 항은 수행되지 않는다. 4 가 출력됨.
		
	}
	
}