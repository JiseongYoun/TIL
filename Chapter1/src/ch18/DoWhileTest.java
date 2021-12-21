package ch18;
// 18. 반복문 - do-while문
// while문은 조건을 먼저 체크하고 반복 수행이 된다면, do-while은 조건과 상관 없이 수행을 한 번 하고나서 조건을 체크

/* do {
 *  수행문1;
 *  ...
 *  } while(조건식);
 *  수행문2;
 *  ...
 *  */

//조건이 맞지 않으면(true 가 아니면) 더 이상 수행하지 않음.

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		do{
			input = scanner.nextInt();
			sum += input;
		} while(input!=0);  //0이 아니면 수행
		
		System.out.println(sum);

	}

}
