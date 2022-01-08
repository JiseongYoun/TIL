package ch20;
/* 20. 자료를 순차적으로 한꺼번에 관리하는 방법 - 배열(array)
 배열이란 ?
 - 동일한 자료형의 순차적 자료 구조
 - 인덱스 연산자 [] 를 이용하여 빠른 참조가 가능
 - 물리적 위치와 논리적 위치가 동일
 - 배열의 순서는 0부터 시작
 - 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함 
 배열 선언방법
 
 int [] arr1 = new int[10];
 int arr2[] = new int[10]*/

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10]; //new 키워드를 써서 초기화함. 
		// 초기화를 직접사용해서 하단의 for문을 사용하지 않아도됌.
		// int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		
		for(int i=0, num=1; i<arr.length; i++) {
			arr[i] = num++;
		}
		// 향상된 for문 사용
		// 처음부터 끝까지 돌때. 처음부터 n-1 까지 순회할때 씀. 
		// 작성법 : 앞에는 그 element의 데이터타입과 변수를 적고 콜롬작성.
		for(int num : arr) {
			total += num;
		}
		System.out.println(total);
	}

}
