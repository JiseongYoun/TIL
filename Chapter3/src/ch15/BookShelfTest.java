package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("����1");
		bookQueue.enQueue("����2");
		bookQueue.enQueue("����3");
		bookQueue.enQueue("����4");
		bookQueue.enQueue("����5");
		
		System.out.println(bookQueue.getSize()); // 5�� ��
		System.out.println(bookQueue.deQueue()); // 1�Ǿ� queue���� ���Ű���.
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());

	}

}
