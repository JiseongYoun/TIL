package ch17;
// 17. �ݺ��� - while��

public class WhileTest {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0; //���������� �ʱ�ȭ ���� �ʴ´�. 0�̶�� �ʱ�ȭ����.
		
		while( num <= 10 ) {
			sum += num;   //���๮
			num++;
		}
		System.out.println(sum); // 1~10 ���ϸ� 55���.
		System.out.println(num); // ���������� 11�� ���.

	}

}
