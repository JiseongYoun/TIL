package ch09;
// java 는 처음에 쓴 데이터형을 그대로 쓴다. 바꿀수 없음.

public class LocalVariableInter {

	public static void main(String[] args) {
		
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		//출력될 값이 상단의 str의 값일거라 추론해서 test라는 결과값이 나옴.
		
	}

}
