package ch16;
// 16. 조건이 여러 개 일 때 간단히 표현되는 switch-case 문
// 자바 14부터 좀 더 간결한 표현식 지원됨. (break 사용 x. ) -> 식형. 람다식표현.  yield 사용해서 값을 반환 받을 수 있다.
import java.util.Scanner;

//한 달이 며칠인지 알려주는 프로그램 구현하기.
public class SwitchCaseTest02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch(month) {
		
		  case 1,3,5,7,8,10,12 -> {
			  System.out.println("이번달은 31일 까지 입니다.");
			  yield 31;
		  }
		  case 2 ->
			  28;
		  case 4, 6, 9, 11 ->
			  30;
		  default -> {
			  System.out.println("존재하지 않는 달입니다.");
			  yield -1;
		 }
		};
		
		System.out.println(month + "월은 " + day + "일 입니다.");

	}

}
