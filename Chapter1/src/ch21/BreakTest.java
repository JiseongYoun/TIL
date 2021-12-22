package ch21;
// 21. �߰��� ���ߴ� break��, �����ϰ� ��� �����ϴ� continue��
/* break�� ����ϱ�
 - ���ΰ� �ִ� ����� ����� ���� ������ ��� (switch�� ������ ���)
 - �ݺ��������� �ַ� ���ǹ�(if)�� ���� ����Ͽ� ���ǿ� �ش�Ǵ� ��� �ݺ� ������ ���߰� �ݺ��� �ܺη� ������ �̵�
 - ���� �ݺ����� ��ø�Ǿ� �ִ� ��쿣 break ���� ���ԵǾ� �ִ� �ݺ����� ���� ���� */

public class BreakTest {
   // 1���� ���ڸ� ���Ͽ� 100�� �Ѵ� ������ �� ���ڿ� ���� ����ϱ�.
	public static void main(String[] args) {
		int sum = 0;
		int num;
		
		for(num=1; sum <= 100; num++) {
			sum += num;
			if(sum >= 100)
				break; //100���� ũ�ų� ������ ����.
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
