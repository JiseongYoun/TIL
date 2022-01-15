package ch08;
/* 06. 다형성과 다형성을 사용하는 이유
다형성(polymorphism) 이란?
 - 하나의 코드가 여러 자료형으로 구현되어 실행되는 것.
 - 같은 코드에서 여러 다른 실행 결과가 나옴.
 - 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임.
 - 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수 있음. */
import java.util.ArrayList;

// -- 상위 클래스(공통적으로 쓸수있는 메서드가 있을때에는 상위클래스에서 선언. 하위클래스에서 사용할 수 있도록 함. ) -- //
class Animal {
	
	public void move() { 
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		
		
	}
}

// -- 하위 클래스 -- //

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펼고 날아다닙니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
      	AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
		test.testDownCasting(animalList);

	}
	// -- 다운 캐스팅 -- /
	public void testDownCasting(ArrayList<Animal> list) {
		
		for(int i=0; i<list.size(); i++) {
			
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("unsupported type.");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		// animal.readBook 호출할수없음.  
	}

}
