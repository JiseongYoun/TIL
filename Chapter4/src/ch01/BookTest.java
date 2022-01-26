package ch01;

class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," +  author;
	}
}
public class BookTest {
	
	public static void main(String[] args) {
		
		Book book = new Book("데미안", "헤르만 헤세");
		
		System.out.println(book.toString()); // ch01.Book@5ed828d가 출력됨. (가상 메모리위치값)
		
		String str = new String("test");
		System.out.println(str.toString()); // test(문자열)가 출력됌. why ? toString이 오버라이딩됌.
		
	}

}
