package decorator;

public interface RowingBoat {
	void row();
}
class FishingBoat{
	public void sail() {
		System.out.println("The Fishing is sailing");
	}
}