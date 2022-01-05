package ch10;
// 10. 접근 제어 지시자와 정보은닉
// private : 같은 클래스 내부에서만 접근 가능(외부 클래스, 상속 관계의 클래스에서도 접근 불가)
// 마우스 오른쪽클릭 -> source -> Generate Getters and Setters.

public class BirthDay {
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if ( month < 1 || month > 12) {
			isValid = false;
		} else
		isValid = true;
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜 입니다.");	
		}
	}
	

}
