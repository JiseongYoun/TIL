package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2); // �� �� �ٸ��� ������ 0
		System.out.println(num1 ^ num2); // exclusive or
		System.out.println(~num1); // ƿ��𸣰ڶ�..
		System.out.printf("%X\n", num1);
		System.out.printf("%X\n", ~num1);
		
		
		System.out.println(num1 << 2); // 2�� 2�� ���ϸ� 20 ���.
		System.out.println(num1 << 4); // 5�� 4�� 2�� ���ϸ� 80���.
//		System.out.println(num1 <<= 2); // ���� �ٲٷ��� ���Կ����ڸ� ����.
		System.out.println(num1 >> 1); //
		
		System.out.println(num1 >> 2); // 2�� n�� ��ŭ ������. 1 ���.
		System.out.println(num1 >> 1); // 2���.

	}

}
