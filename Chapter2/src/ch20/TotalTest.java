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
	  // 인덱스에 숫자를 넣고 그 숫자의 곱한 값을 구하려고함.
	  // but 배열의 길이는 20 바이트인데, 반복문을 통해(length)전부 곱하려고 하였더니 나머지 요소들은 0이기 때문에 0으로 출력됌.
	   * 요약: 배열의 길이와 요소의 개수는 동일하지 않을 수 있다. */
		
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
