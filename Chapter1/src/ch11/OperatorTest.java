package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
//		int lastScore = ++gameScore; // gameScore += 1; gameScore = gameScore +1;
//		int lastScore = gameScore++;
		int lastScore = --gameScore;
		
		System.out.println(lastScore); //151 ÀÌ Ãâ·Â‰Î.
		System.out.println(gameScore);

	}

}
