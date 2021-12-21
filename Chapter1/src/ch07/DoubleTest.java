package ch07;

public class DoubleTest {

	public static void main(String[] args) {
		
		// 자바에서는 실수의 기본 타입은 double을 사용한다.
		double dnum = 3.14;
		//뒤에 f를 붙여주면 float로 인식. '실수'가 담김.
		float fnum = 3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);

	}
}

// 부동 소수점 방식의 오류
// 지수와 가수로 나타내는 부동 소수점 방식에서는 지수부가 0을 표현할 수 없기 때문에 약간의 오차가 발생할 수 있다.
