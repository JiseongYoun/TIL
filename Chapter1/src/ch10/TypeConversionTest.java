package ch10;
// 10. 형변환

public class TypeConversionTest {

	public static void main(String[] args) {
		
		/*int iNum = 255;
		byte bNum = (byte)iNum;
		
		System.out.println(bNum);
		
		//10을 선언하면 잘 출력돼지만, 255를 넣으면 -1이 출력됌.
		//1바이트로 다 표현할수 없는 range의 값이 강제 casting 해서 들어갔기 때문에 값이 이상하게 나옴.
		
		double dNum = 3.14;
		int inum = (int)dNum;
		
		System.out.println(inum);
		
		//3이 출력됌. 소수점 이하 버려짐.
		 
		 */
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		// 1 과 0을 더해서 1이 출력
		System.out.println(iNum2);
		// 2.1 이 되고 다시 int로 바껴서 2가 출력됌.

	}

}
