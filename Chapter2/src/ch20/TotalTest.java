package ch20;

public class TotalTest {

	public static void main(String[] args) {
		
/*		double[] dArr = new double[5];
//		
//		dArr[0] = 1.1;
//		dArr[1] = 2.1;
//		dArr[2] = 3.1;
//		
//		double mtotal = 1;
//		for(int i=0; i<dArr.length; i++) {
//			mtotal *= dArr[i];
//		}
//		System.out.println(mtotal);
//		}
	  // �ε����� ���ڸ� �ְ� �� ������ ���� ���� ���Ϸ�����.
	  // but �迭�� ���̴� 20 ����Ʈ�ε�, �ݺ����� ����(length)���� ���Ϸ��� �Ͽ����� ������ ��ҵ��� 0�̱� ������ 0���� ���.
	   * ���: �迭�� ���̿� ����� ������ �������� ���� �� �ִ�. */
		
		double[] dArr = new double[5];
		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		
		double mtotal = 1;
		for(int i=0; i<count; i++) {
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);

	}

}
