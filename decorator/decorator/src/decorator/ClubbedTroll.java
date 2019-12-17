package decorator;

public class ClubbedTroll implements Troll {
	private Troll troll;
	
	public ClubbedTroll(Troll troll) {
		this.troll = troll;
	}
	@Override
	public void attack() {
		troll.attack();
		System.out.println("The troll swings at you with a club!");
	}

	@Override
	public void fleeBattle() {
		troll.fleeBattle();
	}

	@Override
	public int getAttackBattle() {
		return this.troll.getAttackBattle() + 10;
	}

}
