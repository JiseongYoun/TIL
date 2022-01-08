//23. 객체 배열을 구현한 클래스 ArrayList -> java.util 패키지에서 제공됨.

package ch23;

import java.util.ArrayList;

import ch21.Book;  // ctrl + shift + o 단축키 import.

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
		
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}

	}

}
