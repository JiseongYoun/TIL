package ch18;
// 18. �ݺ��� - do-while��
// while���� ������ ���� üũ�ϰ� �ݺ� ������ �ȴٸ�, do-while�� ���ǰ� ��� ���� ������ �� �� �ϰ��� ������ üũ

/* do {
 *  ���๮1;
 *  ...
 *  } while(���ǽ�);
 *  ���๮2;
 *  ...
 *  */

//������ ���� ������(true �� �ƴϸ�) �� �̻� �������� ����.

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		do{
			input = scanner.nextInt();
			sum += input;
		} while(input!=0);  //0�� �ƴϸ� ����
		
		System.out.println(sum);

	}

}
