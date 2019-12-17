package decorator;

public class hello {
	public static void main(String[] args) {
		var troll = new SimpleTroll();
		troll.attack();
		troll.fleeBattle();
		
		var clubbedTroll = new ClubbedTroll(troll);
		clubbedTroll.attack();
		clubbedTroll.fleeBattle();
		System.out.println("Result: "+clubbedTroll.getAttackBattle());
	}

}
