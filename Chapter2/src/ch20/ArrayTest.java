package ch20;
/* 20. �ڷḦ ���������� �Ѳ����� �����ϴ� ��� - �迭(array)
 �迭�̶� ?
 - ������ �ڷ����� ������ �ڷ� ����
 - �ε��� ������ [] �� �̿��Ͽ� ���� ������ ����
 - ������ ��ġ�� ���� ��ġ�� ����
 - �迭�� ������ 0���� ����
 - �ڹٿ����� ��ü �迭�� ������ ArrayList�� ���� Ȱ���� 
 �迭 ������
 
 int [] arr1 = new int[10];
 int arr2[] = new int[10]*/

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10]; //new Ű���带 �Ἥ �ʱ�ȭ��. 
		// �ʱ�ȭ�� ��������ؼ� �ϴ��� for���� ������� �ʾƵ���.
		// int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		
		for(int i=0, num=1; i<arr.length; i++) {
			arr[i] = num++;
		}
		// ���� for�� ���
		// ó������ ������ ����. ó������ n-1 ���� ��ȸ�Ҷ� ��. 
		// �ۼ��� : �տ��� �� element�� ������Ÿ�԰� ������ ���� �ݷ��ۼ�.
		for(int num : arr) {
			total += num;
		}
		System.out.println(total);
	}

}
