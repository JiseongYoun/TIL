package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("�¹���2", "������");
		library[2] = new Book("�¹���2", "������");
		library[3] = new Book("�¹���2", "������");
		library[4] = new Book("�¹���2", "������");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
//		System.out.println("== library ==");
//		for(Book book : library) {
//			System.out.println(book);
//			book.showInfo();
//		}
//		
//		System.out.println("== copy library ==");
//		for(Book book : copyLibrary) {
//			System.out.println(book);
//			book.showInfo();
//		}
		
		library[0].setAuthor("�ڿϼ�");  // 0��° ������Ʈ�� �ٲ㺽. ī���� ���̺귯���� ������ ���̺귯���� ���� �ٲ�. ���� ���� - �ּҰ� ���� ����. ��ü�� ���Ƶ��� ��� ���.
		library[0].setTitle("����");
		
		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== copy library ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}

	}

}
