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
		return "Ű�� " + personTall + "�̰�, " + "�����԰� " + personHeight + "ų���� " + personGender + "�� �ֽ��ϴ�." + "�̸��� " + personName + "�̰�, " + "���̴� " +  personAge + "�� �Դϴ�.";
	}

}
