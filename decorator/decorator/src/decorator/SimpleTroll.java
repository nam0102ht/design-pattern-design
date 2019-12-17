package decorator;

public class SimpleTroll implements Troll {

	@Override
	public void attack() {
		System.out.println("The troll to grab you!");
		
	}

	@Override
	public void fleeBattle() {
		System.out.println("The troll shrieks in horror and runs away!");
	}

	@Override
	public int getAttackBattle() {
		return 10;
	}

}
