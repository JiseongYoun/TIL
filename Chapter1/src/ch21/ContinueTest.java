package ch21;
// �ݺ��� ���ο��� ���ǹ�(if)�� ���� ����ϸ�,
// ������ �´� ���(true �̸�) ���� �ݺ��� �� ������ �ٸ� ���๮���� �������� ����.
public class ContinueTest {

	public static void main(String[] args) {
		// 1���� 100���� ���� �� 3�� ����� ����ϱ�.
		int num;
		for( num=1; num<=100; num++) {
			if( (num % 3) != 0) continue; // 3�� ����� �ƴϸ� �����.
			
			System.out.println(num);
		}

	}

}
