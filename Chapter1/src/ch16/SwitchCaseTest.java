package ch16;
// 16. 조건이 여러 개 일 때 간단히 표현되는 switch-case 문
// 자바 14부터 좀 더 간결한 표현식 지원됨. (break 사용 x. ) -> 식형
// 하단에 작성한 코드는 기본적으로 사용하는 switch case 문. break 사용 o. -> 구문형
import java.util.Scanner;

//한 달이 며칠인지 알려주는 프로그램 구현하기.
public class SwitchCaseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day;
		
		switch(month) {
		
		  case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			  day = 31;
		   break;
		  case 2:
			  day = 28;
		   break;

		  case 4:
			  day = 30;
		   break;

		  case 6:
			  day = 30;
		   break;
	
		  case 9:
			  day = 30;
		   break;

		  case 11:
			  day = 30;
		   break;
		  default:
			  System.out.println("존재하지 않는 달입니다.");
			  day = -1;
		}
		
		System.out.println(month + "월은 " + day + "일 입니다.");

	}

}
