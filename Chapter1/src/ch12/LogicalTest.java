package ch12;
/*12. �ڹ��� �����ڵ�
/ �� ���꿡�� ��� ���� ������� �ʴ� ��� - �ܶ� ȸ�� �� (short circuit evaluation)
/ �� ��(&&)�� �� ���� ����� ��� true�� ���� ����� true
-- ���� ���� ����� false�̸� �� ���� ����� ������ ����


�� ��(||)�� �� ���� ����� ��� false�� ���� ����� false
-- ���� ���� ����� true�̸� �� ���� ����� ������ ����*/

public class LogicalTest {
	
	public static void main(String[] args) {
		
//		int num1 = 10;
//		int i = 2;
//		
//		boolean value = ( (num1 = num1 + 10) < 10) && ( (i = i + 2) < 10 );
//		
//		System.out.println(value); //false
//		System.out.println(num1); //20
//		System.out.println(i);// ���� ���� �̹� false�̱� ������ ���� ���� ������� �ʴ´�. 2 �� ��µ�.
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10) < 10) || ( (i = i + 2) < 10 );
		
		System.out.println(value); //true
		System.out.println(num1); //20
		System.out.println(i);// ���� ���� �̹� true �̱� ������ ���� ���� ������� �ʴ´�. 4 �� ��µ�.
		
	}
	
}