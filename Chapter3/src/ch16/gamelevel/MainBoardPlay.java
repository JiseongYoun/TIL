package ch16.gamelevel;
/* Player�� �ְ� Player�� GameLevel�Ӽ��� �����ϴ�. �� GameLevel�ܰ踶�� run(), jump(), turn() �� ���� ����� ���׷��̵� �˴ϴ�.
  1. �ʺ��� ���� : õõ�� �޸��ϴ�. run()�� ����.
  2. �߱��� ���� : ������ �޸���, ������ �� �ֽ��ϴ�. run(), jump()����.
  3. ����� ���� : ��û ������ �޸���, ���� �����ϰ�, �� �� �� �ֽ��ϴ�. run(), jump(), turn() ����
  - Player�� �ѹ��� �ϳ��� ���� ���¸��� ���� �� �ֽ��ϴ�.
  - Player�� play()�߿� ������ �ִ� go(int count)��� �޼��带 ȣ���ϸ� run()�ϰ� countȽ����ŭ jump()�ϰ� turn()�մϴ�. */

public class MainBoardPlay {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);

	}

}
