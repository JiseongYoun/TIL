package ch19;
// 19. �ݺ��� - for ��
/* for (�ʱ�ȭ��; ���ǽ�; ������;){
 *       ���๮;
 *       .....
 *      } 
 */

public class ForTest {

	public static void main(String[] args) {
		
		// 1. for���� ���� 1���� 10���� ���� ��� ����ϱ�.
		int count = 1;
		int sum = 0;
		
		for(int i=0; i<10; i++, count++) {
			sum += count;
			
		}
		System.out.println(sum);
		
		
		// 2. while���� ���� 1���� 10���� ���� ��� ����ϱ�.
		int num = 1;  //�ʱ�ȭ�� �ٱ� �������� ����.
		int total = 0;
		
		while(num<=10) {
			total+= num;
			num++;
		}
		System.out.println(total);
	}

}
