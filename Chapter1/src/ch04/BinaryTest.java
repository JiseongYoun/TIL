package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		
		// 10 이라는 숫자를 다양한 진법으로 표현하여 출력하기. 
		int num = 10;
		int bNum = 0B1010;
		// 2진수로 표현. 0B 로 쓰면 뒤에 나오는 숫자는 2진수라는 뜻.
		int oNum = 012;
		// 8진수로 표현. 12로 쓰면 숫자 12가 되기때문에, 0을 앞에 넣어주면 8진수가 됌.
        int xNum = 0XA;
        // 16진수로 표현.
        
        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum);;
	}

}
