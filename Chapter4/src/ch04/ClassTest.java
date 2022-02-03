package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
						ClassNotFoundException, NoSuchMethodException, SecurityException {
		Person person = new Person("James");
		System.out.println(person);
		
		Class c1 = Class.forName("ch04.Person");
		Person person1 = (Person)c1.newInstance();
		System.out.println(person1);
		
		// relection포로그래밍 : 25번째줄 코딩한 것과 동일함. 
		// local에 person이 없을때 사용하는 방법.
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"김유신"};
		Person personLee = (Person)cons.newInstance(initargs);
		System.out.println(personLee);
		
		Person kim2 = new Person("Kim");
	}
}