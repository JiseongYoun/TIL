package ch08;

//���ڵ� ������ ǥ���Ѵ�.
//� ���ڸ� ��ǻ�� ���ο��� ǥ���ϱ� ���� Ư�� ���� ���� ����
//A�� ASKII code�� 65
//ASKII code: ���ĺ��� ���� Ư�� ���ڵ��� 1����Ʈ�� ǥ���ϴµ� ����ϴ� ���ڼ�Ʈ
public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		//ASKII code�� ����غ�.
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		//ASKII code�� ����غ�.
		System.out.println((char)ch3);
		
		
		//UNICODE �� ǥ���ϱ�.
		//UNICODE: �� ���� ǥ������ ���� ���� ��Ʈ
        //UNICODE �� �ۼ��� �տ� ������u�� �ٿ��ش�.
		char han = '��';
		char ch = '\uD55C'; //16����
		
		System.out.println(han);
		System.out.println(ch);

	}

}
