package ch03;

public class StringTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java)); // 두개의 주소값이다름 .
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java)); // 두개의 주소값이 다름. 메모리가 계속되기 때문에 StringBuilder, StringBuffer 활용해야함.

	}

}
