package ch20;
// 20. �ݺ����� ���� �� ������ ��ø �ݺ���
/* ��ø �ݺ����̶�?
 - �ݺ��� ���ο� �� �ٸ� �ݺ����� ����
 - ���� ������ �ݺ����� ���ļ� ���� ���� (�� ����ð��� ������ �߻��� �� ����)
 - �ܺ� �ݺ����� ���� �ݺ��� ���� ���� �� ��ȭ�� ���� �ϸ� �����Ͽ��� ��. */

public class NestedLoopTest {

	public static void main(String[] args) {
		
		// 1. for���� ���� ������ �����ϱ�.
		int dan = 2;
		int count = 1;
		
//		for(; dan <= 9; dan++) {
//			
//			for(count=1; count<=9; count++) {
//				
//				System.out.println(dan + "X" + count + "=" + dan*count);
//			}
//			
//			System.out.println();
//		}
		
		// 2. while���� ���� ������ �����ϱ�. 
		//    - while �� 2�� �ݺ����� �� ���� �ʱ�ȭ�� �ѹ� �� ��������� üũ�� ��.
		dan = 2;
		count = 1;
		
		while(dan <= 9) {
			
			count = 1; //�ʱ�ȭ�� �����ָ� 2�ܸ� ��.
			while(count <= 9) {
				System.out.println(dan + "X" + count + "=" + dan*count);
				count++;
			}
			dan++;
		}
	}
}
