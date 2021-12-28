package ch08;

public class personTest{
	
	public static void main(String[] args) {
		
//		Person personInfo = new Person();
//		
//		personInfo.personTall = "180";
//		personInfo.personHeight = "78";
//		personInfo.personGender = "남성";
//		personInfo.personName = "Tomas";
//		personInfo.personAge = "37";
//		
//		System.out.println(personInfo.showPerson());
		
		Person personInfo = new Person("180", "78", "남성", "Tomas", "37");
		System.out.println(personInfo.showPerson());
		
	}
	
}