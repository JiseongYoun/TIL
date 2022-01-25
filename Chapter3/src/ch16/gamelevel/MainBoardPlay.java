package ch16.gamelevel;
/* Player가 있고 Player는 GameLevel속성을 가집니다. 각 GameLevel단계마다 run(), jump(), turn() 세 가지 기능이 업그레이드 됩니다.
  1. 초보자 레벨 : 천천히 달립니다. run()만 가능.
  2. 중급자 레벨 : 빠르게 달리고, 점프할 수 있습니다. run(), jump()가능.
  3. 고급자 레벨 : 엄청 빠르게 달리고, 높게 점프하고, 턴 할 수 있습니다. run(), jump(), turn() 가능
  - Player는 한번에 하나의 레벨 상태만을 가질 수 있습니다.
  - Player가 play()중에 레벨에 있는 go(int count)라는 메서드를 호출하면 run()하고 count횟수만큼 jump()하고 turn()합니다. */

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
