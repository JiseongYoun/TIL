package ch07;

public class UserInfoTest {
	
	public static void matin(String[] args) {
		
//		// UserInfo�� userLee �����ڸ� ����.
//		UserInfo userLee = new UserInfo();
//		
//		userLee.userId = "a12345";
//		userLee.userPassword = "pw12345";
//		userLee.userName = "Lee";
//		userLee.userAddress = "Seoul, Korea";
//		userLee.phoneNumber = "01012345678";
//		
//		System.out.println(userLee.showUserInfo());
		
		// �Ű������� �ٷ� �� �־ ���.
		UserInfo userKim = new UserInfo("id12345", "pw12345", "Kim");
		System.out.println(userKim.showUserInfo());
		
	}

}
