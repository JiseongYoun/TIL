package ch06;
//정수형 자료표현
public class VariableTest {

	public static void main(String[] args) {
		
		//byte 로 127까지 표현할 수 있음.
		//128로쓰면 오류남.
		byte bnum = 127;
		
		System.out.println(bnum);
		
		//int num = 12345678900; 숫자가 너무 길어서 오류남.
		
		//뒤에 L을 붙여주면 long type을 인식함. 형변환이 일어남.
		long lNum = 12345678900L;  
		
		System.out.println(lNum);

	}

}
