package ch08;

public class personTest{
	
	public static void main(String[] args) {
		
//		Person personInfo = new Person();
//		
//		personInfo.personTall = "180";
//		personInfo.personHeight = "78";
//		personInfo.personGender = "����";
//		personInfo.personName = "Tomas";
//		personInfo.personAge = "37";
//		
//		System.out.println(personInfo.showPerson());
		
		Person personInfo = new Person("180", "78", "����", "Tomas", "37");
		System.out.println(personInfo.showPerson());
		
	}
	
}