package ch08;

public class Person {
	
	public String personTall;
	public String personHeight;
	public String personGender;
	public String personName;
	public String personAge;
	
	public Person() {}
	
	public Person(String personTall, String personHeight, String personGender, String personName, String personAge) {
		this.personTall = personTall;
		this.personHeight = personHeight;
		this.personGender = personGender;
		this.personName = personName;
		this.personAge = personAge;
	}
	
	public String showPerson(){
		return "키가 " + personTall + "이고, " + "몸무게가 " + personHeight + "킬로인 " + personGender + "이 있습니다." + "이름은 " + personName + "이고, " + "나이는 " +  personAge + "세 입니다.";
	}

}
