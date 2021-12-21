package ch08;

//문자도 정수로 표현한다.
//어떤 문자를 컴퓨터 내부에서 표현하기 위해 특정 정수 값을 정의
//A의 ASKII code는 65
//ASKII code: 알파벳과 숫자 특수 문자등을 1바이트에 표현하는데 사용하는 문자세트
public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		//ASKII code로 출력해봄.
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		//ASKII code로 출력해봄.
		System.out.println((char)ch3);
		
		
		//UNICODE 로 표현하기.
		//UNICODE: 전 세계 표준으로 만든 문자 세트
        //UNICODE 로 작성시 앞에 슬러시u를 붙여준다.
		char han = '한';
		char ch = '\uD55C'; //16진수
		
		System.out.println(han);
		System.out.println(ch);

	}

}
