package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {
		
		Student studentE = new Student("Edeward", 20000);
		Taxi kakaoTaxi = new Taxi("īī��");
		
		studentE.takeTaxi(kakaoTaxi);
		studentE.showInfo();
		kakaoTaxi.showTaxiInfo();
		
		

	}

}
