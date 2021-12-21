package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2); // 두 값 다르기 때문에 0
		System.out.println(num1 ^ num2); // exclusive or
		System.out.println(~num1); // 틸드모르겠땅..
		System.out.printf("%X\n", num1);
		System.out.printf("%X\n", ~num1);
		
		
		System.out.println(num1 << 2); // 2의 2승 곱하면 20 출력.
		System.out.println(num1 << 4); // 5에 4의 2승 곱하면 80출력.
//		System.out.println(num1 <<= 2); // 값을 바꾸려면 대입연산자를 써줌.
		System.out.println(num1 >> 1); //
		
		System.out.println(num1 >> 2); // 2의 n승 만큼 나누기. 1 출력.
		System.out.println(num1 >> 1); // 2출력.

	}

}
