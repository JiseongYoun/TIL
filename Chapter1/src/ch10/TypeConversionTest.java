package ch10;
// 10. ����ȯ

public class TypeConversionTest {

	public static void main(String[] args) {
		
		/*int iNum = 255;
		byte bNum = (byte)iNum;
		
		System.out.println(bNum);
		
		//10�� �����ϸ� �� ��µ�����, 255�� ������ -1�� ���.
		//1����Ʈ�� �� ǥ���Ҽ� ���� range�� ���� ���� casting �ؼ� ���� ������ ���� �̻��ϰ� ����.
		
		double dNum = 3.14;
		int inum = (int)dNum;
		
		System.out.println(inum);
		
		//3�� ���. �Ҽ��� ���� ������.
		 
		 */
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		// 1 �� 0�� ���ؼ� 1�� ���
		System.out.println(iNum2);
		// 2.1 �� �ǰ� �ٽ� int�� �ٲ��� 2�� ���.

	}

}
