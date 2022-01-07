package ch18;
/* 18. static ���� - �̱��� ����(singleton pattern)
/ �̱��� �����̶�?
 - ���α׷����� �ν��Ͻ��� �� �� ���� �����Ǿ�� �ϴ� ��� ����ϴ� ������ ����
 - static ����, �޼��带 Ȱ���Ͽ� ���� �� �� ����
 
 ȸ�� ��ü�� �����ؾ���. */

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	// �ܺο��� ����Ҽ� �ְ� static���� ����.
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}

}
